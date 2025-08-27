import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int max =0;
        int vir =0;
        int hor=0;
        int[][] c = new int[9][9];
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[i].length; j++) {
                    c[i][j] = sc.nextInt();
                    if (c[i][j]>=max){
                        max = c[i][j];
                        vir=i+1;
                        hor=j+1;
                    }
                }
            }
        System.out.println(max);
        System.out.print(vir+" ");
        System.out.println(hor);
    }
}