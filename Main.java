import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            String[] values = br.readLine().split(" ");

            int x = Integer.parseInt(values[0]);
            int y = Integer.parseInt(values[1]);

            maxX = Math.max(maxX, x);
            maxY = Math.max(maxY, y);
            minX = Math.min(minX, x);
            minY = Math.min(minY, y);
        }

        System.out.println(N == 1 ? 0 : (maxX - minX) * (maxY - minY));

        br.close();
    }
}