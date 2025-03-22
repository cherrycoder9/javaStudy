import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("001", "떡볶이");
        map.put("002", "어묵");
        map.put("003", "고추장");

        map.put("001", "양파");

        System.out.println(map.size()); // 3
        System.out.println(map.get("001")); // 양파

        System.out.println(map.keySet());

        Set<String> keys = map.keySet();
        Iterator<String> iter = keys.iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
