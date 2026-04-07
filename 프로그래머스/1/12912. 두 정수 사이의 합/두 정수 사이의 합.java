class Solution {
    public long solution(int a, int b) {
        long hap=0;
        if(a==b){
            return a;
        }
        else if(a>b){
            for(int i=b; i<=a; i++){
                hap+=i;
            }
        }
        else if(a<b){
            for(int i=a; i<=b; i++){
                hap+=i;
            }
        }
        return hap;
    }
}