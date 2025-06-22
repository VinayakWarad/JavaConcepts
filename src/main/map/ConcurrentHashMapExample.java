package main.map;
import java.util.concurrent.ConcurrentHashMap;

    public class ConcurrentHashMapExample {
        public static void main(String[] args) {
            ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

            map.put("Alice", 30);
            map.put("Bob", 25);

            // Concurrent read and write operations can be done safely
            map.putIfAbsent("Charlie", 20); // Adds only if "Charlie" is absent

            System.out.println(map.get("Alice"));  // 30

            // Iteration (weakly consistent)
            map.forEach((key, value) -> {
                System.out.println(key + " => " + value);
            });
        }
    }

