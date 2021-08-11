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
import perpustakaan.model.Buku;

/**
 *
 * @author ASUS
 */
public class DaoBuku extends BaseDao<Buku>{
    
    public DaoBuku(Class<Buku> type) {
        super(type);
    }
    
    @Override
    public void update(int id, Buku book){
        startTransaction(PERSISTANCE_META);
        Buku editbuku = entityManager.find(Buku.class, id);
        
        editbuku.setJudulBuku(book.getJudulBuku());
        editbuku.setPengarang(book.getPengarang());
        editbuku.setPenerbit(book.getPenerbit());
        editbuku.setIdJenisBuku(book.getIdJenisBuku());
        editbuku.setJumlah(book.getJumlah());
        entityManager.getTransaction().commit();
        endTransaction();
       
    }
    
   
}
