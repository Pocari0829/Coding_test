import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; a/4>=i;i=1){
            a-=4;
            System.out.print("long ");
        }
        System.out.print("int");
}
}