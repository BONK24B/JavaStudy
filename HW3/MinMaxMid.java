package HW3;
import java.util.ArrayList;
import java.util.Random;

public class MinMaxMid {
    // Задан целочисленный список ArrayList. Найти минимальное,
    // максимальное и среднее из этого списка.
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            list.add(rand.nextInt(20));
        }
        
        int min = list.get(0), max = list.get(0);

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }

            if (list.get(i) > max){
                max = list.get(i);
            }
        }

        int mid = (max + min) / 2;

        System.out.println(list);
        System.out.println(min);
        System.out.println(max);
        System.out.println(mid);
    }
}
