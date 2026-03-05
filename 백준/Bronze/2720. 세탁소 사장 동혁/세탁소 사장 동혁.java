import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int[] b = new int[a];
        for(int i=0; i<a; i++){
            b[i] = sc.nextInt();
        }
        int[][] c = new int[a][4];
        for(int i=0; i<a; i++){
            c[i][0] = b[i]/25;
            b[i] = b[i] % 25;
            c[i][1] = b[i]/10;
            b[i] = b[i]%10;
            c[i][2] = b[i]/5;
            b[i] = b[i]%5;
            c[i][3] = b[i];
        }
        for(int i=0; i<a; i++){
            for(int j=0; j<4; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
