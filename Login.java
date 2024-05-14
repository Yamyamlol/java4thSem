import java.awt.event.*;
import javax.swing.*;

import java.awt.*;

public class Login implements ActionListener {
    JTextField username;
    JTextField password;

    public Login() {
        JFrame jf = new JFrame("Login Page");
        JPanel jp = new JPanel();
        jp.setLayout(new FlowLayout());
        JLabel l1 = new JLabel("Username: ");
        username = new JTextField(10);
        JLabel l2 = new JLabel("Password: ");
        password = new JTextField(10);
        JButton b = new JButton("Login");
        b.addActionListener(this);
        jp.add(l1);
        jp.add(username);
        jp.add(l2);
        jp.add(password);
        jp.add(b);
        jf.add(jp);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Login();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String a = username.getText();
        String b = password.getText();
        if (a.equalsIgnoreCase("YAMYAM") && b.equals("12345678")) {
            JOptionPane.showMessageDialog(null, "Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Login Failed! Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
