import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t=0;
        int i=1;
        while(true){
            t++;
            if(Integer.toString(t).contains("666")){
                if(i>=n){
                    System.out.println(t);
                    break;
                }
                else i++;
            }
        }
    }
}
