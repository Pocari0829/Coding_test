import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] a= new int[30];
        int n=0;
        for(int i=0; i<a.length-2; i++) {
            n=sc.nextInt();
            a[n-1]=1;
        }
        for(int i=0; i<a.length; i++){
            if (a[i]!=1){
                System.out.println(i+1);
            }
        }
    }
}