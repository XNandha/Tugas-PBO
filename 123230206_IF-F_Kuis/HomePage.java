import javax.swing.*;

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

            JLabel welcomLabel = new JLabel("Selamat Datang," + username, SwingConstants.CENTER);
            welcomLabel.setBounds(100, 20, 400, 30);
            JLabel instrutionLabel = new JLabel("Silahkan Pilih Menu dibawah Untuk Membeli Alat Tulis.", SwingConstants.CENTER);
            instrutionLabel.setBounds(100, 60, 400, 30);

            JLabel pensilLabel = new JLabel("Pensil : Rp2.000");
            JTextField pensilField = new JTextField();
            JLabel pulpenLabel = new JLabel("Pulpen : Rp5.000");
            JTextField pulpenField = new JTextField();
            JLabel bukuLabel = new JLabel("Buku Tulis : Rp10.000");
            JTextField bukuField = new JTextField();
            JButton beliButton = new JButton();
            JButton btnLogout = new JButton();

            btnLogout.addActionListener(e -> {
                new LoginPage();
                this.dispose();
            });

            add(welcomLabel);
            add(instrutionLabel);
            add(pensilLabel);
            add(pensilField);
            add(pulpenLabel);
            add(pulpenField);
            add(bukuLabel);
            add(bukuField);
            add(btnLogout);
            add(beliButton);



            setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"An error occurred while initializing the application: "+ ex.getMessage());
            ex.printStackTrace();
        }
    }
}


//Saya Bingung Salahnya dimana soalnya class HomePagenya Public jadi gk mau nge run