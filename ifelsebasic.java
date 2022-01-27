import java.util.*;
public class ifelsebasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>18) {
            System.out.print("Adult");
        } else if(age==18) {
            System.out.print("Adult he hai");
        } else  {
            System.out.print("Not a adult");
        }
    }
}
