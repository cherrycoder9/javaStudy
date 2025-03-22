import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setExam {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();
        System.out.println(s1.size());

        boolean flag1 = s1.add("강");
        System.out.println(flag1);
        boolean flag2 = s1.add("바다");
        System.out.println(flag2);
        boolean flag3 = s1.add("강");
        System.out.println(flag3);

        System.out.println(s1.size());

        Iterator<String> iter = s1.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            System.out.println(str);
        }
    }
}
