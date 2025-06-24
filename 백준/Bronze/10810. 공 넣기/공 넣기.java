import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] N= new int[n];
        int e=0,j=0,k=0;
        for(int i=0;i<m; i++){
            e=sc.nextInt();
            j=sc.nextInt();
            k=sc.nextInt();
            for (int a=e; a<=j; a++)
                N[a-1]=k;
        }
        for(int i=0;i<n;i++)
            System.out.print(N[i]+" ");
    }
}