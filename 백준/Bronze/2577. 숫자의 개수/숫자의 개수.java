import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a= new int[3];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int gop =a[0];
        for(int i=1; i<a.length; i++){
            gop*=a[i];
        }
        String c = Integer.toString(gop);
        int[] b = new int[10];
        for(int i=0; i<c.length(); i++){
            for(char j = '0'; j <='9'; j++){
                if(c.charAt(i)==j){
                    b[j-'0']++;
                }
            }
        }
        for(int i=0; i<b.length; i++){
            System.out.println(b[i]);
        }
    }
}
