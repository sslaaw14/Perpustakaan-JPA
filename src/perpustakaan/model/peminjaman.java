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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "peminjaman")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "peminjaman.findAll", query = "SELECT p FROM peminjaman p"),
    @NamedQuery(name = "peminjaman.findById", query = "SELECT p FROM peminjaman p WHERE p.id = :id"),
    @NamedQuery(name = "peminjaman.findByIdAnggota", query = "SELECT p FROM peminjaman p WHERE p.idAnggota = :idAnggota"),
    @NamedQuery(name = "peminjaman.findByNama", query = "SELECT p FROM peminjaman p WHERE p.nama = :nama"),
    @NamedQuery(name = "peminjaman.findByTanggalPinjam", query = "SELECT p FROM peminjaman p WHERE p.tanggalPinjam = :tanggalPinjam"),
    @NamedQuery(name = "peminjaman.findByTanggalKembali", query = "SELECT p FROM peminjaman p WHERE p.tanggalKembali = :tanggalKembali"),
    @NamedQuery(name = "peminjaman.findByStatus", query = "SELECT p FROM peminjaman p WHERE p.status = :status")})
public class peminjaman implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "id_anggota")
    private int idAnggota;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "tanggal_pinjam")
    private String tanggalPinjam;
    @Basic(optional = false)
    @Column(name = "tanggal_kembali")
    private String tanggalKembali;
    @Column(name = "status")
    private String status;
    @JoinColumn(name = "id_buku", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Buku idBuku;

    public peminjaman() {
    }

    public peminjaman(Integer id) {
        this.id = id;
    }

    public peminjaman(Integer id, int idAnggota, String nama, String tanggalPinjam, String tanggalKembali) {
        this.id = id;
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public int getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(int idAnggota) {
        int oldIdAnggota = this.idAnggota;
        this.idAnggota = idAnggota;
        changeSupport.firePropertyChange("idAnggota", oldIdAnggota, idAnggota);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        String oldTanggalPinjam = this.tanggalPinjam;
        this.tanggalPinjam = tanggalPinjam;
        changeSupport.firePropertyChange("tanggalPinjam", oldTanggalPinjam, tanggalPinjam);
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(String tanggalKembali) {
        String oldTanggalKembali = this.tanggalKembali;
        this.tanggalKembali = tanggalKembali;
        changeSupport.firePropertyChange("tanggalKembali", oldTanggalKembali, tanggalKembali);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    public Buku getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(Buku idBuku) {
        Buku oldIdBuku = this.idBuku;
        this.idBuku = idBuku;
        changeSupport.firePropertyChange("idBuku", oldIdBuku, idBuku);
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
        if (!(object instanceof peminjaman)) {
            return false;
        }
        peminjaman other = (peminjaman) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "perpustakaan.model.peminjaman[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
