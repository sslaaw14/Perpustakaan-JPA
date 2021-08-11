/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "denda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "denda.findAll", query = "SELECT d FROM Denda d"),
    @NamedQuery(name = "denda.findById", 
                query = "SELECT d FROM Denda d WHERE d.id = :id"),
    @NamedQuery(name = "denda.findByIdPeminjam", 
              query = "SELECT d FROM Denda d WHERE d.idPeminjam = :idPeminjam"),
    @NamedQuery(name = "denda.findByDenda", 
                query = "SELECT d FROM Denda d WHERE d.denda = :denda")})
public class Denda implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "id_peminjam")
    private int idPeminjam;
    @Basic(optional = false)
    @Column(name = "denda")
    private String denda;

    public Denda() {
    }

    public Denda(Integer id) {
        this.id = id;
    }

    public Denda(Integer id, int idPeminjam, String denda) {
        this.id = id;
        this.idPeminjam = idPeminjam;
        this.denda = denda;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public int getIdPeminjam() {
        return idPeminjam;
    }

    public void setIdPeminjam(int idPeminjam) {
        int oldIdPeminjam = this.idPeminjam;
        this.idPeminjam = idPeminjam;
        changeSupport.firePropertyChange("idPeminjam", oldIdPeminjam, idPeminjam);
    }

    public String getDenda() {
        return denda;
    }

    public void setDenda(String denda) {
        String oldDenda = this.denda;
        this.denda = denda;
        changeSupport.firePropertyChange("denda", oldDenda, denda);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Denda)) {
            return false;
        }
        Denda other = (Denda) object;
        if ((this.id == null && other.id != null) || (this.id != null 
             && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "perpustakaan.model.denda[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
