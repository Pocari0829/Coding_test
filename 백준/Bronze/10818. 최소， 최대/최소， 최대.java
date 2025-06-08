import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int max;
        int min;
        a[0]= sc.nextInt();
        max=a[0];
        min=a[0];
        for (int i=1; i<n; i++){
            a[i]=sc.nextInt();
            if(a[i]>max)
                max = a[i];
            else if (a[i]<min)
                min=a[i];
        }
        System.out.printf("%d %d",min,max);
    }
}