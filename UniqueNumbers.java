import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class UniqueNumbers {

// 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set
//  вычислите процент
//  уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        FillArray(nums);

        System.out.println(UniqueValues(nums));
    }

    public static void FillArray(ArrayList<Integer> list){
        Random rand = new Random();

        for (int i = 0; i < 1000; i++){
            list.add(rand.nextInt(0, 25));
        }
    }

    public static double UniqueValues(ArrayList<Integer> list){
        double unique = 0;
        Set<Integer> numbers = new HashSet<>(list);

        System.out.println(list.size());
        System.out.println(numbers.size());

        unique = (double)numbers.size() * 100 / (double)list.size();

        System.out.println(numbers);
        return unique;
    }
}
