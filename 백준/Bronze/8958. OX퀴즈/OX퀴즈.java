import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       sc.nextLine();
       String[] b = new String[a];
       for(int i=0; i<b.length; i++){
           b[i] = sc.nextLine();
       }
       int[] score = new int[a];
       int stack =0;
       for(int i=0; i<b.length; i++){
           stack=0;
           for(int j=0; j<b[i].length(); j++){
               if(b[i].charAt(j)=='O'){
                   score[i]+=1 + stack;
                   stack++;
               }
               else {
                   stack=0;
               }
           }
       }
       for(int i=0; i<b.length; i++){
           System.out.println(score[i]);
       }
    }
}
