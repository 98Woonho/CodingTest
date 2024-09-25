# JadenCase 문자열 만들기

## 문제 설명
JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)

문자열 `s`가 주어졌을 때, `s`를 JadenCase로 바꾼 문자열을 리턴하는 함수, `solution`을 완성해주세요.

## 제한사항
- `s`는 길이 1 이상 200 이하인 문자열입니다.
- `s`는 알파벳과 숫자, 공백문자(" ")로 이루어져 있습니다.
  - 숫자는 단어의 첫 문자로만 나옵니다.
  - 숫자로만 이루어진 단어는 없습니다.
  - 공백문자가 연속해서 나올 수 있습니다.

## 코드
```java
class Solution {
    public String solution(String s) {
        // StringBuilder 객체 생성
        // 기존 문자에 새로운 문자를 추가할 때, String은 매번 새로운 객체를 생성하기 때문에 성능이 좋지 않음. 이럴 때 StringBuilder를 사용하면 성능을 향상시킬 수 있음
        StringBuilder sb = new StringBuilder();
        
        String[] arr = s.toLowerCase().split(""); // 문자열을 소문자로 변환 후 문자열 배열로 변환
        sb.append(arr[0].toUpperCase()); // 첫 문자는 대문자로 sb에 추가
        
        for (int i = 1; i < arr.length; i++) {
            // 이전 문자가 공백인 경우 대문자로 변환
            if (arr[i - 1].equals(" ")) {
                arr[i] = arr[i].toUpperCase();
            }
            
            sb.append(arr[i]); // 문자 추가
        }
        
        return sb.toString();
    }
}
```