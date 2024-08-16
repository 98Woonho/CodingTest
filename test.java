import java.util.*;

import static java.util.Arrays.asList;

public class test {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}};

        int num = 1;

        List<int[]> list1 = new ArrayList<>();

        List<int[]> list = new ArrayList<>(Arrays.asList(arr));

        list.sort(Comparator.comparingInt(a -> a[num]));
    }
}
