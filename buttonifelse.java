import java.util.*;
public class buttonifelse {
    public static void main(String[] args) {
        System.out.print("Enter numbers ranging from 1 to 3");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        
        if(button==1) {
            System.out.print("Hello");
        } else if(button==2) {
            System.out.print("Namaste");
        } else if(button==3) {
            System.out.print("Bonjour");
        } else {
            System.out.print("Entered number is invalid ");
        }
    }
    
}
