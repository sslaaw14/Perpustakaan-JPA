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
@Table(name = "jenis_buku")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "jenis_buku.findAll", 
                query = "SELECT j FROM JenisBuku j"),
    @NamedQuery(name = "jenis_buku.findById", 
                query = "SELECT j FROM JenisBuku j WHERE j.id = :id"),
    @NamedQuery(name = "jenis_buku.findByJenis", 
                query = "SELECT j FROM JenisBuku j WHERE j.jenis = :jenis")})
public class JenisBuku implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "JENIS")
    private String jenis;

    public JenisBuku() {
    }

    public JenisBuku(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        String oldJenis = this.jenis;
        this.jenis = jenis;
        changeSupport.firePropertyChange("jenis", oldJenis, jenis);
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
        if (!(object instanceof JenisBuku)) {
            return false;
        }
        JenisBuku other = (JenisBuku) object;
        if ((this.id == null && other.id != null) || (this.id != null 
             && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "perpustakaan.model.jenis_buku[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
