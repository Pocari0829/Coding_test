class Solution {
    public int solution(int a, int b, int c) {
        int p1 = a+b+c;
        int p2 = a*a+b*b+c*c;
        int p3 = a*a*a+b*b*b+c*c*c;
        if(a==b&& b==c && c==a){
            return p1*p2*p3;
        }
        if(a==b || b==c || c==a){
            return p1*p2;
        }
        else return p1;
    }
}