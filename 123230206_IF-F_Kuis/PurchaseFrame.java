// Source code is decompiled from a .class file using FernFlower decompiler.
import java.awt.Component;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PurchaseFrame extends JFrame {
   public PurchaseFrame(String var1, int var2, HomePage var3) {
      super("Halaman Pembelian");

      try {
         this.setSize(600, 400);
         this.setDefaultCloseOperation(3);
         this.setLayout((LayoutManager)null);
         JLabel var4 = new JLabel("Kategori: " + var1);
         var4.setBounds(50, 50, 200, 30);
         JLabel var5 = new JLabel("Harga: " + var2);
         var5.setBounds(50, 90, 200, 30);
         JLabel var6 = new JLabel("Jumlah Pembelian:");
         var6.setBounds(50, 130, 200, 30);
         JTextField var7 = new JTextField();
         var7.setBounds(250, 130, 200, 30);
         JButton var8 = new JButton("Kembali");
         var8.setBounds(50, 200, 150, 30);
         JButton var9 = new JButton("Beli");
         var9.setBounds(300, 200, 150, 30);
         JLabel var10 = new JLabel("Total Harga: ");
         var10.setBounds(50, 250, 400, 30);
         this.add(var4);
         this.add(var5);
         this.add(var6);
         this.add(var7);
         this.add(var8);
         this.add(var9);
         this.add(var10);
         var8.addActionListener((var2x) -> {
            var3.setVisible(true);
            this.dispose();
         });
         var9.addActionListener((var4x) -> {
            try {
               int var5 = Integer.parseInt(var7.getText());
               double var6 = (double)(var5 * var2) * 1.11;
               Object[] var10002 = new Object[]{var6};
               var10.setText("Total Harga: Rp" + String.format("%.2f", var10002));
            } catch (NumberFormatException var8) {
               JOptionPane.showMessageDialog(this, "Jumlah pembelian harus berupa angka");
            } catch (Exception var9) {
               JOptionPane.showMessageDialog(this, "An error occurred during purchase: " + var9.getMessage());
               var9.printStackTrace();
            }

         });
         this.setVisible(true);
      } catch (Exception var11) {
         JOptionPane.showMessageDialog((Component)null, "An error occurred while initializing the purchase frame: " + var11.getMessage());
         var11.printStackTrace();
      }

   }
}

//Saya Hanya menulis ulang code di CheatSet Saya dah bingung aktunya juga tinggal sedikit