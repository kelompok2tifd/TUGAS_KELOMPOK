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
 * @author User
 */
public class pendaftarankt extends javax.swing.JFrame {

    /**
     * Creates new form pendaftarankt
     */
    public pendaftarankt() {
        initComponents();
        autonumber();
        tampiltabel();
    }
    public void tampiltabel(){
        DefaultTableModel tb = new DefaultTableModel();
        tb.addColumn("ID Pelanggan");
        tb.addColumn("Name");
        tb.addColumn("Nomer HP");
        tb.addColumn("Alamat");
        tb.addColumn("Kodepos");
        tb.addColumn("NIK");
        tb.addColumn("Surat Tanah");
        txtdatapendaftaran.setModel(tb);
        try{
            Connection c = koneksi.getKoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM pendaftarankartutani";
            ResultSet rs = s.executeQuery(sql);
            
            while(rs.next()){
                tb.addRow(new Object[]{
                    rs.getString("Id_Pelanggan"), 
                    rs.getString("Nama_Lengkap"),
                    rs.getString("Nomer_HP"),
                    rs.getString("Alamat"),
                    rs.getString("Kodepos"),
                    rs.getString("KTP"),
                    rs.getString("Surat_Tanah"),
                        
                });
                
            }
            
        }catch(Exception e){
            System.out.println("tampil_tabel error");
        }
    }
    private void clear(){
        autonumber();
        txtnamatani.setText(null);
        txthptani.setText(null);
        txtalamattani.setText(null);  
        txtkodepostani.setText(null);
        txtktptani.setText(null);
        txtsurattanah.setText(null);
  }
  
       public void autonumber(){
        try{
        Connection c = koneksi.getKoneksi();
        Statement s = c.createStatement();
        String sql = "SELECT * FROM pendaftarankartutani ORDER BY Id_Pelanggan DESC";
        ResultSet rs = s.executeQuery(sql); 
        
        if(rs.next()){
            String NoID = rs.getString("Id_Pelanggan").substring(2);
            String ID = "" + (Integer.parseInt(NoID)+1);
            String Zero = "";
            
            if (ID.length()==1)
            {Zero = "00";}
            else if (ID.length()==2)
            {Zero = "0";}
            else if (ID.length()==3)
            {Zero = "";}
            
            txtidtani.setText("TA" + Zero + ID);
        }else{
            txtidtani.setText("TA001");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        txtdatapendaftaran = new javax.swing.JTable();
        txtktptani = new javax.swing.JTextField();
        txtsurattanah = new javax.swing.JTextField();
        txtkodepostani = new javax.swing.JTextField();
        txthptani = new javax.swing.JTextField();
        txtnamatani = new javax.swing.JTextField();
        txtidtani = new javax.swing.JTextField();
        txthapus = new javax.swing.JButton();
        txtkembali = new javax.swing.JButton();
        txtcetak = new javax.swing.JButton();
        txtsimpan = new javax.swing.JButton();
        txtedit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtalamattani = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtdatapendaftaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Pelanggan", "Nama", "Nomer Hp", "Alamat", "Kodepos", "KTP", "Surat tanah"
            }
        ));
        txtdatapendaftaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtdatapendaftaranMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtdatapendaftaran);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 710, 400));

        txtktptani.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txtktptani, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 330, 30));

        txtsurattanah.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txtsurattanah, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 330, 30));

        txtkodepostani.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txtkodepostani, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 330, 30));

        txthptani.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txthptani, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 330, -1));

        txtnamatani.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtnamatani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamataniActionPerformed(evt);
            }
        });
        getContentPane().add(txtnamatani, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 330, 30));

        txtidtani.setEditable(false);
        txtidtani.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtidtani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidtaniActionPerformed(evt);
            }
        });
        getContentPane().add(txtidtani, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 330, 30));

        txthapus.setBackground(new java.awt.Color(0, 255, 0));
        txthapus.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txthapus.setForeground(new java.awt.Color(255, 255, 255));
        txthapus.setText("HAPUS");
        txthapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthapusActionPerformed(evt);
            }
        });
        getContentPane().add(txthapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 130, 50));

        txtkembali.setBackground(new java.awt.Color(0, 255, 0));
        txtkembali.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtkembali.setForeground(new java.awt.Color(255, 255, 255));
        txtkembali.setText("KEMBALI");
        txtkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkembaliActionPerformed(evt);
            }
        });
        getContentPane().add(txtkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 570, 130, 50));

        txtcetak.setBackground(new java.awt.Color(0, 255, 0));
        txtcetak.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtcetak.setForeground(new java.awt.Color(255, 255, 255));
        txtcetak.setText("CETAK");
        txtcetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcetakActionPerformed(evt);
            }
        });
        getContentPane().add(txtcetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 570, 130, 50));

        txtsimpan.setBackground(new java.awt.Color(0, 255, 0));
        txtsimpan.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtsimpan.setForeground(new java.awt.Color(255, 255, 255));
        txtsimpan.setText("TAMBAH");
        txtsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsimpanActionPerformed(evt);
            }
        });
        getContentPane().add(txtsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 570, 130, 50));

        txtedit.setBackground(new java.awt.Color(0, 255, 0));
        txtedit.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtedit.setForeground(new java.awt.Color(255, 255, 255));
        txtedit.setText("EDIT");
        txtedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteditActionPerformed(evt);
            }
        });
        getContentPane().add(txtedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 570, 130, 50));

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ID PELANGGAN");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 150, 30));

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NAMA");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 150, 30));

        jPanel3.setBackground(new java.awt.Color(0, 153, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NOMER HP");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 150, 30));

        jPanel4.setBackground(new java.awt.Color(0, 153, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("KODE POS");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 150, 30));

        jPanel5.setBackground(new java.awt.Color(0, 153, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("KTP");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 150, 30));

        jPanel6.setBackground(new java.awt.Color(0, 153, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SURAT TANAH");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 150, 30));

        jPanel7.setBackground(new java.awt.Color(0, 153, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ALAMAT");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 150, 30));

        txtalamattani.setColumns(20);
        txtalamattani.setRows(5);
        jScrollPane2.setViewportView(txtalamattani);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 330, -1));

        jLabel1.setBackground(new java.awt.Color(51, 255, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pembelian/1.2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1280, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnamataniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamataniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamataniActionPerformed

    private void txtidtaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidtaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidtaniActionPerformed

    private void txtsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsimpanActionPerformed
        // TODO add your handling code here:
        String Id_Pelanggan = txtidtani.getText();
        String Nama = txtnamatani.getText();
        String Nomer_Hp = txthptani.getText();
        String Alamat = txtalamattani.getText();
        String Kodepos = txtkodepostani.getText();
        String Surat_Tanah = txtsurattanah.getText();
        String KTP = txtktptani.getText();  
        
         if (Id_Pelanggan.equals("") || Nama.equals("") || Nomer_Hp.equals("") || Alamat.equals("") || Kodepos.equals("") || Kodepos.equals("") || Surat_Tanah.equals("") || KTP.equals("")){
            JOptionPane.showMessageDialog(null, "Isi Data Dengan Lengkap!");
        }else{
            try{
                Connection c = koneksi.getKoneksi();
                String sql = "INSERT INTO pendaftarankartutani VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, Id_Pelanggan);
                p.setString(2, Nama);
                p.setString(3, Nomer_Hp);
                p.setString(4, Alamat);
                p.setString(5, Kodepos);
                p.setString(6, Surat_Tanah);
                p.setString(7, KTP);
                p.executeUpdate();
                p.close();
                JOptionPane.showMessageDialog(null, "Akun berhasil dibuat");
            } catch (SQLException ex) {
                System.out.println("Error");
            }
            clear();
            tampiltabel();
         }
    }//GEN-LAST:event_txtsimpanActionPerformed

    private void txtkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkembaliActionPerformed
        // TODO add your handling code here:
        this.dispose();
        home a = new home();
        a.setVisible(true);
    }//GEN-LAST:event_txtkembaliActionPerformed

    private void txteditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteditActionPerformed
        // TODO add your handling code here: try {
         try{
            Connection c = koneksi.getKoneksi();
            Statement s = c.createStatement();
            String SQL ="update pendaftarankartutani SET Id_Pelanggan = '"+txtidtani.getText()+"', "
                    + "Nama_Lengkap = '"+txtnamatani.getText()+"', "
                    + "Nomer_HP = '"+txthptani.getText()+"', "
                    + "Alamat = '"+txtalamattani.getText()+"', "
                    + "Kodepos = '"+txtkodepostani.getText()+"', "
                    + "KTP = '"+txtktptani.getText()+"', "
                    + "Surat_Tanah = '"+txtsurattanah.getText()+"' WHERE Id_Pelanggan = '"+txtidtani.getText()+"'";
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
       txtdatapendaftaran.getValueAt(txtdatapendaftaran.getSelectedRow(),0).toString();
        try {
            Connection c = koneksi.getKoneksi();
            PreparedStatement pStatement = null;
            String sql ="DELETE FROM pendaftarankartutani WHERE Id_Pelanggan=? ";
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
            Logger.getLogger(pendaftarankt.class.getName()) .log(Level.SEVERE, null, ex);
        }
        try {
            conn = (com.mysql.jdbc.Connection) DriverManager. getConnection("jdbc:mysql://localhost:3306/pembelianpupuk", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(pendaftarankt.class.getName()).log(Level.SEVERE, null, ex);
        }

        String file = "C:\\JAVA LAT NETBEANS\\NETBEANS 8.2\\sangtani2\\src\\pembelian\\datapetani.jrxml";
        JasperReport jr;
        try {
            jr = JasperCompileManager.compileReport(file);
            JasperPrint jp = JasperFillManager.fillReport(jr,null, conn);
            JasperViewer.viewReport(jp);

        }catch (JRException ex) {
            Logger.getLogger(pendaftarankt.class.getName()).log(Level.SEVERE, null, ex);
        }
                                        
    }//GEN-LAST:event_txtcetakActionPerformed

    private void txtdatapendaftaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdatapendaftaranMouseClicked
        // TODO add your handling code here:
         try {
            Connection c = koneksi.getKoneksi();
            int row =txtdatapendaftaran.getSelectedRow();
            String tabel_klik=(txtdatapendaftaran.getModel().getValueAt(row, 0).toString());
            java.sql.Statement stm = c.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from pendaftarankartutani where Id_Pelanggan= '"+tabel_klik+"'");
            if(sql.next()){
                String id = sql.getString("Id_Pelanggan");
                txtidtani.setText(id);
                String nama = sql.getString("Nama_Lengkap");
                txtnamatani.setText(nama);
                String nomer_hp = sql.getString("Nomer_HP");
                txthptani.setText(nomer_hp);
                String alamat = sql.getString("Alamat");
                txtalamattani.setText(alamat);
                String kodepos = sql.getString("Kodepos");
                txtkodepostani.setText(kodepos);
                String ktp = sql.getString("KTP");
                txtktptani.setText(ktp);
                String surat_tanah = sql.getString("Surat_Tanah");
                txtsurattanah.setText(surat_tanah);
            }
        } catch (Exception e) {}
    }//GEN-LAST:event_txtdatapendaftaranMouseClicked
    
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
            java.util.logging.Logger.getLogger(pendaftarankt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pendaftarankt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pendaftarankt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pendaftarankt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pendaftarankt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtalamattani;
    private javax.swing.JButton txtcetak;
    private javax.swing.JTable txtdatapendaftaran;
    private javax.swing.JButton txtedit;
    private javax.swing.JButton txthapus;
    private javax.swing.JTextField txthptani;
    private javax.swing.JTextField txtidtani;
    private javax.swing.JButton txtkembali;
    private javax.swing.JTextField txtkodepostani;
    private javax.swing.JTextField txtktptani;
    private javax.swing.JTextField txtnamatani;
    private javax.swing.JButton txtsimpan;
    private javax.swing.JTextField txtsurattanah;
    // End of variables declaration//GEN-END:variables
}
