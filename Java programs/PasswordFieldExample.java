package Swing;
import javax.swing.*;

public class PasswordFieldExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Password Field Example");

        // Create a JPasswordField
        JPasswordField passwordField = new JPasswordField();

        // Create a JLabel for displaying instructions
        JLabel label = new JLabel("Enter your password:");

        // Add components to the frame
        frame.add(label);
        frame.add(passwordField);

        // Set layout (you can use different layout managers)
        frame.setLayout(new java.awt.FlowLayout());

        // Set frame properties
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}