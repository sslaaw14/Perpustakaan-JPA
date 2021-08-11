package view;

import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import perpustakaan.dao.DaoBuku;
import perpustakaan.dao.DaoPeminjam;
import perpustakaan.dao.Daopeminjaman;
import perpustakaan.model.Buku;
import perpustakaan.model.Peminjam;
import perpustakaan.model.peminjaman;

public class TransaksiPeminjaman extends BaseInput {
    public static int id;
    DaoBuku daobuku              = new DaoBuku(Buku.class);
    List<Buku> result            = daobuku.findAll();
    peminjaman pinjam = new peminjaman(); 
    public String dateChooser;

    public TransaksiPeminjaman() {
        initComponents();
        setLocationRelativeTo(this);
        setJudul("DATA PEMINJAMAN");
        
        for (int i = 0; i < result.size(); i++) {
            Buku printUser = result.get(i);
            daftarBuku.addItem(printUser.getJudulBuku());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        persistenceEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("persistence").createEntityManager();
        peminjamanQuery = java.beans.Beans.isDesignTime() ? null : persistenceEntityManager.createQuery("SELECT p FROM peminjaman p");
        peminjamanList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : peminjamanQuery.getResultList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        peminjamanQuery1 = java.beans.Beans.isDesignTime() ? null : persistenceEntityManager.createQuery("SELECT p FROM peminjaman p");
        peminjamanList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : peminjamanQuery1.getResultList();
        jLabel1 = new javax.swing.JLabel();
        namaPeminjam = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pilihTanggalPinjam = new com.toedter.calendar.JDateChooser();
        pilihTanggalKembali = new com.toedter.calendar.JDateChooser();
        daftarBuku = new javax.swing.JComboBox<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPeminjaman = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        idSelected = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel1.setText("Nama ");

        namaPeminjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //namaPeminjamActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel2.setText("Judul Buku");

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel3.setText("ID Anggota");

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel4.setText("Tanggal Pinjam");

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel5.setText("Tanggal Kembali");

        pilihTanggalPinjam.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                //pilihTanggalPinjamPropertyChange(evt);
            }
        });

        pilihTanggalKembali.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                //pilihTanggalKembaliPropertyChange(evt);
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, peminjamanList1, tabelPeminjaman);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nama}"));
        columnBinding.setColumnName("Nama");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idBuku}"));
        columnBinding.setColumnName("Id Buku");
        columnBinding.setColumnClass(perpustakaan.model.Buku.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${status}"));
        columnBinding.setColumnName("Status");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tanggalKembali}"));
        columnBinding.setColumnName("Tanggal Kembali");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tanggalPinjam}"));
        columnBinding.setColumnName("Tanggal Pinjam");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane1.setViewportView(tabelPeminjaman);

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel6.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(namaPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(77, 77, 77)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pilihTanggalKembali, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                .addComponent(pilihTanggalPinjam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(daftarBuku, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(idSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel3)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(namaPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(daftarBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(pilihTanggalPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(pilihTanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(idSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(203, 203, 203))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 260, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void getValue() {
        Daopeminjaman daopeminjaman  = new Daopeminjaman(peminjaman.class);
        pinjam.setIdAnggota(Integer.parseInt(jTextField3.getText()));
        pinjam.setNama(namaPeminjam.getText());
        getBuku();
        pinjam.setTanggalPinjam(convertProses(pilihTanggalPinjam));
        pinjam.setTanggalKembali(convertProses(pilihTanggalKembali));
        pinjam.setStatus("BELUM KEMBALI");
        daopeminjaman.save(pinjam);
    }
    
    private void getBuku() {
        Buku hasil = daobuku.findById(getIdBuku());
        pinjam.setIdBuku(hasil);
    }
    
    private int getIdBuku() {
        int idbuku   = 0;
        Buku book    = new Buku();
        String value = daftarBuku.getItemAt(daftarBuku.getSelectedIndex());
        
        for (int j = 0; j < result.size(); j++) {
            book     = result.get(j);
            
            if (book.getJudulBuku().equals(value)) {
               idbuku = book.getId();
               book.setJumlah(book.getJumlah()-1);
               daobuku.update(idbuku, book);
               break;
            }
        }
        return idbuku;   
    }
    
    public String convertProses(JDateChooser tanggal) {
        try {
            if(tanggal.getDate() != null){
                String pattern          = "dd MMMM yyyy";
                SimpleDateFormat format = new SimpleDateFormat(pattern);
                dateChooser             = String.valueOf(format.format(
                                                tanggal.getDate()));
            }
        } catch (Exception e) {}
        return dateChooser;
    }
 
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
            java.util.logging.Logger.getLogger(TransaksiPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransaksiPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransaksiPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransaksiPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransaksiPeminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> daftarBuku;
    private javax.swing.JTextField idSelected;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField namaPeminjam;
    private java.util.List<perpustakaan.model.peminjaman> peminjamanList;
    private java.util.List<perpustakaan.model.peminjaman> peminjamanList1;
    private javax.persistence.Query peminjamanQuery;
    private javax.persistence.Query peminjamanQuery1;
    private javax.persistence.EntityManager persistenceEntityManager;
    private com.toedter.calendar.JDateChooser pilihTanggalKembali;
    private com.toedter.calendar.JDateChooser pilihTanggalPinjam;
    private javax.swing.JTable tabelPeminjaman;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    @Override
    public void editActionPerformed(ActionEvent evt) {
        id                          = Integer.parseInt(idSelected.getText());
        closeWindow(new DendaList(), this);
    }

    @Override
    public void addActionPerformed(ActionEvent evt) {
        DaoPeminjam daopeminjam     = new DaoPeminjam(Peminjam.class);
        Peminjam anggota            = new Peminjam();
        anggota                     = daopeminjam.findById(Integer.parseInt(
                                                        jTextField3.getText()));
        if (anggota != null) {
            getValue();
            JOptionPane.showMessageDialog(this, "BERHASIL MEMINJAM !! ");
        } else {
            JOptionPane.showMessageDialog(this, "BELUM TERDAFTAR !! ");
        }
        closeWindow(new TransaksiPeminjaman(), this);
    }

    @Override
    public void deleteActionPerformed(ActionEvent evt) {
        Daopeminjaman daopeminjaman  = new Daopeminjaman(peminjaman.class);
        id                          = Integer.parseInt(idSelected.getText());
        daopeminjaman.delete(id);
        closeWindow(new TransaksiPeminjaman(), this);

    }
}
