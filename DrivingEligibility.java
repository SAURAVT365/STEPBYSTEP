import java.util.Scanner;

public class DrivingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Yes " + name + ", you are " + age + " years old and eligible for the driving test.");
        } else {
            System.out.println("No " + name + ", you are " + age + " years old and NOT eligible for the driving test.");
        }

        sc.close();
    }
}
