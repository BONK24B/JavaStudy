import java.util.ArrayList;
import java.util.Random;

public class EvenDie {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            list.add(rand.nextInt(20));
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++){
            if (list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
