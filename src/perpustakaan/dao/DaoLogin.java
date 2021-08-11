/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan.dao;

import perpustakaan.model.Login;

/**
 *
 * @author ASUS
 */
public class DaoLogin extends BaseDao<Login>{
    public DaoLogin(Class<Login> type) {
        super(type);
    }
    
    public void update(int id, Login masuk){
        startTransaction(PERSISTANCE_META);
        Login editlogin = entityManager.find(Login.class, id);
        
        editlogin.setUsername(masuk.getUsername());
        editlogin.setPassword(masuk.getPassword());
       
        
        entityManager.getTransaction().commit();
        endTransaction();
       
    }
}
