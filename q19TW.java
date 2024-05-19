/* 
      NAME: SANYAM RAWAT
      SECTION: D
      ROLL NO: 58
*/


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class q19TW extends JFrame {
    private JTextField inputField, outputField;

    public q19TW() {
        setTitle("Vowel Counter");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JPanel inputPanel = new JPanel();
        JLabel enterStringLabel = new JLabel("Enter String:");
        inputField = new JTextField(20);
        inputPanel.add(enterStringLabel);
        inputPanel.add(inputField);

        JPanel outputPanel = new JPanel();
        JLabel resultLabel = new JLabel("Result:");
        outputField = new JTextField(10);
        outputField.setEditable(false);
        outputPanel.add(resultLabel);
        outputPanel.add(outputField);

        JPanel buttonPanel = new JPanel();
        JButton countButton = new JButton("CountVowel");
        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countVowels();
            }
        });
        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
                outputField.setText("");
            }
        });
        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        buttonPanel.add(countButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(exitButton);

        panel.add(inputPanel);
        panel.add(outputPanel);
        panel.add(buttonPanel);

        add(panel);
    }

    private void countVowels() {
        String input = inputField.getText().toLowerCase();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        outputField.setText(String.valueOf(count));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new q19TW().setVisible(true);
            }
        });
    }
}
