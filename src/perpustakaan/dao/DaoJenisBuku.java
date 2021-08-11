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
import perpustakaan.model.JenisBuku;

/**
 *
 * @author ASUS
 */
public class DaoJenisBuku extends BaseDao<JenisBuku> {

    public DaoJenisBuku(Class<JenisBuku> type) {
        super(type);
    }
    public void update(int id, JenisBuku jenis){
        startTransaction(PERSISTANCE_META);
        JenisBuku editjenis_buku = entityManager.find(JenisBuku.class, id);
        
        editjenis_buku.setJenis(jenis.getJenis());
        
        entityManager.getTransaction().commit();
        
        endTransaction();
    }
    
 
}
