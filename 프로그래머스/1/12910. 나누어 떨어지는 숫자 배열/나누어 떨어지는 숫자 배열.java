import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] index = new int[arr.length];
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                index[count] = i;
                count++;
            }
        }
        int[] answer = new int[count];
        for(int i=0; i<count; i++){
            answer[i] = arr[index[i]];
        }
        
        Arrays.sort(answer);
        
        if(answer.length==0){
            return new int []{-1};
        }
        return answer;
    }
}