import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b =1;
        int c = 2;
        for(int i=0; i<a; i++){
            c+=b;
            b*=2;
        }
        System.out.println(c*c);
    }
}
