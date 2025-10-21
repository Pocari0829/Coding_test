
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1; i<=a*2-1; i+=2) {
            for(int k=a*2-3; k>=i; k-=2){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=a*2-3; i>=1; i-=2) {
            for(int k=a*2-3; k>=i; k-=2){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print("*");
            }
            if(i!=1){
                System.out.println();
            }
            else continue;
        }
    }
}