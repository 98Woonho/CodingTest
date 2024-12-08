# K번째수

## 문제 설명
배열 `array`의 `i`번째 숫자부터 `j`번째 숫자까지 자르고 정렬했을 때, `k`번째에 있는 수를 구하려 합니다.

예를 들어 `array`가 `[1, 5, 2, 6, 3, 7, 4]`, `i = 2`, `j = 5`, `k = 3`이라면

1. `array`의 `2`번째부터 `5`번째까지 자르면 `[5, 2, 6, 3]`입니다.
2. `1`에서 나온 배열을 정렬하면 `[2, 3, 5, 6]`입니다.
3. `2`에서 나온 배열의 `3`번째 숫자는 `5`입니다.

배열 `array`, `[i, j, k]`를 원소로 가진 2차원 배열 `commands`가 매개변수로 주어질 때, `commands`의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 `solution` 함수를 작성해주세요.

## 제한 사항
- `array`의 길이는 `1` 이상 `100` 이하입니다.
- `array`의 각 원소는 `1` 이상 `100` 이하입니다.
- `commands`의 길이는 `1` 이상 `50` 이하입니다.
- `commands`의 각 원소는 길이가 `3`입니다.

## 코드

```java
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            // Arrays.copyOfRange([배열], 시작 index, 끝 index) : [배열]에서 시작 index 부터 끝 index - 1 까지의 배열을 복사하여 반환
            int[] newArr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            
            // Arrays.sort([배열]) : [배열]을 오름차순 정렬
            Arrays.sort(newArr);
            
            answer[i] = newArr[commands[i][2] - 1];
        }
        
        return answer;
    }
}
```