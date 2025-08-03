import java.util.*;
public class calculator {
    public static void main ( String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER");
        int a = sc.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        int b = sc.nextInt();
        int mul = a * b;
        int add = a + b;
        int sub = a - b;
        int div = a / b;
        System.out.println("choose operation");
        System.out.println("1.Multiplication");
        System.out.println("2.Division");
        System.out.println("3.Substraction");
        System.out.println("4.Addition");
        int choice = sc.nextInt();
         switch(choice){
            case 1: System.out.println("MULTIPLICATION OF TWO NUMBER IS " + mul);
            break;
            case 2: System.out.println("DIVISION OF TWO NUMBER IS " + div);
            break;
            case 3: System.out.println("SUBSTRACTION OF TWO NUMBER IS " + sub);
            break;
            case 4: System.out.println("ADDITION OF TWO NUMBER IS " + add);
            break;
            default:System.out.println("Invalid");
        }
    }

}
