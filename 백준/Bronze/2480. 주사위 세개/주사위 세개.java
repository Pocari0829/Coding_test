import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
        int k = 0;
        if (a==b && b==c){
            k+=b;
            System.out.println(10000+(k*1000));
        }
        else if (a == b || b == c || c == a) {

            if (a == b || a == c) {
                k = a;
                System.out.println(1000 + k * 100);
            } else {
                k = b;
                System.out.println(1000 + k * 100);
            }
        }

        else {
            if (a > b && a > c)
                k += a;
            else if (b > a && b > c)
                k += b;
                else k += c;
                System.out.println(k * 100);
            }
}
}