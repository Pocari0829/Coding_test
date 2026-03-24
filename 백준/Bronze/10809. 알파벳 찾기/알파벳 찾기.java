import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int[] c = new int[26];
        Arrays.fill(c,-1);
        for(int j=0; j<a.length(); j++){
            for(char i='a'; i<='z'; i++){
                if(a.charAt(j)==i){
                    c[i-97] = a.indexOf(i);
                }
            }
        }
        for(int i=0; i<c.length; i++){
            System.out.print(c[i]+" ");
        }
    }
}
