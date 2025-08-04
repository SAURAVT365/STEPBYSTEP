import java.util.*;
public class CONDITIONS {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first digit :");
        int a = sc.nextInt();
        System.out.print("Enter second Digit :");
        int b = sc.nextInt();

        if(a==b){
            System.out.println("equal");
        }
        else if(b>a){
            System.out.println("b is greater");
        }
        else {
            System.out.println("a is greater");
        }
    }
}