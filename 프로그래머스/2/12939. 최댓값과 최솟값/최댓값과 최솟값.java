
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("-1 -2 -3 -4"));
    }
}
class Solution {
    public String solution(String s) {
        String[] answer = s.split(" ");
        int max=Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        for(int i=0; i<answer.length; i++){
            int a = Integer.parseInt(answer[i]);
            if(max<a){
                max = a;
            }
            if(min>a){
                min = a;
            }
        }
        String result = min+" "+max;
        return result;
    }
}