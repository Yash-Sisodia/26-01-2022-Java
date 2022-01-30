import java.util.*;
public class oddinrange { 
    public static void main(String[] args) {
        System.out.print("Enter lower limit : ");
        Scanner sc = new Scanner(System.in);

        int low = sc.nextInt();
        System.out.print("Enter higher limit : ");
        int high = sc.nextInt();

        for(int i = low ; i <= high ; i++) {

           if(i%2==0) {
               System.out.println(i);
           } else {
               System.out.print("");
           }
        }
    }
    
}
