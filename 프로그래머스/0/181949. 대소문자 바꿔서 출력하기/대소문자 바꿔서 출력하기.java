import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] b = new char[a.length()];
        for(int i=0; i<a.length(); i++){
            b[i]=a.charAt(i);
            if(a.charAt(i)>='A'&&a.charAt(i)<='Z'){
                b[i]+=32;
            }
            else if(a.charAt(i)>='a'&&a.charAt(i)<='z'){
                b[i]-=32;
            }
        }
        System.out.println(b);
    }
}