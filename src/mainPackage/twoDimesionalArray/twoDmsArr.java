package mainPackage.twoDimesionalArray;

public class twoDmsArr {
    public static void main(String[] args) {
        int[][] intArray = new int[][]{{1, 3, 2}, {4, 5, 6}, {9, 7, 8}};

        task1(intArray);
        task2(intArray);
        task3(intArray);
        task4(intArray);
        task5(intArray);
    }

    //TASK 1
    public static void task1(int[][] arr){
        int sum = 0;

        //TASK notification
        System.out.print("TASK 1");
        for (int k = 0; k < 20; k++) {
            System.out.print(" - ");
        }
        System.out.println("");

        //Main part
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of all numbers in this array is "+sum);
    }

    //TASK 2
    public static void task2(int[][] arr){
        int max = arr[0][0];

        //TASK notification
        System.out.print("TASK 2");
        for (int k = 0; k < 20; k++) {
            System.out.print(" - ");
        }
        System.out.println("");

        //Main part
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>max){
                    max = arr[i][j];

                }
            }
        }
        System.out.println("The biggest number in array is "+max);
    }

    //TASK 3
    public static void task3(int[][] arr){
        int sumMain = 0;
        int sumSec = 0;

        //TASK notification
        System.out.print("TASK 3");
        for (int k = 0; k < 20; k++) {
            System.out.print(" - ");
        }
        System.out.println("");

        //Main part
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==j){
                    sumMain += arr[i][j];
                }

            }
        }
        System.out.println("The sum of main diagonal of array: "+sumMain);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if((i+j)==(arr.length-1)){
                    sumSec+=arr[i][j];
                }

            }
        }
        System.out.println("The sum of secondary diagonal of array: "+sumSec);
    }

    //TASK 4
    public static void task4(int[][] arr){
        int size = 0;
        int[] avgVal = new int[3];

        //TASK notification
        System.out.print("TASK 4");
        for (int k = 0; k < 20; k++) {
            System.out.print(" - ");
        }
        System.out.println("");

        //Main part
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            size = arr[i].length;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

            if (avgVal.length == size) {

                int[] tmp = new int[size * 2];
                for (int c = 0; c < size; c++) {
                    tmp[c] = avgVal[c];
                }
                avgVal= tmp;
            }
            avgVal[i] = sum/size;
            System.out.println("Average value in array number "+(i+1)+" is "+avgVal[i]);
            size++;

        }
        System.out.print("Array itself: ");
        for (int d = 0; d <= arr.length-1; d++) {
            String end = "";
            if(d==arr.length-1){
                end = ".";
                System.out.print(avgVal[d]+end);
            } else{
                end = ", ";
                System.out.print(avgVal[d]+end);
            }

        }
        System.out.println("");
    }

    //TASK 5
    public static void task5(int[][] arr){


        //TASK notification
        System.out.print("TASK 5");
        for (int k = 0; k < 20; k++) {
            System.out.print(" - ");
        }
        System.out.println("");

        //Main part
        for (int i = 0; i < arr.length; i++) {
            int dec=0;
            int inc=0;
            for (int j = 0; j < arr[i].length-1; j++) {
                if(arr[i][j]<=arr[i][j+1]){
                    inc++;
                } if (arr[i][j]>arr[i][j+1]){
                    dec++;
                }
            }
            if(inc == arr[i].length-1){
                System.out.println("The array with number "+(i+1)+" is monotonically increasing");
            } if (dec == arr[i].length-2) {
                System.out.println("The array with number "+(i+1)+" is NOT monotonically increasing");
            }

        }
    }
}



