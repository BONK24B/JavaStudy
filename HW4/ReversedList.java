package HW4;

import java.util.LinkedList;
import java.util.Scanner;

public class ReversedList {
    // Пусть дан LinkedList с несколькими элементами.
    //  Реализуйте метод, который вернет “перевернутый” список.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = "";
        LinkedList<String> list = new LinkedList<>();
        System.out.println("Enter anything to your list or type exit to stop");

        while(true){
            if(!line.equals("exit")){
                line = scanner.nextLine();
                list.add(line);
            }
            else
                break;
        }
        scanner.close();
        list.removeLast();
        System.out.println("Before:");
        System.out.println(list);
        System.out.println("After:");
        System.out.println(Reverse(list));
    }

    public static LinkedList<String> Reverse(LinkedList<String> myList){
        LinkedList<String> listHelper = new LinkedList<>();
        for (int i = myList.size() - 1; i >= 0; i--) {
            listHelper.add(myList.get(i));
        }

        return listHelper;
    }
}
