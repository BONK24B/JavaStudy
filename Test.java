import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    // Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
    //  который запишет эту строку в простой текстовый файл, обработайте исключения.
    public static void main(String[] args){
        String test = "TEST";

        System.out.println(WordMultiplier(test));
        WordMultiplier(test);
        Writer(test);
    }

    public static String WordMultiplier(String text){
        String helper = "\n" + text;
        for (int i = 1; i < 100; i++) {
            text += helper;
        }

        return text;
    }

    public static void Writer(String text){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write(WordMultiplier(text));
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
