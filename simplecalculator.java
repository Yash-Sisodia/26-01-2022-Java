import java.util.Scanner;
public class simplecalculator {
    public static void main(String[] args) {
        System.out.print("Enter number a = ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.print("Enter number b = ");
        //Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();

        System.out.print("Enter op what operation do you want to perform ?");
        int op = sc.nextInt();
       
        int r;

        switch(op) {
            case 1 :  r=a+b;
            System.out.print(r);
            break;
            case 2 :  r=a-b;
            System.out.print(r);
            break;
            case 3 :  r=a*b;
            System.out.print(r);
            break;
            case 4 :  r=a/b;
            System.out.print(r);
            break;
        }
    }
}
