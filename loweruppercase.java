import java.util.*;
public class loweruppercase {
    public static void main(String[] args) {
        System.out.print("Enter character = ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(ch >= 'A'  && ch <= 'Z') {
            System.out.print("upper case");
        } else {
            System.out.print( "lower case");
        }

    }
    
}
