import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ave =0;
        int[] a = new int[5];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
            ave+=a[i];
        }
        ave = ave/5;
        System.out.println((int)ave);

        int temp =0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length-1; j++){
                if(a[j]>a[j+1]){
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(a[2]);
    }
}
