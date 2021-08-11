/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "buku")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "buku.findAll", query = "SELECT b FROM Buku b"),
    @NamedQuery(name = "buku.findById", 
                query = "SELECT b FROM Buku b WHERE b.id = :id"),
    @NamedQuery(name = "buku.findByJudulBuku", 
                query = "SELECT b FROM Buku b WHERE b.judulBuku = :judulBuku"),
    @NamedQuery(name = "buku.findByPengarang", 
                query = "SELECT b FROM Buku b WHERE b.pengarang = :pengarang"),
    @NamedQuery(name = "buku.findByPenerbit", 
                query = "SELECT b FROM Buku b WHERE b.penerbit = :penerbit"),
    @NamedQuery(name = "buku.findByIdJenisBuku", 
                query = "SELECT b FROM Buku b WHERE b.idJenisBuku = :idJenisBuku"),
    @NamedQuery(name = "buku.findByJumlah", 
                query = "SELECT b FROM Buku b WHERE b.jumlah = :jumlah")})
public class Buku implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idBuku")
    private Collection<peminjaman> peminjamanCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "judul_buku")
    private String judulBuku;
    @Basic(optional = false)
    @Column(name = "pengarang")
    private String pengarang;
    @Basic(optional = false)
    @Column(name = "penerbit")
    private String penerbit;
    @Basic(optional = false)
    @Column(name = "id_jenis_buku")
    private int idJenisBuku;
    @Basic(optional = false)
    @Column(name = "jumlah")
    private int jumlah;

    public Buku() {
    }

    public Buku(Integer id) {
        this.id = id;
    }

    public Buku(Integer id, String judulBuku, String pengarang, 
                String penerbit, int idJenisBuku, int jumlah) {
        this.id = id;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.idJenisBuku = idJenisBuku;
        this.jumlah = jumlah;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        String oldJudulBuku = this.judulBuku;
        this.judulBuku = judulBuku;
        changeSupport.firePropertyChange("judulBuku", oldJudulBuku, judulBuku);
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        String oldPengarang = this.pengarang;
        this.pengarang = pengarang;
        changeSupport.firePropertyChange("pengarang", oldPengarang, pengarang);
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        String oldPenerbit = this.penerbit;
        this.penerbit = penerbit;
        changeSupport.firePropertyChange("penerbit", oldPenerbit, penerbit);
    }

    public int getIdJenisBuku() {
        return idJenisBuku;
    }

    public void setIdJenisBuku(int idJenisBuku) {
        int oldIdJenisBuku = this.idJenisBuku;
        this.idJenisBuku = idJenisBuku;
        changeSupport.firePropertyChange("idJenisBuku", 
                                        oldIdJenisBuku, idJenisBuku);
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        int oldJumlah = this.jumlah;
        this.jumlah = jumlah;
        changeSupport.firePropertyChange("jumlah", oldJumlah, jumlah);
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
        if (!(object instanceof Buku)) {
            return false;
        }
        Buku other = (Buku) object;
        if ((this.id == null && other.id != null) || (this.id != null 
            && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return judulBuku;
    }

    @XmlTransient
    public Collection<peminjaman> getPeminjamanCollection() {
        return peminjamanCollection;
    }

    public void setPeminjamanCollection(Collection<peminjaman> peminjamanCollection) {
        this.peminjamanCollection = peminjamanCollection;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
