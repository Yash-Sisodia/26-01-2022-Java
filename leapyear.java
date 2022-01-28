import java.util.*;
public class leapyear {
    public static void main(String[] args) {

        System.out.print("Enter year = ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n%4==0) {
            System.out.print("Entered year is a leap year");
        } else {
            System.out.print("Not a leap year");
        }
    }
}
