import java.util.*;

public class test {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};

        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        String b = "abc";


        Set<Integer> hs = new HashSet<>();

        HashMap<String, Integer> hashMap = new HashMap<>();
    }
}
