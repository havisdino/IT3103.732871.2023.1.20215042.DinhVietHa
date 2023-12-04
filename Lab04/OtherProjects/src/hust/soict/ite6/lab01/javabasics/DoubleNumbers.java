// Dinh Viet Ha 20215042
// 2.2.5: DoubleNumbers.java

package hust.soict.ite6.lab01.javabasics;

import java.util.Scanner;

public class DoubleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        scanner.close();
        double sum = a + b;
        double difference = a - b;
        double product = a * b;
        double quotient = 0.0;
        if (b != 0) {
            quotient = a / b;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        if (quotient != 0) {
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("No quotient"); // Because the quotient cannot be 0
        }
    }
}
