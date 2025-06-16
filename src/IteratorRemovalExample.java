
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// When to use iterator and why can't we use iterator in few cases

    public class IteratorRemovalExample {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("Keep");
            list.add("RemoveMe");
            list.add("KeepToo");

            Iterator<String> it = list.iterator();

            while (it.hasNext()) {
                String s = it.next();
                if (s.equals("RemoveMe")) {
                    it.remove();  // Safe removal via Iterator
                }
            }

            System.out.println("After removal: " + list);
        }
    }

// Why ENhanced for loop is not supported in above scenario -> Below ex
 class EnhancedForLoopRemovalExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Keep");
        list.add("RemoveMe");
        list.add("KeepToo");

        for (String s : list) {
            if (s.equals("RemoveMe")) {
                list.remove(s);  // Throws ConcurrentModificationException!
            }
        }
    }
}
