import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int i;
        int k;
        for(k=0,i=1;i<=a;i++){
            k+=i;
        }
        System.out.println(k);

    }
}