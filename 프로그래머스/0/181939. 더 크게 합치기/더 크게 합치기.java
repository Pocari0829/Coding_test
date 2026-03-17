class Solution {
    public int solution(int a, int b) {
        int a1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int a2 = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        if(a1>=a2){
            return a1;
        }
        else return a2;
    }
}