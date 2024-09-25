# N개의 최소공배수

## 문제 설명
두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다. 예를 들어 2와 7의 최소공배수는 14가 됩니다. 정의를 확장해서, `n`개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다. `n`개의 숫자를 담은 배열 `arr`이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, `solution`을 완성해 주세요.

## 제한 사항
- `arr`은 길이 1이상, 15이하인 배열입니다.
- `arr`의 원소는 100 이하인 자연수입니다.

## 코드
```java
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int count = 1;
        boolean isLcm = false;
        
        while (answer == 0) {
            int lcm = arr[arr.length - 1] * count;
            for (int i = 0; i < arr.length - 1; i++) {
                isLcm = lcm % arr[i] == 0 ? true : false;
                
                if (!isLcm) {
                    break;
                }
            }
            
            count++;
            answer = isLcm ? lcm : 0;
        }
        
        return answer;
    }
}
```