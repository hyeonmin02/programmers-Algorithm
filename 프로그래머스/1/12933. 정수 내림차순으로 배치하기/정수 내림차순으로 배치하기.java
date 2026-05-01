class Solution {
    public long solution(long n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }
        int len = arr.length;
        for(int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if(arr[j] < arr[j + 1]) {
                    int temp = arr [j];
                    arr[j] = arr [j + 1];
                    arr[j + 1] = temp;
                }
        }
        }
        long answer = 0;
        for (int num : arr) {
            answer = answer * 10 + num;
        }
        return answer;
    }
}