// Dinh Viet Ha 20215042
// 2.2.4: ShowTwoNumber.java

import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "You've entered: ";

        strNum1 = JOptionPane.showInputDialog(
            null,
            "Please insert the first number",
            "Insert the first number",
            JOptionPane.INFORMATION_MESSAGE
        );

        strNum2 = JOptionPane.showInputDialog(
            null,
            "Please insert the second number",
            "Insert the second number",
            JOptionPane.INFORMATION_MESSAGE
        );

        strNotification += strNum1 + " and " + strNum2;

        JOptionPane.showMessageDialog(
            null,
            strNotification,
            "Show 2 numbers",
            JOptionPane.INFORMATION_MESSAGE
        );
        System.exit(0);
    }
}