import java.util.*;

public class test {
    public static void main(String[] args) {

        System.out.println(fibonacci(100000));
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int a = fibonacci(n - 1) % 1234567;
        int b = fibonacci(n - 2) % 1234567;

        return (a + b) % 1234567;
    }
}