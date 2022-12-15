import java.util.Random;

public class MergeSorting {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(100);
        }
        System.out.println("Before: ");
        PrintArray(arr);
        MergeSort(arr);
        System.out.println("\nAfter: ");
        PrintArray(arr);
        }

        public static void PrintArray(int[] arr){
            for (int i = 0; i < arr.length; i++){
                if (i == 0)
                    System.out.print(arr[i]);
                else
                    System.out.print(" " + arr[i]);
            }
        }

        public static void MergeSort(int[] arr){
            int arrayLength = arr.length;
            int midIndex = arrayLength / 2;
            int[] leftHalf = new int[midIndex];
            int[] rightHalf = new int[arrayLength - midIndex];
            
            if(arrayLength < 2)
                return; 
            
            for (int i = 0; i < midIndex; i++) {
                leftHalf[i] = arr[i];
            }
            for (int i = midIndex; i < arrayLength; i++) {
                rightHalf[i - midIndex] = arr[i];
            }

            MergeSort(leftHalf);
            MergeSort(rightHalf);
            Merge(arr, rightHalf, leftHalf);
        }

        public static void Merge(int[] arr, int[] rHalf, int[] lHalf){
            int rightSize = rHalf.length;
            int leftSize = lHalf.length;
            int i = 0, j = 0, k = 0;

            while (i < leftSize && j < rightSize) {
                if (lHalf[i] <= rHalf[j]){
                    arr[k] = lHalf[i];
                    i++;
                }
                else{
                    arr[k] = rHalf[j];
                    j++;
                }
                k++;
            }

            while (i < leftSize) {
                arr[k] = lHalf[i];
                i++;
                k++;
            }
            while (j < rightSize) {
                arr[k] = rHalf[j];
                j++;
                k++;
            }
        }
}
