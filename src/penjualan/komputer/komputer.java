/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package penjualan.komputer;

import javax.swing.JOptionPane;

/**
 *
 * @author ramji
 */
public class komputer extends javax.swing.JFrame {
    // Modul 1 Tipe data, variabel dan array
    int gaming, kantor, beli , harga , bayar, kembali;

    public komputer() {
        initComponents();
    }
    public class math {
        int total;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nm_brg = new javax.swing.JComboBox<>();
        rb_gaming = new javax.swing.JRadioButton();
        rb_kantoran = new javax.swing.JRadioButton();
        txthrga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btninput = new javax.swing.JButton();
        btnctk = new javax.swing.JButton();
        btnklr = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtotpt = new javax.swing.JTextArea();
        txtnama = new javax.swing.JTextField();
        txtbeli = new javax.swing.JTextField();
        txttlharga = new javax.swing.JTextField();
        txtbayar = new javax.swing.JTextField();
        txtkmbli = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(2, 84, 100));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("penjualan komputer");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 170, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "data komputer"));

        jLabel2.setText("nama barang");

        jLabel3.setText("jenis barang");

        jLabel4.setText("harga");

        nm_brg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pilih", "monitor", "keyboard", "mouse", "speaker" }));
        nm_brg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nm_brgActionPerformed(evt);
            }
        });

        rb_gaming.setText("gaming");
        rb_gaming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_gamingActionPerformed(evt);
            }
        });

        rb_kantoran.setText("kantoran");
        rb_kantoran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_kantoranActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nm_brg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_gaming)
                            .addComponent(rb_kantoran)
                            .addComponent(txthrga, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nm_brg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rb_gaming))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_kantoran)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txthrga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 220, 150));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("nama pembeli");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("jumlah beli");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("total bayar");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("bayar");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("kembali");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        btninput.setBackground(new java.awt.Color(229, 124, 35));
        btninput.setText("input lagi");
        btninput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninputActionPerformed(evt);
            }
        });
        jPanel1.add(btninput, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        btnctk.setBackground(new java.awt.Color(229, 124, 35));
        btnctk.setText("cetak");
        btnctk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnctkActionPerformed(evt);
            }
        });
        jPanel1.add(btnctk, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        btnklr.setBackground(new java.awt.Color(229, 124, 35));
        btnklr.setText("keluar");
        btnklr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnklrActionPerformed(evt);
            }
        });
        jPanel1.add(btnklr, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        txtotpt.setColumns(20);
        txtotpt.setRows(5);
        jScrollPane1.setViewportView(txtotpt);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 460, 110));
        jPanel1.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 80, -1));

        txtbeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbeliActionPerformed(evt);
            }
        });
        txtbeli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbeliKeyReleased(evt);
            }
        });
        jPanel1.add(txtbeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 80, -1));

        txttlharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttlhargaActionPerformed(evt);
            }
        });
        jPanel1.add(txttlharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 80, -1));

        txtbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbayarActionPerformed(evt);
            }
        });
        txtbayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbayarKeyReleased(evt);
            }
        });
        jPanel1.add(txtbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 80, -1));
        jPanel1.add(txtkmbli, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rb_kantoranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_kantoranActionPerformed
        if(rb_kantoran.isSelected()){
            txthrga.setText(String.valueOf(kantor));
        }
    }//GEN-LAST:event_rb_kantoranActionPerformed

    private void btninputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninputActionPerformed
        buttonGroup1.clearSelection();
        txthrga.setText("");
        nm_brg.setSelectedItem("pilih barang");
        txtnama.setText("");
        txttlharga.setText("");
        txtbayar.setText("");
        txtkmbli.setText("");
        txtbeli.setText("");
    }//GEN-LAST:event_btninputActionPerformed

    private void nm_brgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nm_brgActionPerformed
        // Modul 2 Pengkondisian
        if(nm_brg.getSelectedItem().equals("pilih barang")){
            buttonGroup1.clearSelection();
            txthrga.setText("");
        }     
        else if (nm_brg.getSelectedItem().equals("monitor")){
            gaming=3499000;
            kantor=950000;
        }
        else if (nm_brg.getSelectedItem().equals("keyboard")){
            gaming=500000;
            kantor=115000;
        }
        else if (nm_brg.getSelectedItem().equals("mouse")){
            gaming=300000;
            kantor=75000;
        }
        else if (nm_brg.getSelectedItem().equals("speaker")){
            gaming=208000;
            kantor=72000;
        }
    }//GEN-LAST:event_nm_brgActionPerformed

    private void rb_gamingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_gamingActionPerformed
        if(rb_gaming.isSelected()){
            txthrga.setText(String.valueOf(gaming));
        }
    }//GEN-LAST:event_rb_gamingActionPerformed

    private void txtbeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbeliActionPerformed
        math hii = new math();
        beli=Integer.parseInt(txtbeli.getText());
        harga=Integer.parseInt(txthrga.getText());
        hii.total=beli*harga;
        txttlharga.setText(String.valueOf(hii.total));
      
        
    }//GEN-LAST:event_txtbeliActionPerformed

    private void txttlhargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttlhargaActionPerformed
        
    }//GEN-LAST:event_txttlhargaActionPerformed

    private void txtbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbayarActionPerformed
       //modul 5 memanggil class
        math hii = new math();
       
       bayar=Integer.parseInt(txtbayar.getText());
       kembali=Integer.parseInt(txttlharga.getText());
       hii.total=bayar-kembali;
       txtkmbli.setText(String.valueOf(hii.total));
    }//GEN-LAST:event_txtbayarActionPerformed

    private void txtbeliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbeliKeyReleased
        int a, b,c;
        a= Integer.valueOf(txthrga.getText());
        b= Integer.valueOf(txtbeli.getText());
        c=a*b;
        txttlharga.setText(""+c);
         
        
    }//GEN-LAST:event_txtbeliKeyReleased

    private void txtbayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbayarKeyReleased
        // TODO add your handling code here:
           int a, b,c;
        a= Integer.valueOf(txtbayar.getText());
        b= Integer.valueOf(txttlharga.getText());
        c=a-b
  ;
       txtkmbli.setText(""+c);
    }//GEN-LAST:event_txtbayarKeyReleased

    private void btnklrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnklrActionPerformed
        // TODO add your handling code here:
        int answer = JOptionPane.showConfirmDialog(null,"anda yakin keluar","keluar",JOptionPane.OK_OPTION);
        if(answer==JOptionPane.OK_OPTION)
        { dispose();}
    }//GEN-LAST:event_btnklrActionPerformed

    private void btnctkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnctkActionPerformed
        // TODO add your handling code here:
        btnctk.setText((String)nm_brg.getSelectedItem());
         txtotpt.setText(
                 "nama pembeli         ;"+txtnama.getText()+"\n"+
                 "jmlah  beli          ;"+txtbeli.getText()+"\n"+
                 "total harga          ;"+txttlharga.getText()+"\n"+
                 "uang bayar           ;"+txtbayar.getText()+"\n"+
                 "uang kembali         ;"+txtkmbli.getText()+"\n");       
                 
    }//GEN-LAST:event_btnctkActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(komputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(komputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(komputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(komputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new komputer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnctk;
    private javax.swing.JButton btninput;
    private javax.swing.JButton btnklr;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> nm_brg;
    private javax.swing.JRadioButton rb_gaming;
    private javax.swing.JRadioButton rb_kantoran;
    private javax.swing.JTextField txtbayar;
    private javax.swing.JTextField txtbeli;
    private javax.swing.JTextField txthrga;
    private javax.swing.JTextField txtkmbli;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextArea txtotpt;
    private javax.swing.JTextField txttlharga;
    // End of variables declaration//GEN-END:variables
}
