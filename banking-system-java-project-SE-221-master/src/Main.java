import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;

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
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        frame.add(panel);

        // Create a Register button
        JButton registerButton = new JButton("Register") {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setColor(Color.decode("#1B9C85"));
                g2d.fill(new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 15, 15));
                super.paintComponent(g2d);
            }
        };
        registerButton.setForeground(Color.WHITE);
        registerButton.setOpaque(false);
        registerButton.setBorderPainted(false);
        registerButton.setFocusPainted(false);
        registerButton.setContentAreaFilled(false);
        registerButton.setMargin(new Insets(10, 20, 10, 20));
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
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 10, 10);
        panel.add(registerButton, c);



        // Create a Login button
        JButton loginButton = new JButton("Login") {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setColor(Color.decode("#1B9C85"));
                g2d.fill(new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 15, 15));
                super.paintComponent(g2d);
            }
        };
        loginButton.setForeground(Color.WHITE);
        loginButton.setOpaque(false);
        loginButton.setBorderPainted(false);
        loginButton.setFocusPainted(false);
        loginButton.setContentAreaFilled(false);
        loginButton.setMargin(new Insets(10, 20, 10, 20));
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
        c.gridx = 1;
        c.gridy = 0;
        panel.add(loginButton, c);

        // Create an Exit button
        JButton exitButton = new JButton("Exit") {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setColor(Color.decode("#FF6347"));
                g2d.fill(new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 15, 15));
                super.paintComponent(g2d);
            }
        };
        exitButton.setForeground(Color.WHITE);
        exitButton.setOpaque(false);
        exitButton.setBorderPainted(false);
        exitButton.setFocusPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setMargin(new Insets(10, 20, 10, 20));
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 2;
        panel.add(exitButton, c);

        frame.setVisible(true);
    }
}
