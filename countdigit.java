import java.util.*;
  
  public class countdigit{
  
  public static void main(String[] args) {
    // write your code here  
     System.out.print("Enter number n :");
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
       
     System.out.println(n);
     for(int i=1 ; i<=n ; i++) {  //i=0 
        if(n>=0) {  
        n=n/10; 
       }
       System.out.println(n);
     }

   }
  }