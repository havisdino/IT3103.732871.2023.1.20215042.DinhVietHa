// Dinh Viet Ha 20215042
// 6.1: ChoosingOption.java

import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "Do you wanna change the ticket?");
        JOptionPane.showMessageDialog(
                null,
                "You've been chosen: " + (option == JOptionPane.YES_OPTION? "Yes":"No"));
        System.exit(0);
    }
}
