import java.util.LinkedList;
import java.util.Random;

public class AddingTime {
    public static void main(String[] args) {
        Random rand = new Random();
        long startTime = System.nanoTime();
        LinkedList<Integer> nums = new LinkedList<>();

        for (int i = 0; i < 1000; i++){
            nums.add(rand.nextInt(9999));
        }

        System.out.println(System.nanoTime() - startTime);
    }
}
