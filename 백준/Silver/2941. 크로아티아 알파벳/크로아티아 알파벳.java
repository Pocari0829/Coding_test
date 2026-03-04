import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int count=0;
        int i;
        for(i = 0; i < a.length(); i++) {

            if(i+2 < a.length() &&
                    a.charAt(i)=='d' &&
                    a.charAt(i+1)=='z' &&
                    a.charAt(i+2)=='=') {
                count++;
                i += 2;
            }
            else if(i+1 < a.length() &&
                    (
                            (a.charAt(i)=='c' && (a.charAt(i+1)=='=' || a.charAt(i+1)=='-')) ||
                                    (a.charAt(i)=='d' && a.charAt(i+1)=='-') ||
                                    (a.charAt(i)=='s' && a.charAt(i+1)=='=') ||
                                    (a.charAt(i)=='z' && a.charAt(i+1)=='=') ||
                                    (a.charAt(i)=='l' && a.charAt(i+1)=='j') ||
                                    (a.charAt(i)=='n' && a.charAt(i+1)=='j')
                    )
            ) {
                count++;
                i++;
            }
            else {
                count++;
            }
        }
        System.out.println(count);
    }
}
