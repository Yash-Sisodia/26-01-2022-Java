import java.util.*;
public class countdigit {
    public static void main(String[] args) {

        System.out.print("Enter number n :");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i =1 ; i<=n ; i++) {
            n=n/10;
            System.out.print(n);
        }
     
    }
    
}