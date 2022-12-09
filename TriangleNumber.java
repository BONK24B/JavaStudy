import java.util.Scanner;

//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class TriangleNumber {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Треугольное число: " + Triangle(n));
        System.out.println("Факториал: " + Factorial(n));
    }

    static public int Triangle(int num){
        int res = 0;
        int count = 0;

        while (count <= num){
            res += count;
            count++;
        }

        return res;
    }

    static public int Factorial(int num){
        int res = 1;
        int count = 1;

        while (count <= num){
            res *= count;
            count++;
        }

        return res;
    }
}
