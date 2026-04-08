class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int hap=0;
        for(int i=0; i<absolutes.length; i++){
            if(signs[i]){
                hap+=absolutes[i];
            }
            else hap-=absolutes[i];
        }
        return hap;
    }
}