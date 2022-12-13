import java.util.Scanner;

//Ввод строки
//Добавление каждого символа в массив
//

public class RLEAlg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String text = scanner.next();
        scanner.close();
        char first = text.charAt(0);
        int count = 0;
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < text.length(); i++){
            if (first == text.charAt(i)){
                count++;
            }
            else {
                if (count > 0)
                    res.append(first).append(count);
                count = 1;
                first = text.charAt(i);
            }
        }
        if (count > 0){
            res.append(first).append(count);
        }
        else{
            res.append(first);
        }
        System.out.println(res);
    }
}
