import java.util.*;
public class fibo {

    public static void main(String[] args) {

        System.out.print("Enter number n :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a=0;
        System.out.println(a);
        int b =1;
        System.out.println(b);
        
        for(int i =0; i<=n ; i++) {
            int sum=a+b;
            System.out.println(sum);
             a=b;
             b=sum;
        }

    }


    
}
