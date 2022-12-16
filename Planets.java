import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Planets {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Earth");
        planets.add("Saturn");
        planets.add("Venus");
        planets.add("Mercury");
        planets.add("Neptune");
        planets.add("Mars");
        planets.add("Earth");
        planets.add("Uranus");
        planets.add("Jupiter");
        planets.add("Neptune");

        System.out.println("Original:");
        System.out.println(planets);

        List<String> uniqueNames = planets.stream().distinct().collect(Collectors.toList());

        System.out.println("Unique only: ");
        System.out.println(uniqueNames);

        ArrayList<String> planetCounter = new ArrayList<>();

        for (int i = 0; i < planets.size(); i++) {
            int count = 0;
            for (int j = 0; j < planets.size(); j++) {
                if(planets.get(j).equals(planets.get(i)))
                    count++;
            }
            if (!planetCounter.contains(planets.get(i)))
                    planetCounter.add(planets.get(i) + " " + count);
        }
        System.out.println(planetCounter);
    }

}
