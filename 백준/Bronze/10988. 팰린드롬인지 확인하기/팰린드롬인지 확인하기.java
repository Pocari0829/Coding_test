import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int count = 0;
        for(int i=1; i<=(a.length()/2)+1; i++){
            if(a.charAt(i-1)==a.charAt(a.length()-i)){
                count++;
            }
        }
        if(count>(a.length()/2)){
            System.out.println(1);
        }else System.out.println(0);
    }
}