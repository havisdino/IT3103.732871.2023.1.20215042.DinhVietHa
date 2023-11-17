package hust.soict.ite6.lab01.triangle;

public class Triangle {
    public static void display(int n) {
        for (int i = 0; i < n; i++) {
            int tabSize = n - i - 1;
            System.out.println(" ".repeat(tabSize) + "*".repeat(2 * i + 1));
        }
    }
}
