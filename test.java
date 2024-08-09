import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";

        for (int i = 0; i < X.length(); i++) {
            if (Y.indexOf(X.charAt(i)) >= 0) {
                answer += X.charAt(i);
                Y = Y.replaceFirst(String.valueOf(X.charAt(i)), "");
            }
        }

        char[] arr = answer.toCharArray();

        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] < arr[j]) {
                char temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j -= 1;
            }
        }

        answer = new String(arr);

        if (answer.equals("")) {
            answer = "-1";
        }

        if (answer.matches("0+")) {
            answer = "0";
        }

        return answer;
    }
}