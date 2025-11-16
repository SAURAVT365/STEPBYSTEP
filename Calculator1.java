import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Simple calculator");
        System.out.println("Choose operation: +  -  *  /  ^  % ");
        System.out.print("Operation: ");
        String op = sc.next().trim();

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        double result;
        boolean ok = true;

        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero");
                    ok = false;
                    result = 0;
                }
                break;
            case "^":
                result = Math.pow(a, b);
                break;
            case "%":
                result = a % b;
                break;
            default:
                System.out.println("Invalid operation");
                ok = false;
                result = 0;
        }

        if (ok) {
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
