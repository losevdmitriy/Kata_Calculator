import java.util.HashMap;
import java.util.Map;

abstract class RomeToArab {
    static int Convert(String rome){
        Map<String,Integer> romeToArab = new HashMap<>();
        romeToArab.put("I", 1);
        romeToArab.put("II", 2);
        romeToArab.put("III", 3);
        romeToArab.put("IV", 4);
        romeToArab.put("V", 5);
        romeToArab.put("VI", 6);
        romeToArab.put("VII", 7);
        romeToArab.put("VIII", 8);
        romeToArab.put("IX", 9);
        romeToArab.put("X", 10);

        int x = romeToArab.get(rome);
        return x;
    }
}
