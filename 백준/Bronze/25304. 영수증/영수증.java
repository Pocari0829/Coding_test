import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int e=0;
        for (int i=0;i<b;i++){
            int c=sc.nextInt();
            int d=sc.nextInt();
            e += c*d;
        }
        if (a==e){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}