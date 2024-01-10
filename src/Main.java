import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //initialization Map.of
        HashMap<Integer,String> gameMap = new HashMap<>(Map.of(
                1, "Destiny",
                2, "TitanFall",
                3, "HoI4"
        ));
        System.out.println(gameMap);

        //initialization Map.ofEntries()
        HashMap<String, String> capitalMap = new HashMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<String, String>("RM", "Roma"),
                new AbstractMap.SimpleEntry<String, String>("B", "Berlino"),
                new AbstractMap.SimpleEntry<String, String>("W", "Vienna")
        ));
        System.out.println(capitalMap);

        //initialization constructor + put
        HashMap<Integer, String> dogMap = new HashMap<Integer, String>();
        dogMap.put(1, "Setter");
        dogMap.put(2, "Bloodhound");
        dogMap.put(3, "Husky");
        System.out.println(dogMap);
    }
}
