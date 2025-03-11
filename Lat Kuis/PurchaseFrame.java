import javax.swing.*;
import java.awt.*;

public class PurchaseFrame extends JFrame {
    public PurchaseFrame(String category, int price, HomePage homePage) {
        super("Halaman Pembelian");
        try {
            setSize(600, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(null);

            JLabel categoryLabel = new JLabel("Kategori: " + category);
            categoryLabel.setBounds(50, 50, 200, 30);
            JLabel priceLabel = new JLabel("Harga: " + price);
            priceLabel.setBounds(50, 90, 200, 30);
            JLabel quantityLabel = new JLabel("Jumlah Pembelian:");
            quantityLabel.setBounds(50, 130, 200, 30);
            JTextField quantityText = new JTextField();
            quantityText.setBounds(250, 130, 200, 30);
            JButton backButton = new JButton("Kembali");
            backButton.setBounds(50, 200, 150, 30);
            JButton purchaseButton = new JButton("Beli");
            purchaseButton.setBounds(300, 200, 150, 30);
            JLabel totalLabel = new JLabel("Total Harga: ");
            totalLabel.setBounds(50, 250, 400, 30);

            add(categoryLabel);
            add(priceLabel);
            add(quantityLabel);
            add(quantityText);
            add(backButton);
            add(purchaseButton);
            add(totalLabel);

            backButton.addActionListener(e -> {
                homePage.setVisible(true);
                dispose();
            });
            purchaseButton.addActionListener(e -> {
                try {
                    int quantity = Integer.parseInt(quantityText.getText());
                    double total = quantity * price * 1.11;
                    totalLabel.setText("Total Harga: Rp" + String.format("%.2f", total));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Jumlah pembelian harus berupa angka");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "An error occurred during purchase: " + ex.getMessage());
                    ex.printStackTrace();
                }
            });

            setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "An error occurred while initializing the purchase frame: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}