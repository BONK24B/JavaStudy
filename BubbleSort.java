import java.util.Random;
import java.util.logging.*;

public class BubbleSort {
    // Реализуйте алгоритм сортировки пузырьком числового массива,
    // результат после каждой итерации запишите в лог-файл.
    public static void main(String[] args) {
        int arr[] = new int[10];

        System.out.println("Before: ");
        FillArray(arr);
        PrintArray(arr);
        System.out.println("\nAfter: ");
        ArraySort(arr);
        PrintArray(arr);
    }

    public static int[] FillArray(int[] array){
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1, 20);
        }

        return array;
    }

    public static void PrintArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1){
                System.out.print(array[i]);
            }
            else
                System.out.print(array[i] + " ");
        }
    }

    public static int[] ArraySort(int[] array){
        boolean swapped = true;
        Logger log = Logger.getLogger(BubbleSort.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        log.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);

        while (swapped){
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]){
                    swapped = true;
                    log.info("swapping " + array[i] + " with " + array[i + 1]);
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
        }
        }
        return array;
    }
}
