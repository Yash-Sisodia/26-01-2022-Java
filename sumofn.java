import java.util.*;
public class sumofn {
    public static void main(String[] args) {
        System.out.print("Enter any number n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum=0;
        for(int i = 0 ; i<=n ; i++ ) {
            sum=sum+i;
        }
         System.out.println(sum);  
    }
}
