import java.util.*;
public class byteques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases T :");
        int T = sc.nextInt();

        for(int i =1 ; i<=T ; i++) {
            int n = sc.nextInt(); 
            if(n=>-128 && n<=127) {
               System.out.print(n);
            }
        }
    }
}
