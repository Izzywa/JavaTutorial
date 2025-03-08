import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter favourite colour: ");
        String colour = scanner.nextLine();

        System.out.println("age: " + age);
        System.out.println("colour: " + colour);

         scanner.close();
    }
}
