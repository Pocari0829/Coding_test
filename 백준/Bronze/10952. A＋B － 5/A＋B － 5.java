import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a=0; int i=0; int b=0; int c=0; int d=0;
        while (a>=0) {
            b = sc.nextInt();
            c = sc.nextInt();
            d = b + c;
            if (b==0 && c==0)
                break;
            a++;
            i++;
            System.out.printf("%d",d);
            System.out.println();
        }
    }
}