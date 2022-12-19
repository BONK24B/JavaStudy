package HW4;

import java.util.LinkedList;
import java.util.Scanner;

public class ListQueue {
    // Реализуйте очередь с помощью LinkedList со следующими методами:
    // enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
    //  first() - возвращает первый элемент из очереди, не удаляя.

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("bebebe");
        list.add("sas");
        First(list);
        Dequeue(list);
        Enqueue(list);
        System.out.println(list);
    }

    public static void First(LinkedList<String> myList){
        System.out.println(myList.get(0));
    }
    public static void Dequeue(LinkedList<String> myList){
        System.out.println(myList.get(0));
        myList.remove(0);
    }
    public static void Enqueue(LinkedList<String> myList){
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();
        myList.add(line);
    }
}
