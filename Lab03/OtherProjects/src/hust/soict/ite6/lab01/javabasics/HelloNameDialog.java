// Dinh Viet Ha 20215042
// 2.2.3: HelloNameDialog.java

package hust.soict.ite6.lab01.javabasics;

import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hi " + result + "!");
        System.exit(0);
    }
}
