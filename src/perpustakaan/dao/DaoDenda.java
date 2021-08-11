/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan.dao;

import perpustakaan.model.Denda;

/**
 *
 * @author ASUS
 */
public class DaoDenda extends BaseDao<Denda>{
    
    public DaoDenda(Class<Denda> type) {
        super(type);
    }

    @Override
    public void update(int id, Denda t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
