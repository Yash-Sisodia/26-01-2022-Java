import java.util.*;
public class basiclesser { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a = ");
        int a=sc.nextInt();
        System.out.print("Enter number b = ");
        int b=sc.nextInt();
        if(a>b) {
            System.out.print("a is greater");
        } else if (a<b) {
            System.out.print("a is lesser");
        } else {
            System.out.print("a is equal to b");
        }
    }
    
}
