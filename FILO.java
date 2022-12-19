import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FILO {
//     Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке,
//  а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String input = "";
        System.out.println("Enter any value: ");

        while(true){
            if (input.equals("exit")){
                list.remove("exit");
                break;
            }
                
            else{
                input = scanner.nextLine();
                list.add(input);
            }
        }
        scanner.close();

        for (int i = 0; i < list.size(); i++) {
            if(list.get(0).equals("print")){
                Collections.swap(list, 1, list.size() - 1);
                list.remove("print");
            }
            else if(list.get(list.size() - 1).equals("print")){
                Collections.swap(list, 0, list.size() - 2);
                list.remove("print");
            }
            else if(list.get(i).equals("print")){
                Collections.swap(list, 0, list.size() - 1);
                list.remove("print");
            }
            else if (list.get(i).equals("revert") && i != 0) {
                list.remove(list.get(i - 1));
                list.remove("revert");
            }
        }

        System.out.println(list);
    }
}
