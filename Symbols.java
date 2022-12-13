import java.util.Scanner;

public class Symbols {

    // Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
    //  которая состоит из чередующихся символов c1 и c2, начиная с c1.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите чётное положительное число");
        int n = scanner.nextInt();
        scanner.close();

        if (n > 0 && n % 2 == 0){
            SymbolsOrder(n);
        }
        else{
            System.out.println("Ошибка ввода");
        }
        
    }

    static void SymbolsOrder(int n){
        int counter = 0;
        char c1 = 'a';
        char c2 = 'b';
        StringBuilder sb = new StringBuilder();

        while (counter < n){
            if (counter % 2 == 0){
                sb.append(c1);
            }
            else{
                sb.append(c2);
            }
            counter++;
        }

        System.out.println(sb);
    }
}
