# 문자열 내 p와 y의 숫자 개수

## 문제 설명
대문자와 소문자가 섞여있는 문자열 `s`가 주어집니다. `s`에 `p`의 개수와 `y`의 개수를 비교해 같으면 `True`, 다르면 `False`를 return 하는 solution를 완성하세요. `p`, `y` 모두 하나도 없는 경우는 항상 `True`를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

예를 들어 `s`가 `pPoooyY`면 `true`를 return하고 `Pyy`라면 `false`를 return합니다.

## 제한 사항
- 문자열 `s`의 길이 : 50 이하의 자연수
- 문자열 `s`는 알파벳으로만 이루어져 있습니다.

## 코드
```java
import java.util.*;

class Solution {
    boolean solution(String s) {
        char[] arr = s.toCharArray(); // 문자열을 문자 배열로 변환
        
        int pCount = 0;
        int yCount = 0;
        
        for (char c : arr) {
            if (c == 'p' || c == 'P') {
                pCount++;
            }
            if (c == 'y' || c == 'Y') {
                yCount++;
            }
        }
        
        if (pCount != yCount) {
            return false;
        }
        
        return true;
    }
}
```