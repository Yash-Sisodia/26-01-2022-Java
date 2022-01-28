// WAP to display a message if the entered number is zero or negative

import java.util.*;

public class zeroornegative {
          public static void main(String[] args) {
              System.out.print("Enter any number n = ");
              Scanner sc = new Scanner(System.in);

              int n = sc.nextInt();
              if(n>0) {
                  System.out.print("Entered number is positive");
              } else if(n==0) {
                  System.out.print("Entered number is obviously zero");
              } else {
                  System.out.print("Entered number is negative");
              }
          }
    
}
