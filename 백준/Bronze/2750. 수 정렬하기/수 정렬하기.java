import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        for(int i=0; i<b.length; i++){
            b[i] = sc.nextInt();
        }

        int temp=0;
        for(int j=0; j< b.length; j++){
            for(int i=0; i<b.length-1; i++){
                if(b[i]>b[i+1]){
                    temp = b[i+1];
                    b[i+1] = b[i];
                    b[i] = temp;
                }
            }
        }

        for(int i = 0; i<b.length; i++){
            System.out.println(b[i]);
        }
    }
}
