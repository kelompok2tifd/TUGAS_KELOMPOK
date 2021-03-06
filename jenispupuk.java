/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembelian;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Lenovo
 */
public class jenispupuk extends javax.swing.JFrame {

    /**
     * Creates new form jenispupuk
     */
    public jenispupuk() {
        initComponents();
        tampiltabel();
        autonumber();
    }
 public void tampiltabel(){
        DefaultTableModel tb = new DefaultTableModel();
        tb.addColumn("Id Pupuk");
        tb.addColumn("Jenis Pupuk");
        tb.addColumn("Stok Pupuk");
        tb.addColumn("Harga");
        tb.addColumn("Keterangan");
        txtdatapupuk.setModel(tb);
        try{
            Connection c = koneksi.getKoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM jenispupuk";
            ResultSet rs = s.executeQuery(sql);
            
            while(rs.next()){
                tb.addRow(new Object[]{
                    rs.getString("Id_Pupuk"), 
                    rs.getString("Jenis_pupuk"),
                    rs.getString("Stok_Pupuk"),
                    rs.getString("Harga_Pupuk"),
                    rs.getString("Keterangan"),
                        
                });
                
            }
            
        }catch(Exception e){
            System.out.println("tampil_tabel error");
        }
    }
    private void clear(){
        autonumber();
        txtjenispupuk.setText(null);
        txtstokpupuk.setText(null);
        txthargapupuk.setText(null);  
        txtketerangan.setText(null);
  }
  
       public void autonumber(){
        try{
        Connection c = koneksi.getKoneksi();
        Statement s = c.createStatement();
        String sql = "SELECT * FROM jenispupuk ORDER BY Id_Pupuk DESC";
        ResultSet rs = s.executeQuery(sql); 
        
        if(rs.next()){
            String NoID = rs.getString("Id_Pupuk").substring(3);
            String ID = "" + (Integer.parseInt(NoID)+1);
            String Zero = "";
            
            if (ID.length()==1)
            {Zero = "00";}
            else if (ID.length()==2)
            {Zero = "0";}
            else if (ID.length()==3)
            {Zero = "";}
            
            txtidpupuk.setText("PUK" + Zero + ID);
        }else{
            txtidpupuk.setText("PUK001");
        }
        rs.close();
        s.close();
    }catch(Exception e){
        System.out.println("autonumber error");
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txthargapupuk = new javax.swing.JTextField();
        txtstokpupuk = new javax.swing.JTextField();
        txtjenispupuk = new javax.swing.JTextField();
        txtidpupuk = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdatapupuk = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtketerangan = new javax.swing.JTextArea();
        txtedit = new javax.swing.JButton();
        txthapus = new javax.swing.JButton();
        txtcetak = new javax.swing.JButton();
        txtkembali = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txthargapupuk.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txthargapupuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargapupukActionPerformed(evt);
            }
        });
        getContentPane().add(txthargapupuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 380, -1));

        txtstokpupuk.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtstokpupuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstokpupukActionPerformed(evt);
            }
        });
        getContentPane().add(txtstokpupuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 380, -1));

        txtjenispupuk.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtjenispupuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjenispupukActionPerformed(evt);
            }
        });
        getContentPane().add(txtjenispupuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 380, -1));

        txtidpupuk.setEditable(false);
        txtidpupuk.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtidpupuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidpupukActionPerformed(evt);
            }
        });
        getContentPane().add(txtidpupuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 380, -1));

        txtdatapupuk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Pupuk", "Jenis Pupuk", "Stok Pupuk", "Harga Pupuk", "Keterangan"
            }
        ));
        txtdatapupuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtdatapupukMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtdatapupuk);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 620, 340));

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(102, 255, 102));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID PUPUK");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(102, 255, 102));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("HARGA");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 153, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(102, 255, 102));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("JENIS PUPUK");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 153, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(102, 255, 102));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("STOK PUPUK");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jPanel5.setBackground(new java.awt.Color(0, 153, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(102, 255, 102));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("KETERANGAN");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        txtketerangan.setColumns(20);
        txtketerangan.setRows(5);
        jScrollPane2.setViewportView(txtketerangan);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 380, 100));

        txtedit.setBackground(new java.awt.Color(0, 255, 0));
        txtedit.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtedit.setForeground(new java.awt.Color(255, 255, 255));
        txtedit.setText("EDIT");
        txtedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteditActionPerformed(evt);
            }
        });
        getContentPane().add(txtedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 590, 130, 50));

        txthapus.setBackground(new java.awt.Color(0, 255, 0));
        txthapus.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txthapus.setForeground(new java.awt.Color(255, 255, 255));
        txthapus.setText("HAPUS");
        txthapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthapusActionPerformed(evt);
            }
        });
        getContentPane().add(txthapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 590, 130, 50));

        txtcetak.setBackground(new java.awt.Color(0, 255, 0));
        txtcetak.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtcetak.setForeground(new java.awt.Color(255, 255, 255));
        txtcetak.setText("CETAK");
        txtcetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcetakActionPerformed(evt);
            }
        });
        getContentPane().add(txtcetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 590, 130, 50));

        txtkembali.setBackground(new java.awt.Color(0, 255, 0));
        txtkembali.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtkembali.setForeground(new java.awt.Color(255, 255, 255));
        txtkembali.setText("KEMBALI");
        txtkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkembaliActionPerformed(evt);
            }
        });
        getContentPane().add(txtkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 590, 130, 50));

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("TAMBAH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, 127, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pembelian/1.4.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txthargapupukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargapupukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargapupukActionPerformed

    private void txtstokpupukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstokpupukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstokpupukActionPerformed

    private void txtjenispupukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjenispupukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjenispupukActionPerformed

    private void txtidpupukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidpupukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidpupukActionPerformed

    private void txtdatapupukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdatapupukMouseClicked
        // TODO add your handling code here:
        try {
            Connection c = koneksi.getKoneksi();
            int row =txtdatapupuk.getSelectedRow();
            String tabel_klik=(txtdatapupuk.getModel().getValueAt(row, 0).toString());
            java.sql.Statement stm = c.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from jenispupuk where Id_Pupuk= '"+tabel_klik+"'");
            if(sql.next()){
                String id = sql.getString("Id_Pupuk");
                txtidpupuk.setText(id);
                String jenis_pupuk = sql.getString("Jenis_Pupuk");
                txtjenispupuk.setText(jenis_pupuk);
                String stok_pupuk = sql.getString("Stok_Pupuk");
                txtstokpupuk.setText(stok_pupuk);
                String harga_pupuk = sql.getString("Harga_Pupuk");
                txthargapupuk.setText(harga_pupuk);
                String keterangan = sql.getString("Keterangan");
                txtketerangan.setText(keterangan);
            }
        } catch (Exception e) {}
    }//GEN-LAST:event_txtdatapupukMouseClicked

    private void txteditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteditActionPerformed
        // TODO add your handling code here: try {
            try{
                Connection c = koneksi.getKoneksi();
                Statement s = c.createStatement();
                String SQL ="update jenispupuk SET Id_Pupuk = '"+txtidpupuk.getText()+"', "
                + "Jenis_Pupuk = '"+txtjenispupuk.getText()+"', "
                + "Stok_Pupuk = '"+txtstokpupuk.getText()+"', "
                + "Harga_Pupuk = '"+txthargapupuk.getText()+"', "
                + "Keterangan = '"+txtketerangan.getText()+"'WHERE Id_Pupuk = '"+txtidpupuk.getText()+"'";
                s.executeUpdate(SQL);
                tampiltabel();
                s.close();
                clear();
                JOptionPane.showMessageDialog(null, "berhasil edit");

            }catch(Exception exc){
                System.err.println(exc.getMessage());
    }//GEN-LAST:event_txteditActionPerformed
    }
    private void txthapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthapusActionPerformed
        // TODO add your handling code here:
        String hapus =
        txtdatapupuk.getValueAt(txtdatapupuk.getSelectedRow(),0).toString();
        try {
            Connection c = koneksi.getKoneksi();
            PreparedStatement pStatement = null;
            String sql ="DELETE FROM jenispupuk WHERE Id_Pupuk=? ";
            pStatement = c.prepareStatement(sql);
            pStatement.setString(1, hapus);
            int intTambah= pStatement.executeUpdate();
            if (intTambah>0)
            JOptionPane.showMessageDialog(this,
                "Hapus data sukses", "Informasi",
                JOptionPane.INFORMATION_MESSAGE);
            else
            JOptionPane.showMessageDialog(this,
                "Hapus data gagal", "Informasi",
                JOptionPane.INFORMATION_MESSAGE);
            pStatement.close();
            tampiltabel();
            clear();
        }
        catch (SQLException e){
            System.out.println("koneksi gagal " + e.toString());
    }//GEN-LAST:event_txthapusActionPerformed
    }
    private void txtcetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcetakActionPerformed
        // TODO add your handling code here:
        com.mysql.jdbc.Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(jenispupuk.class.getName()) .log(Level.SEVERE, null, ex);
        }
        try {
            conn = (com.mysql.jdbc.Connection) DriverManager. getConnection("jdbc:mysql://localhost:3306/pembelianpupuk", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(jenispupuk.class.getName()).log(Level.SEVERE, null, ex);
        }

        String file = "D:\\Document\\KULIAH\\TUGAS\\CODING\\sangtani2\\src\\pembelian\\datapupuk.jrxml";
        JasperReport jr;
        try {
            jr = JasperCompileManager.compileReport(file);
            JasperPrint jp = JasperFillManager.fillReport(jr,null, conn);
            JasperViewer.viewReport(jp);

        }catch (JRException ex) {
            Logger.getLogger(jenispupuk.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtcetakActionPerformed

    private void txtkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkembaliActionPerformed
        // TODO add your handling code here:
        this.dispose();
        home a = new home();
        a.setVisible(true);
    }//GEN-LAST:event_txtkembaliActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String Id_Pupuk = txtidpupuk.getText();
        String Jenis_Pupuk = txtjenispupuk.getText();
        String Stok_Pupuk = txtstokpupuk.getText();
        String Harga_Pupuk = txthargapupuk.getText();
        String Keterangan = txtketerangan.getText();

        if (Id_Pupuk.equals("") || Jenis_Pupuk.equals("") || Stok_Pupuk.equals("") || Harga_Pupuk.equals("") || Keterangan.equals("")){
            JOptionPane.showMessageDialog(null, "Isi Data Dengan Lengkap!");
        }else{
            try{
                Connection c = koneksi.getKoneksi();
                String sql = "INSERT INTO jenispupuk VALUES (?, ?, ?, ?, ?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, Id_Pupuk);
                p.setString(2, Jenis_Pupuk);
                p.setString(3, Stok_Pupuk);
                p.setString(4, Harga_Pupuk);
                p.setString(5, Keterangan);
                p.executeUpdate();
                p.close();
                JOptionPane.showMessageDialog(null, "Data Ditambahkan");
            } catch (SQLException e) {
                System.out.println("Error");
            }
            
            tampiltabel();
            clear();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jenispupuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jenispupuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jenispupuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jenispupuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jenispupuk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton txtcetak;
    private javax.swing.JTable txtdatapupuk;
    private javax.swing.JButton txtedit;
    private javax.swing.JButton txthapus;
    private javax.swing.JTextField txthargapupuk;
    private javax.swing.JTextField txtidpupuk;
    private javax.swing.JTextField txtjenispupuk;
    private javax.swing.JButton txtkembali;
    private javax.swing.JTextArea txtketerangan;
    private javax.swing.JTextField txtstokpupuk;
    // End of variables declaration//GEN-END:variables
}
