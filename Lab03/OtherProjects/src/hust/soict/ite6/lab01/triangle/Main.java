// Dinh Viet Ha 20215042
// Ex 6.3

package hust.soict.ite6.lab01.triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        Triangle.display(n);
    }
}