package view;

public class Mainmenu extends BaseView {

    public Mainmenu() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        menuBuku = new javax.swing.JButton();
        menuAnggota = new javax.swing.JButton();
        menuPeminjaman = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        menuDenda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 24)); // NOI18N
        jLabel1.setText("Menu");

        menuBuku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/Book_50px.png"))); // NOI18N
        menuBuku.setText("Buku");
        menuBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBukuActionPerformed(evt);
            }
        });

        menuAnggota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/Student Male_50px.png"))); // NOI18N
        menuAnggota.setText("Anggota");
        menuAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAnggotaActionPerformed(evt);
            }
        });

        menuPeminjaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/Add List_50px.png"))); // NOI18N
        menuPeminjaman.setText("Peminjaman");
        menuPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPeminjamanActionPerformed(evt);
            }
        });

        keluar.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        keluar.setText("Logout");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        menuDenda.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Perpustakaan\\src\\view\\icon\\Money_50px.png")); // NOI18N
        menuDenda.setText("Denda");
        menuDenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuDenda))
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(keluar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuBuku)
                    .addComponent(menuAnggota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuDenda)
                    .addComponent(menuPeminjaman))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(keluar)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBukuActionPerformed
        closeWindow(new DaftarBuku(), this);
    }//GEN-LAST:event_menuBukuActionPerformed

    private void menuAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAnggotaActionPerformed
        closeWindow(new DaftarAnggota(), this);
    }//GEN-LAST:event_menuAnggotaActionPerformed

    private void menuPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPeminjamanActionPerformed
        closeWindow(new TransaksiPeminjaman(), this);
    }//GEN-LAST:event_menuPeminjamanActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
           System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void menuDendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDendaActionPerformed
        closeWindow(new Daftardenda(), this);
    }//GEN-LAST:event_menuDendaActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton keluar;
    private javax.swing.JButton menuAnggota;
    private javax.swing.JButton menuBuku;
    private javax.swing.JButton menuDenda;
    private javax.swing.JButton menuPeminjaman;
    // End of variables declaration//GEN-END:variables
}
