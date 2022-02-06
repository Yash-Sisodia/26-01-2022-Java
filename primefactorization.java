import java.util.*;
public class primefactorization {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       int i =2;
       while(i<=n) {
           if(n%i==0) {
               n=n/i;
               System.out.print(+i+ " ");
           } else {
               i++;
           }
       }
    }
}
    

