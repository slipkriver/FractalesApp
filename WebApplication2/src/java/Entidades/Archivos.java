/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Isaac Torres
 */
@Entity
@Table(name = "archivos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Archivos.findAll", query = "SELECT a FROM Archivos a")
    , @NamedQuery(name = "Archivos.findByIaArchivo", query = "SELECT a FROM Archivos a WHERE a.iaArchivo = :iaArchivo")
    , @NamedQuery(name = "Archivos.findByNombrearch", query = "SELECT a FROM Archivos a WHERE a.nombrearch = :nombrearch")
    , @NamedQuery(name = "Archivos.findByDescripcionarch", query = "SELECT a FROM Archivos a WHERE a.descripcionarch = :descripcionarch")
    , @NamedQuery(name = "Archivos.findByUbicacion", query = "SELECT a FROM Archivos a WHERE a.ubicacion = :ubicacion")})
public class Archivos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ia_archivo")
    private String iaArchivo;
    @Column(name = "nombrearch")
    private String nombrearch;
    @Column(name = "descripcionarch")
    private String descripcionarch;
    @Column(name = "ubicacion")
    private String ubicacion;
    @OneToMany(mappedBy = "iaArchivo")
    private Collection<TipoArchivo> tipoArchivoCollection;
    @JoinColumn(name = "idvector", referencedColumnName = "idvector")
    @ManyToOne
    private Vector idvector;

    public Archivos() {
    }

    public Archivos(String iaArchivo) {
        this.iaArchivo = iaArchivo;
    }

    public String getIaArchivo() {
        return iaArchivo;
    }

    public void setIaArchivo(String iaArchivo) {
        this.iaArchivo = iaArchivo;
    }

    public String getNombrearch() {
        return nombrearch;
    }

    public void setNombrearch(String nombrearch) {
        this.nombrearch = nombrearch;
    }

    public String getDescripcionarch() {
        return descripcionarch;
    }

    public void setDescripcionarch(String descripcionarch) {
        this.descripcionarch = descripcionarch;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @XmlTransient
    public Collection<TipoArchivo> getTipoArchivoCollection() {
        return tipoArchivoCollection;
    }

    public void setTipoArchivoCollection(Collection<TipoArchivo> tipoArchivoCollection) {
        this.tipoArchivoCollection = tipoArchivoCollection;
    }

    public Vector getIdvector() {
        return idvector;
    }

    public void setIdvector(Vector idvector) {
        this.idvector = idvector;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iaArchivo != null ? iaArchivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Archivos)) {
            return false;
        }
        Archivos other = (Archivos) object;
        if ((this.iaArchivo == null && other.iaArchivo != null) || (this.iaArchivo != null && !this.iaArchivo.equals(other.iaArchivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Archivos[ iaArchivo=" + iaArchivo + " ]";
    }
    
}
