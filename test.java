import java.util.*;

public class test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);

        list.sort(Comparator.naturalOrder());
        list.sort(Comparator.reverseOrder());

        Arrays.sort(arr);

        System.out.println(list);
    }
}