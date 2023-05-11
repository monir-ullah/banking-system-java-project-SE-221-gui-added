import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Main class
public class Main {
    public static void main(String[] args) {
        // Create a new Login object
        Login login = new Login();
        // Create a new JFrame
        JFrame frame = new JFrame("Banking System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a new JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);

        // Create a Register button
        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Prompt the user to enter their information
                String name = JOptionPane.showInputDialog(frame, "Enter your name:");
                String user = JOptionPane.showInputDialog(frame, "Enter Username:");
                String pass = JOptionPane.showInputDialog(frame, "Enter Password:");
                // Register the user
                login.register(frame, name, user, pass);
            }
        });
        panel.add(registerButton);

        // Create a Login button
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Prompt the user to enter their username and password
                String user = JOptionPane.showInputDialog(frame, "Enter username:");
                String pass = JOptionPane.showInputDialog(frame, "Enter Password:");
                // Login the user
                login.login(frame, user, pass);
            }
        });
        panel.add(loginButton);

        // Create an Exit button
        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.add(exitButton);

        frame.setVisible(true);
    }
}
