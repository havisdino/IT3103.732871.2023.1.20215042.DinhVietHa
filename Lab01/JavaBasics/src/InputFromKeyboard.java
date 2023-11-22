// Dinh Viet Ha 20215042
// 6.2: InputFromKeyboard.java

import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("How tall are you (m)?");
        double height = scanner.nextDouble();
        scanner.close();

        System.out.println("Mr/Mrs. " + name + ", " + age + " years old. Your height is " + height + "m.");
        System.exit(0);
    }

}
