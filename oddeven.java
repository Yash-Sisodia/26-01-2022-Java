import java.util.*;
public class oddeven {
    public static void main(String[] args) {

        System.out.print("Enter number n : ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n%2==0) {
            System.out.print("Entered number is even");
        } else {
            System.out.print("Entered number is odd");
        }
    }
    
}
