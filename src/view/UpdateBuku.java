package view;

import java.util.List;
import perpustakaan.dao.DaoBuku;
import perpustakaan.dao.DaoJenisBuku;
import perpustakaan.model.Buku;
import perpustakaan.model.JenisBuku;
import static view.DaftarBuku.id;

public abstract class UpdateBuku extends BaseUpdate {
    Buku book                   = new Buku();
    DaoBuku daobuku             = new DaoBuku(Buku.class);
    Buku hasil                  = daobuku.findById(id);
    int idjenis;
   
    public UpdateBuku() {
        initComponents();
        setLocationRelativeTo(this);
        setJudul("UPDATE BUKU");
        setValue();
    }
    
    private void setValue() {
        setGenre();
        judulBuku.setText(hasil.getJudulBuku());
        namaPengarang.setText(hasil.getPengarang());
        penerbitBuku.setText(hasil.getPenerbit());
        String jumlah            = String.valueOf(hasil.getJumlah());
        jumlahBuku.setText(jumlah);
    }
    
    private void setGenre() {
        DaoJenisBuku daojenis_buku = new DaoJenisBuku(JenisBuku.class); 
        List<JenisBuku> resultAll  = daojenis_buku.findAll();
        
        for (int i=0;i<resultAll.size();i++) {
            JenisBuku printUser    = resultAll.get(i);
            genreList.addItem(printUser.getJenis());
            
            if (printUser.getJenis() == hasil.getJudulBuku());
            idjenis                = i;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        judulBuku = new javax.swing.JTextField();
        namaPengarang = new javax.swing.JTextField();
        penerbitBuku = new javax.swing.JTextField();
        genreList = new javax.swing.JComboBox<String>();
        jumlahBuku = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel2.setText("Judul");

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel3.setText("Pengarang");

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel4.setText("Penerbit");

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel5.setText("Jenis Buku");

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel6.setText("Jumlah");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jumlahBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreList, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(penerbitBuku, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                        .addComponent(namaPengarang, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(judulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(namaPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(penerbitBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(genreList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jumlahBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void getValue() {
        book.setJudulBuku(judulBuku.getText());
        book.setPengarang(namaPengarang.getText());
        book.setPenerbit(penerbitBuku.getText());
        getGenre();
        book.setIdJenisBuku(idjenis);
        int jumlah2                = Integer.parseInt(jumlahBuku.getText());
        book.setJumlah(jumlah2);
    }
    
    private void getGenre() {
        DaoJenisBuku daojenis_buku  = new DaoJenisBuku(JenisBuku.class); 
        List<JenisBuku> resultAll   = daojenis_buku.findAll();
        String value                = genreList.getItemAt(
                                                 genreList.getSelectedIndex());
        for(int i=0;i<resultAll.size();i++){
            JenisBuku jb            = resultAll.get(i);
            
            if(jb.getJenis().equals(value))
                idjenis             = jb.getId();
        }
        JenisBuku hasil             = daojenis_buku.findById(idjenis);
    }
    
    @Override
    public void updateActionPerformed(java.awt.event.ActionEvent evt) {
        getValue();
        daobuku.update(id, book);
        closeWindow(new DaftarBuku(), this);
    }
    
    @Override
    public void batalActionPerformed(java.awt.event.ActionEvent evt) {
        closeWindow(new DaftarBuku(), this);
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
            java.util.logging.Logger.getLogger(UpdateBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> genreList;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField judulBuku;
    private javax.swing.JTextField jumlahBuku;
    private javax.swing.JTextField namaPengarang;
    private javax.swing.JTextField penerbitBuku;
    // End of variables declaration//GEN-END:variables
}
