import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] a = new int[3];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int b = a[0]+a[1]-a[2];
        int c = Integer.parseInt(Integer.toString(a[0])+Integer.toString(a[1]))-a[2];
        System.out.println(b);
        System.out.println(c);
    }
}