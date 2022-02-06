import java.util.*;
public class countdigit {
  public static void main(String[] args) {
    System.out.print("Enter number n :");
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int counter=0;
    while(n!=0) {
      n=n/10;
      counter++;
    } System.out.print(counter);
  } 
}