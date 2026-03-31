class Solution {
    public int[] solution(long n) {
        // 문자열 변환
        String s = String.valueOf(n);
        // 문자열 길이만큼 배열 생성
        int[] answer = new int[s.length()];
        int o = 0;
        // 문자를 숫자로 변환해서 배열 저장
        for(int i = s.length() - 1; i>=0; i--) {
            // 문자'0'을 기준으로 차이를 이용해 숫자로 바꿈
            answer[o] = s.charAt(i) - '0';
            o++;
        }
        return answer;
    }
}