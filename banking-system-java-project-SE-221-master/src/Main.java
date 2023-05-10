

        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        JFrame frame = new JFrame("Banking System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);

        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog(frame, "Enter your name:");
                String user = JOptionPane.showInputDialog(frame, "Enter Username:");
                String pass = JOptionPane.showInputDialog(frame, "Enter Password:");
                login.register(frame, name, user, pass);
            }
        });
        panel.add(registerButton);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = JOptionPane.showInputDialog(frame, "Enter username:");
                String pass = JOptionPane.showInputDialog(frame, "Enter Password:");
                login.login(frame, user, pass);
            }
        });
        panel.add(loginButton);

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