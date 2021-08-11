/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import perpustakaan.model.peminjaman;

/**
 *
 * @author ASUS
 */
public class Daopeminjaman extends BaseDao<peminjaman> {

    public Daopeminjaman(Class<peminjaman> type) {
        super(type);
    }

    
    public void update(int id, peminjaman pinjam){
        startTransaction(PERSISTANCE_META);
        peminjaman editpeminjaman = entityManager.find(peminjaman.class, id);
        
        editpeminjaman.setNama(pinjam.getNama());
        editpeminjaman.setTanggalPinjam(pinjam.getTanggalPinjam());
        editpeminjaman.setTanggalKembali(pinjam.getTanggalKembali());
        editpeminjaman.setIdAnggota(pinjam.getIdAnggota());
        editpeminjaman.setIdBuku(pinjam.getIdBuku());
        editpeminjaman.setStatus(pinjam.getStatus());
        
        entityManager.getTransaction().commit();
        endTransaction();
    }
    
   
}
