class Solution {
    public double solution(int[] arr) {
        int plus=0;
        for(int i=0; i<arr.length; i++){
            plus += arr[i];
        }
        double answer = (double)plus/arr.length;
        return answer;
    }
}