import java.util.*;
public class hackerrankquesfive {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int q = sc.nextInt();

         while(q>0) {
             int a = sc.nextInt();
             int b = sc.nextInt();
             int n = sc.nextInt();

            int  no=a;

             for(int i =0 ; i<n ; i++) {
                 no += (int)(Math.pow(2,i))*b;
                 System.out.print(no+ " ");
             }
             System.out.println();
             q--;
            }
            }     
}
