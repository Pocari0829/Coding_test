import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] a = new String[num];
        sc.nextLine();
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextLine();
        }
        for(int i=0; i<a.length; i++){
            System.out.println(a[i].charAt(0)+""+a[i].charAt(a[i].length()-1));
        }
    }
}