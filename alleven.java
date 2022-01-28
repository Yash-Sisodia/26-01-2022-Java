import java.util.*;
public class alleven {
    public static void main(String[] args){
        System.out.println("Enter any number n =");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i =2 ; i<=n ; i++) {    
            if(i%2==0) {
                System.out.println(i);
            }
            }
        }
    }

