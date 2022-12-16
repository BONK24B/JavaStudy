import java.util.ArrayList;
import java.util.Random;

public class SortMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++){
            nums.add(rand.nextInt(10));
        }

        System.out.println(nums);
        nums.sort(null);
        System.out.println(nums);
    }
}
