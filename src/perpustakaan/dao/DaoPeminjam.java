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
import perpustakaan.model.Peminjam;

/**
 *
 * @author ASUS
 */
public class DaoPeminjam extends BaseDao<Peminjam> {

   public DaoPeminjam(Class<Peminjam> type) {
        super(type);
    }
    
    public void update(int id, Peminjam anggota){
        startTransaction(PERSISTANCE_META);
        Peminjam editpeminjam = entityManager.find(Peminjam.class, id);
        
        editpeminjam.setNama(anggota.getNama());
        editpeminjam.setAlamat(anggota.getAlamat());
        editpeminjam.setJenisKelamin(anggota.getJenisKelamin());
        
        entityManager.getTransaction().commit();
        endTransaction();
       
    }
    
    
}
