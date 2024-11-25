import java.util.*;

public class test {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2},{3,5},{2,4}};

        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
    }
}