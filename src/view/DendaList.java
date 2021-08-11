package view;

import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import perpustakaan.dao.DaoBuku;
import perpustakaan.dao.DaoDenda;
import perpustakaan.dao.Daopeminjaman;
import perpustakaan.model.Buku;
import perpustakaan.model.Denda;
import perpustakaan.model.peminjaman;
import static view.TransaksiPeminjaman.id;

public class DendaList extends BaseUpdate {
    peminjaman pinjam               = new peminjaman();
    Daopeminjaman daopeminjaman     = new Daopeminjaman(peminjaman.class);
    List<peminjaman> result         = daopeminjaman.findAll();
    public String dateChooser1;
   
    public DendaList() {
        initComponents();
        setJudul("CEK DENDA");
        setLocationRelativeTo(this);
        tampilkanData();
    }
    
    public void tampilkanData() {
        this.pinjam                 = daopeminjaman.findById(id);
        idAnggota.setText(pinjam.getIdAnggota()+"");
        pilihTanggalPinjam.setText(pinjam.getTanggalPinjam()+"");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kembali = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        tanggalPinjamLabel = new javax.swing.JLabel();
        tanggalKembaliLlabel = new javax.swing.JLabel();
        lamaWaktuLabel = new javax.swing.JLabel();
        dendaLabel = new javax.swing.JLabel();
        idAnggota = new javax.swing.JTextField();
        pilihTanggalPinjam = new javax.swing.JTextField();
        pilihTanggalKembali = new com.toedter.calendar.JDateChooser();
        lamaPinjam = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jumlahDenda = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/Go Back_24px.png"))); // NOI18N
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });

        idLabel.setText("ID");

        tanggalPinjamLabel.setText("Tanggal Pinjam");

        tanggalKembaliLlabel.setText("Tanggal Kembali");

        lamaWaktuLabel.setText("Lama");

        dendaLabel.setText("Denda");

        pilihTanggalPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //pilihTanggalPinjamActionPerformed(evt);
            }
        });

        pilihTanggalKembali.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                pilihTanggalKembaliPropertyChange(evt);
            }
        });

        jLabel6.setText("Hari");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kembali))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idLabel)
                            .addComponent(tanggalPinjamLabel)
                            .addComponent(tanggalKembaliLlabel)
                            .addComponent(lamaWaktuLabel)
                            .addComponent(dendaLabel))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pilihTanggalPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lamaPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addComponent(jumlahDenda, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pilihTanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kembali)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanggalPinjamLabel)
                    .addComponent(pilihTanggalPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tanggalKembaliLlabel)
                    .addComponent(pilihTanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lamaWaktuLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lamaPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dendaLabel)
                    .addComponent(jumlahDenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        closeWindow(new TransaksiPeminjaman(), this);
    }//GEN-LAST:event_kembaliActionPerformed
    
    public void hitungDenda(long lama) {
        String kovertselisih        = String.valueOf(lama);
        long denda                  = lama * 500;
        String kovertdenda          = String.valueOf(denda);
        lamaPinjam.setText(kovertselisih);
        jumlahDenda.setText("Rp." + kovertdenda);
        setDenda(kovertdenda);
    }
    
    public void setDenda(String konvertDenda) {
        Denda uang                   = new Denda();
        DaoDenda daodenda            = new DaoDenda(Denda.class);
        uang.setIdPeminjam(id);
        uang.setDenda(konvertDenda);
        daodenda.save(uang);
    }
    
    private void pilihTanggalKembaliPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_pilihTanggalKembaliPropertyChange
        try {
            if (pilihTanggalKembali.getDate()!= null) {
                String pattern          ="dd MMMM yyyy";
                SimpleDateFormat format = new SimpleDateFormat(pattern);
                dateChooser1=String.valueOf(format.format(
                                            pilihTanggalKembali.getDate()));
            }
        } catch (Exception e) {}
    }//GEN-LAST:event_pilihTanggalKembaliPropertyChange

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
            java.util.logging.Logger.getLogger(DendaList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DendaList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DendaList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DendaList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DendaList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dendaLabel;
    private javax.swing.JTextField idAnggota;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jumlahDenda;
    private javax.swing.JButton kembali;
    private javax.swing.JTextField lamaPinjam;
    private javax.swing.JLabel lamaWaktuLabel;
    private com.toedter.calendar.JDateChooser pilihTanggalKembali;
    private javax.swing.JTextField pilihTanggalPinjam;
    private javax.swing.JLabel tanggalKembaliLlabel;
    private javax.swing.JLabel tanggalPinjamLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void batalActionPerformed(ActionEvent evt) {
        peminjaman result           = daopeminjaman.findById(id);
        try {
            DateFormat format       = new SimpleDateFormat("dd MMMM yyyy");
            Date tanggalpinjam      = format.parse(result.getTanggalPinjam());
            Date tanggalkembali     = format.parse(dateChooser1);
            long tanggalpinjam1     = tanggalpinjam.getTime();
            long tanggalkembali1    = tanggalkembali.getTime();
            long diff               = tanggalkembali1-tanggalpinjam1;
            long lama               = diff / (24 * 60 * 60 * 1000);
            
            if (lama > 7) {
                hitungDenda(lama);
            } else {
                JOptionPane.showMessageDialog(this, "TEPAT WAKTU !! ");
            }
        } catch (Exception e) {}
    }

    @Override
    public void updateActionPerformed(ActionEvent evt) {
        pinjam.setStatus("KEMBALI");
        Buku book                   = new Buku();
        book                        = pinjam.getIdBuku();
        book.setJumlah(book.getJumlah() + 1);
        DaoBuku daobuku             = new DaoBuku(Buku.class);
        daobuku.update(book.getId(), book);
        daopeminjaman.update(id, pinjam);
        closeWindow(new TransaksiPeminjaman(), this);
    }
}
