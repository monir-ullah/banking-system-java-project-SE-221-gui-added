

        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.util.ArrayList;

public class UserInfo {
    ArrayList<Integer> amount1 = new ArrayList<>();

    void new_account(JFrame frame, String name, int serial) {
        JOptionPane.showMessageDialog(frame, "Welcome " + name);
        int size = amount1.size();
        if (serial >= size) {
            int choice = JOptionPane.showConfirmDialog(frame, "You have 0 Balance. Would you like to get 100 tk Free deposit?", "Free Deposit", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                amount1.add(100);
                JOptionPane.showMessageDialog(frame, "Your Balance Is 100 tk.");
                menu(frame, serial);
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid");
            }
        } else {
            menu(frame, serial);
        }
    }

    void menu(JFrame frame, int serial) {
        while (true) {
            Object[] options = {"Deposit", "View Balance", "Withdraw", "Exit"};
            int choice = JOptionPane.showOptionDialog(frame, "Choose an option:", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            switch (choice) {
                case 0:
                    deposit(frame, serial);
                    break;
                case 1:
                    view_balance(frame, serial);
                    break;
                case 2:
                    withdraw(frame, serial);
                    break;
                case 3:
                    return;
            }
        }
    }

    void deposit(JFrame frame, int serial) {
        String amountStr = JOptionPane.showInputDialog(frame, "Enter the amount to deposit:");
        int amount = Integer.parseInt(amountStr);
        JOptionPane.showMessageDialog(frame, "Amount added " + amount);
        amount += amount1.get(serial);
        JOptionPane.showMessageDialog(frame, "Your current amount is " + amount);
        amount1.set(serial, amount);
    }

    void view_balance(JFrame frame, int serial) {
        JOptionPane.showMessageDialog(frame, "Your Balance Is: " + amount1.get(serial));
    }

    void withdraw(JFrame frame, int serial) {
        JOptionPane.showMessageDialog(frame, "Your Balance Is: " + amount1.get(serial));
        String amount2Str = JOptionPane.showInputDialog(frame, "Enter The amount You want to Withdraw:");
        int amount2 = Integer.parseInt(amount2Str);
        if (100 < amount1.get(serial) - amount2) {
            JOptionPane.showMessageDialog(frame, "Withdrawn Amount: " + amount2);
            amount2 = amount1.get(serial) - amount2;
            JOptionPane.showMessageDialog(frame, "Your new amount is " + amount2);
            amount1.set(serial, amount2);
        } else {
            JOptionPane.showMessageDialog(frame, "You Don't Have enough money to withdraw");
        }
    }
}