import java.util.*;
public class primenoinrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter lower limit : ");
        int l = sc.nextInt();
        System.out.print("Enter higher limit : ");
        int h = sc.nextInt();
       
        for(int i = l; i <=h; i++) {
        
            int n =i;
            int count =0;
            for(int p=1 ; p<=n/2; p++) { //
                if(n%p==0) {
                    count ++;
                }
            }
                 if(count<2) {
                    System.out.println(n);
                } 
                    
                


           
        }
            
        }     
    }

    
    

