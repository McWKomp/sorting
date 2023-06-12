package mainPackage.sortingAlgorithm;
public class sortTask {
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 22, 1, 0, 2, 100 };

        sortTask ob = new sortTask();
        ob.sort(arr);

        printArray(arr);
    }

    /*CODE IS NOT MINE, IT IS STOLEN*/

    /*Sort function takes only 1 arg which is *int* type Array with name "arr"
    and returns void*/
    void sort(int[] arr)
    {
        /*Then when the function called it creates variable "n" of *int* type which keeps value of Array "arr" length*/
        int n = arr.length;

        /*Here starts the cycle *for* and we create variable "i" of *int* type with start value of 1
        Cycle works until value of "i" is smaller than value of "n" which keeps value of "arr" length
        Type of increment is "++i", not the "i++"*/
        for (int i = 1; i < n; ++i) {

            /*Since variables below has been created IN cycle that means that each time cycle works
            variables would have new values*/

            /*As the cycle starts it creates variable "key" with type of *int* and which keeps item of
            Array "arr" with index of "i"*/
            int key = arr[i];

            /*Then it creates variable "j" with type of *int* which keeps value of variable "i" minus 1*/
            int j = i - 1;
            /*j = (1 - 1) = 0
            j = (2 - 1) = 1...*/

            /*Here starts cycle *while* and it takes two necessary conditions: variable "j" should be bigger
            or equal to zero AND value of item in Array "arr" with index "j" should be bigger than variable "key"
            which keeps value of item in Array "arr" with index "i" so the cycle works while these two conditions
            is true*/
            while (j >= 0 && arr[j] > key) {

                /*Then this cycle takes item in Array "arr" with index equal to CURRENT value of index "j" and adds 1 to CURRENT
                value of "j" so now item with index that bigger by 1 than "j" is #next item# in Array "arr". Then this
                #next item# takes value of item in Array "arr" with CURRENT index "j" as its OWN value*/
                arr[j + 1] = arr[j];

                /*Here variable "j" takes its OWN CURRENT value minus 1 as its OWN value and keeps it in itself*/
                j = j - 1;
            }
            /*When the *while* cycle is over then #next item# takes variable "key" which keeps value of item in Array
            "arr" with index "i" as its OWN value*/
            arr[j + 1] = key;
        }
    }

    static void printArray(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}