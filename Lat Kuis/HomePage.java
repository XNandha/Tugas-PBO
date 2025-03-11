import javax.swing.*;
import java.awt.*;

public class HomePage extends JFrame {
    public HomePage(String username) {
        super("Home Page");
        try {
            setSize(600, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(null);

            // Panel untuk pesan selamat datang
            JLabel welcomeLabel = new JLabel("Selamat Datang, " + username, SwingConstants.CENTER);
            welcomeLabel.setBounds(100, 20, 400, 30);
            JLabel instructionLabel = new JLabel("Silakan pilih menu di bawah untuk membeli DVD.", SwingConstants.CENTER);
            instructionLabel.setBounds(100, 60, 400, 30);

            // Panel untuk tombol DVD
            JButton btnAnak = new JButton("DVD Anak");
            btnAnak.setBounds(90, 120, 130, 60);
            JButton btnDewasa = new JButton("DVD Dewasa");
            btnDewasa.setBounds(240, 120, 130, 60);
            JButton btnLansia = new JButton("DVD Lansia");
            btnLansia.setBounds(390, 120, 130, 60);
            JButton btnLogout = new JButton("Logout");
            btnLogout.setBounds(100, 240, 400, 30);

            // Menambahkan komponen ke frame
            add(welcomeLabel);
            add(instructionLabel);
            add(btnAnak);
            add(btnDewasa);
            add(btnLansia);
            add(btnLogout);

            btnAnak.addActionListener(e -> {
                new PurchaseFrame("DVD Anak", 27891, this);
                setVisible(false);
            });
            btnDewasa.addActionListener(e -> {
                new PurchaseFrame("DVD Dewasa", 35396, this);
                setVisible(false);
            });
            btnLansia.addActionListener(e -> {
                new PurchaseFrame("DVD Lansia", 38550, this);
                setVisible(false);
            });
            btnLogout.addActionListener(e -> {
                new LoginPage();
                this.dispose();
            });

            // Menampilkan frame
            setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "An error occurred while initializing the HomePage: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            new HomePage("123230141");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "An error occurred while initializing the application: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}