import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[9];
        int hetsu=0,max=0;
        for (int i=0; i<9;i++){
            a[i] = sc.nextInt();
            if(max<a[i]) {
                max = a[i];
                hetsu = (i+1);
            }
        }
        System.out.println(max+"\n"+hetsu);
    }
}