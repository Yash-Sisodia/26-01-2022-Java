import java.util.*;
public class frequency {
    public static void main(String[] args) {
        System.out.print("Enter any number n :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter digit : ");
        int d = sc.nextInt();
        
        int counter=0;

        while(n>0) {
          
          int b=n%10;
          if(b==d) {
              counter++;
              
          }
          n=n/10;
          }
          System.out.print(counter);   
        }

    }

