package HW5;

import java.util.ArrayList;
import java.util.TreeSet;

// Пусть дан список сотрудников:Иван Иванов ( и остальные, полный текст дз будет на платформе)
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
//  Отсортировать по убыванию популярности.
public class Employees {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();

        employees.add("Ivan Ivanov");
        employees.add("Andrej Petrov");
        employees.add("Konstantin Alekseev");
        employees.add("Andrej Petrov");
        employees.add("Grigorij Pobedinskij");
        employees.add("Ivan Ivanov");
        employees.add("Andrej Petrov");
        employees.add("Vladislav Bajan");
        employees.add("Grigorij Pobedinskij");
        employees.add("Oleg Belov");

        ArrayList<String> list2 = new ArrayList<String>(new TreeSet<String>(employees));
        
        System.out.println(list2);
        System.out.println(employees);
        System.out.println(Repeat(employees));
    }

    public static ArrayList<String> Repeat(ArrayList<String> emp){
        ArrayList<String> rep = new ArrayList<>();

        for (int i = 0; i < emp.size(); i++) {
            int count = 0;

            for (int j = 0; j < emp.size(); j++) {
                if (emp.get(i).equals(emp.get(j))){
                    count += 1;
                }
            }
            rep.add(emp.get(i) + " : " + count);
        }

        for (int i = 0; i < rep.size(); i++) {
            int count = 0;
            for (int j = 0; j < rep.size(); j++) {
                if (rep.get(i).equals(rep.get(j))) {
                    count += 1;
                    if (count > 1) {
                        rep.remove(j);
                        j--;
                    }
                }
            }
        }
        return rep;
    } 

    // public static ArrayList<String> PopularitySort(ArrayList<String> list){
    //     ArrayList<String> list2 = new  ArrayList<>();

    //      for(int i=0;i<list.size();i++)
    //      {
    //          if(!list2.contains(list.get(i)))
    //          {
    //              list2.add(list.get(i));
    //          }

    //      }
    //     return list2;
    // }
}
