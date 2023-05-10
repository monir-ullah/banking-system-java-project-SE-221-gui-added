import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Login extends UserInfo {
    ArrayList<String> username = new ArrayList<>();
    ArrayList<String> password = new ArrayList<>();
    ArrayList<String> name = new ArrayList<>();

    void register(JFrame frame, String name1, String user, String pass) {
        name.add(name1);
        username.add(user);
        password.add(pass);
        JOptionPane.showMessageDialog(frame, "Registration Successful");
    }

    void login(JFrame frame, String user, String pass) {
        int ind1 = username.indexOf(user);
        int ind2 = password.indexOf(pass);
        if (ind1 != -1) {
            if (ind1 == ind2) {
                new_account(frame, name.get(ind1), ind1);
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid Password");
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid Username");
        }
    }
}