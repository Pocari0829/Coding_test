import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=0,c=0;
        int[] d = new int[a];
        for (int i=0;i<a; i++) {
            b = sc.nextInt();
            c = sc.nextInt();
            d[i]= b+c;
        }
        for (int i=0; i<a; i++){
            System.out.println("Case #"+(i+1)+": "+d[i]);
        }
    }
}