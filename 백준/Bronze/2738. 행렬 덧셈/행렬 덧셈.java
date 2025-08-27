import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] c = new int[a][b];
        for(int k=0; k<2; k++) {
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[i].length; j++) {
                    c[i][j] += sc.nextInt();
                }
            }
        }
        for(int i=0; i<c.length; i++){
            for(int j=0; j<c[i].length; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}