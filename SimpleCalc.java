import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num_1 = input.nextInt();
        System.out.println("Введите операцию (+, -, *, /): ");
        String operation = input.next();
        System.out.println("Введите второе число: ");
        int num_2 = input.nextInt();
        input.close();

        Calc(num_1, operation, num_2);
        
    }

    static public void Calc(int n1, String op, int n2){

        if (op.contains("+")){
            System.out.println(n1 + n2);
        }
        else if (op.contains("-")){
            System.out.println(n1 - n2);
        }
        else if (op.contains("*")){
            System.out.println(n1 * n2);
        }
        else if (op.contains("/")){
            if (n2 == 0){
                System.out.println("Делитель не может быть равен 0");
            }
            else{
                System.out.println(n1 / n2);
            }
        }
        else{
            System.out.println("Ошибка ввода оператора");
        }
    }
}
