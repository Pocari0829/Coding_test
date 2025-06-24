import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] N= new int[n];
        for(int i=0;i<n;i++){
            N[i]=i+1;
        }
        int j; int k; int a;
        for(int i=0;i<m; i++){
            j=sc.nextInt()-1;
            k=sc.nextInt()-1;
            a = N[j];
            N[j]=N[k];
            N[k]=a;
        }
        for(int i=0; i<n; i++){
            System.out.print(N[i]+" ");
        }
    }
}