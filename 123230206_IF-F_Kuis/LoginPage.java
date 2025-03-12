import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginPage extends JFrame implements ActionListener {
    JLabel loginLabel = new JLabel("Login Page", SwingConstants.CENTER);
    JLabel userLabel = new JLabel("Username:");
    JTextField userText = new JTextField();
    JLabel passLabel = new JLabel("Password:");
    JPasswordField passText = new JPasswordField();
    JButton loginButton = new JButton("Login");

    LoginPage() {
        super("Login Page");
        setLayout(null);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        new GridLayout(3, 2);

        addComponents();
        setComponentBounds();
        loginButton.addActionListener(this);
        setVisible(true);
    }

    private void addComponents() {
        add(loginLabel);
        add(userLabel);
        add(userText);
        add(passLabel);
        add(passText);
        add(loginButton);
    }

    private void setComponentBounds() {
        loginLabel.setBounds(130, 25, 300, 50);
        userLabel.setBounds(130, 100, 100, 15);
        userText.setBounds(130, 130, 300, 25);
        passLabel.setBounds(130, 180, 100, 15);
        passText.setBounds(130, 210, 300, 25);
        loginButton.setBounds(130, 270, 300, 40);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            try {
                String username = userText.getText();
                String password = new String(passText.getPassword());

                if (username.equals("Nandha") && password.equals("206")) {
                    System.out.println("Login success");
                    new HomePage(username);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid username or password");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "An error occurred during login: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            new LoginPage();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "An error occurred while initializing the application: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    private static class HomePage {

        public HomePage(String username) {
        }
    }
}

//Saya Menyerah Hanya ini saja yang bisa run. padahal yang lain juga sudah saya samakan tapi tetap saja. Huft...