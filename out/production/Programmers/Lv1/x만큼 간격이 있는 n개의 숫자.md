# x만큼 간격이 있는 n개의 숫자

## 문제 설명
함수 `solution`은 정수 `x`와 자연수 `n`을 입력 받아, `x`부터 시작해 `x`씩 증가하는 숫자를 `n`개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, `solution`을 완성해주세요.

## 제한 사항
- `x`는 `-10000000` 이상, `10000000` 이하인 정수입니다.
- `n`은 `1000` 이하인 자연수입니다.

## 코드
```java
class Solution {
    public long[] solution(int x, int n) {
        long[] arr = new long[n];
        long newX = x;
        
        for (int i = 0; i < n; i++) {
            arr[i] = newX;
            newX = newX + x;
        }
        
        return arr;
    }
}
```