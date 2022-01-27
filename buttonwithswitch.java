import java.util.*;
public class buttonwithswitch {
    public static void main(String[] args) {
        System.out.print("Enter number ranging from 1 to 3 ");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button) {
            case 1: System.out.print("Hello");
            break ;
            case 2: System.out.print("Namaste");
            break ;
            case 3 : System.out.print("Bonjour");
            break ;
            default : System.out.print("you have entered a invalid number");
        }
    }
    
}
