import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] c = new int [a];
        int[] b = new int [a];
        int[] d = new int[a];
        for (int i=0;i<a; i++) {
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            d[i]= b[i]+c[i];
        }
        for (int i=0; i<a; i++){
            System.out.printf("Case #%d: %d + %d = %d",(i+1),b[i],c[i] ,d[i]);
            System.out.println();
        }
    }
}