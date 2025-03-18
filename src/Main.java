import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter favourite colour: ");
        String colour = scanner.nextLine();

        Thread.sleep(1000);

        System.out.println("age: " + age);
        System.out.println("colour: " + colour);

         scanner.close();
    }
}
