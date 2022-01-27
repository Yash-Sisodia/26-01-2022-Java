import java.util.*;
public class basicoddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number%2==0) {
            System.out.print("Entered number is even");
        } else {
            System.out.print("Entered number is odd");
        }
    }
    
}
