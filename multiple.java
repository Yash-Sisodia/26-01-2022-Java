import java.util.*;
public class multiple {
    public static void main(String[] args) {
        System.out.print("Enter any number n :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1 ; i<=10 ; i++) {

            System.out.println(n+ "X" +i+ "=" +n*i );
        }
    }
    
}
