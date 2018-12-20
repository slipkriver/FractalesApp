/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Isaac Torres
 */
@Entity
@Table(name = "tipo_archivo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoArchivo.findAll", query = "SELECT t FROM TipoArchivo t")
    , @NamedQuery(name = "TipoArchivo.findByIdTipoa", query = "SELECT t FROM TipoArchivo t WHERE t.idTipoa = :idTipoa")
    , @NamedQuery(name = "TipoArchivo.findByNombret", query = "SELECT t FROM TipoArchivo t WHERE t.nombret = :nombret")
    , @NamedQuery(name = "TipoArchivo.findByDescripciont", query = "SELECT t FROM TipoArchivo t WHERE t.descripciont = :descripciont")})
public class TipoArchivo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_tipoa")
    private String idTipoa;
    @Column(name = "nombret")
    private String nombret;
    @Column(name = "descripciont")
    private String descripciont;
    @JoinColumn(name = "ia_archivo", referencedColumnName = "ia_archivo")
    @ManyToOne
    private Archivos iaArchivo;

    public TipoArchivo() {
    }

    public TipoArchivo(String idTipoa) {
        this.idTipoa = idTipoa;
    }

    public String getIdTipoa() {
        return idTipoa;
    }

    public void setIdTipoa(String idTipoa) {
        this.idTipoa = idTipoa;
    }

    public String getNombret() {
        return nombret;
    }

    public void setNombret(String nombret) {
        this.nombret = nombret;
    }

    public String getDescripciont() {
        return descripciont;
    }

    public void setDescripciont(String descripciont) {
        this.descripciont = descripciont;
    }

    public Archivos getIaArchivo() {
        return iaArchivo;
    }

    public void setIaArchivo(Archivos iaArchivo) {
        this.iaArchivo = iaArchivo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoa != null ? idTipoa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoArchivo)) {
            return false;
        }
        TipoArchivo other = (TipoArchivo) object;
        if ((this.idTipoa == null && other.idTipoa != null) || (this.idTipoa != null && !this.idTipoa.equals(other.idTipoa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.TipoArchivo[ idTipoa=" + idTipoa + " ]";
    }
    
}
