import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int P = sc.nextInt();

        int TM = H * 60 + M + P;

        int NH = (TM/60) % 24;
        int NM = TM % 60;
        System.out.println(NH + " " + NM);

    }
}