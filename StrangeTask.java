import java.util.LinkedList;
import java.util.Scanner;

public class StrangeTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();
        String[] h = text.split("~");
        String line = h[0];
        int number = Integer.parseInt(h[1]);
        LinkedList<String> words = new LinkedList<>();
        words.add("ddd");
        words.add("getgetget");
        words.add("gotgotgot");

        if (line.equals("print"))
            words.remove(number);
        else
            words.add(number, line);

        System.out.println(words);

        // for (int i = 0; i < text.length(); i++) {
        //     if(Character.toString(text.charAt(i)).equals("~")){
        //         number = Integer.parseInt(Character.toString(text.charAt(i + 1)));
        //     }
        // }
        // System.out.println(number);
    }
}
