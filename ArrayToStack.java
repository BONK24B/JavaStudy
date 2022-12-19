import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ArrayToStack {
//     Написать метод, который принимает массив элементов,
//      помещает их в стэк и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов,
//  помещает их в очередь и выводит на консоль содержимое очереди
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 8, 8};
        System.out.println(ToStack(arr));
        System.out.println(ToQueue(arr));
    }

    public static Stack<Integer> ToStack(int[] arr){
        Stack<Integer> myStack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            myStack.add(arr[i]);
        }

        return myStack;
    } 

    public static Queue<Integer> ToQueue(int[] arr){
        Queue<Integer> myQueue = new LinkedList<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
            myQueue.offer(arr[i]);
        }

        return myQueue;
    }
}
