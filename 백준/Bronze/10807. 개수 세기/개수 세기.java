import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num=0;
        int b = sc.nextInt();
        int[] a = new int[b];
        for (int i=0; i<b; i++){
            a[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        for (int i=0; i<b; i++){
            if (a[i]==n) {
                num++;
            }
        }
        System.out.println(num);
    }
}