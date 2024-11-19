import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ATMScreen extends JFrame implements ActionListener {
    private JTextField textField;
    private static JButton btnWithdraw, btnDeposit, btnBalance, btnExit;
    private static JLabel lbl1, lbl2, lbl3, lbl4, lblBottomLabel;

    public ATMScreen() {
        setTitle("ATM");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.BOLD, 25));
        textField.setHorizontalAlignment(JTextField.CENTER);

        btnWithdraw = new JButton("Withdraw");
        btnDeposit = new JButton("Deposit");
        btnBalance = new JButton("Balance");
        btnExit = new JButton("Exit");

        btnWithdraw.addActionListener(this);
        btnDeposit.addActionListener(this);
        btnBalance.addActionListener(this);
        btnExit.addActionListener(this);

        lbl1 = new JLabel("Label 1", SwingConstants.CENTER);
        lbl2 = new JLabel("Label 2", SwingConstants.CENTER);
        lbl3 = new JLabel("Label 3", SwingConstants.CENTER);
        lbl4 = new JLabel("Label 4", SwingConstants.CENTER);
        lblBottomLabel = new JLabel("Bottom Label", SwingConstants.CENTER);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        mainPanel.add(lbl1, gbc);

        gbc.gridy = 1;
        mainPanel.add(lbl2, gbc);

        gbc.gridy = 2;
        mainPanel.add(lbl3, gbc);

//        gbc.gridy = 3;
//        mainPanel.add(lbl4, gbc);

        gbc.gridy = 4;
        gbc.gridwidth = 1;
        mainPanel.add(btnWithdraw, gbc);

        gbc.gridx = 1;
        mainPanel.add(btnDeposit, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        mainPanel.add(btnBalance, gbc);

        gbc.gridx = 1;
        mainPanel.add(btnExit, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        mainPanel.add(lblBottomLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 1;
        mainPanel.add(textField, gbc);

        add(mainPanel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnWithdraw) {
            textField.setText("Withdraw selected");
        } else if (e.getSource() == btnDeposit) {
            textField.setText("Deposit selected");
        } else if (e.getSource() == btnBalance) {
            textField.setText("Balance selected");
        } else if (e.getSource() == btnExit) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new ATMScreen();
    }
}
