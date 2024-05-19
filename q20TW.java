/* 
      NAME: SANYAM RAWAT
      SECTION: D
      ROLL NO: 58
*/


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class q20TW extends JFrame {
    private JTextField nameField, codeField, designationField, salaryField;
    private JTextArea resultArea;
    private JButton insertButton, retrieveButton;

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/employee_db";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    public q20TW() {
        setTitle("Employee Database");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);
        JLabel codeLabel = new JLabel("Code:");
        codeField = new JTextField(20);
        JLabel designationLabel = new JLabel("Designation:");
        designationField = new JTextField(20);
        JLabel salaryLabel = new JLabel("Salary:");
        salaryField = new JTextField(20);
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(codeLabel);
        inputPanel.add(codeField);
        inputPanel.add(designationLabel);
        inputPanel.add(designationField);
        inputPanel.add(salaryLabel);
        inputPanel.add(salaryField);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        insertButton = new JButton("Insert");
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertEmployee();
            }
        });
        retrieveButton = new JButton("Retrieve");
        retrieveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retrieveEmployees();
            }
        });
        buttonPanel.add(insertButton);
        buttonPanel.add(retrieveButton);

        resultArea = new JTextArea(10, 40);
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        panel.add(inputPanel);
        panel.add(buttonPanel);
        panel.add(scrollPane);

        add(panel);
    }

    private void insertEmployee() {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String name = nameField.getText();
            int code = Integer.parseInt(codeField.getText());
            String designation = designationField.getText();
            double salary = Double.parseDouble(salaryField.getText());

            String sql = "INSERT INTO employee (Name, Code, Designation, Salary) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setInt(2, code);
            statement.setString(3, designation);
            statement.setDouble(4, salary);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Employee inserted successfully.");
            }
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting employee.");
        }
    }

    private void retrieveEmployees() {
        resultArea.setText(""); // Clear previous results
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String sql = "SELECT * FROM employee";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String name = resultSet.getString("Name");
                int code = resultSet.getInt("Code");
                String designation = resultSet.getString("Designation");
                double salary = resultSet.getDouble("Salary");

                resultArea.append("Name: " + name + ", Code: " + code + ", Designation: " + designation +
                        ", Salary: " + salary + "\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error retrieving employees.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new q20TW().setVisible(true);
            }
        });
    }
}
