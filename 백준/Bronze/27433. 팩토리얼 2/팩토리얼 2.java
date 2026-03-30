import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Main m = new Main();
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       System.out.println(m.factorial(a));
        
    }
    long factorial(int a){
        if(a<=1){
            return 1;
        }
        return a*(factorial(a-1));
    }
}
