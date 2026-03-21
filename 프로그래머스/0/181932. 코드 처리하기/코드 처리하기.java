import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[8];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

        int p=0;
        for(int i=0; i<a.length-1; i++){
            if(a[i]<a[i+1]){
                p++;
            }
            if(a[i]>a[i+1]){
                p--;
            }
        }
        if(p==7){
            System.out.println("ascending");
        }
        else if(p==-7){
            System.out.println("descending");
        }
        else System.out.println("mixed");
    }
}
class Solution {
    public String solution(String code) {
        int mode =0;
        String answer= "";
        for(int i=0; i<code.length(); i++){
            if(mode==0) {
                if (i % 2 == 0 && code.charAt(i) != '1') {
                    answer += code.charAt(i);
                }
                if (code.charAt(i) == '1') {
                    mode = 1;
                    continue;
                }
            }
            if(mode==1){
                if(i%2==1&&code.charAt(i)!='1'){
                    answer += code.charAt(i);
                }
                if(code.charAt(i)=='1'){
                    mode =0;
                }
            }
        }
        if(answer.equals("")){
            return "EMPTY";
        }
        return answer;
    }
}