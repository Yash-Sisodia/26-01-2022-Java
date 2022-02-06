import java.util.*;
public class reversenumber {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;

        while(n!=0) {
            int remainder = n%10;
            System.out.println(remainder);
            n=n/10;

        }

    }
}
