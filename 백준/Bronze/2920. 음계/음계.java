import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[8];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

        int p=0;
        for(int i=0; i<a.length-1; i++){
            if(a[i]<a[i+1]){
                p++;
            }
            if(a[i]>a[i+1]){
                p--;
            }
        }
        if(p==7){
            System.out.println("ascending");
        }
        else if(p==-7){
            System.out.println("descending");
        }
        else System.out.println("mixed");
    }
}
