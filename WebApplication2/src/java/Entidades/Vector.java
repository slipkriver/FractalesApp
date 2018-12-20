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
@Table(name = "vector")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vector.findAll", query = "SELECT v FROM Vector v")
    , @NamedQuery(name = "Vector.findByIdvector", query = "SELECT v FROM Vector v WHERE v.idvector = :idvector")
    , @NamedQuery(name = "Vector.findByDescripcionvector", query = "SELECT v FROM Vector v WHERE v.descripcionvector = :descripcionvector")
    , @NamedQuery(name = "Vector.findByTipovector", query = "SELECT v FROM Vector v WHERE v.tipovector = :tipovector")
    , @NamedQuery(name = "Vector.findByUbicacionimagenvector", query = "SELECT v FROM Vector v WHERE v.ubicacionimagenvector = :ubicacionimagenvector")})
public class Vector implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idvector")
    private Integer idvector;
    @Column(name = "descripcionvector")
    private String descripcionvector;
    @Column(name = "tipovector")
    private Integer tipovector;
    @Column(name = "ubicacionimagenvector")
    private String ubicacionimagenvector;
    @OneToMany(mappedBy = "idvector")
    private Collection<Archivos> archivosCollection;
    @JoinColumn(name = "idplanta", referencedColumnName = "idplanta")
    @ManyToOne
    private Planta idplanta;

    public Vector() {
    }

    public Vector(Integer idvector) {
        this.idvector = idvector;
    }

    public Integer getIdvector() {
        return idvector;
    }

    public void setIdvector(Integer idvector) {
        this.idvector = idvector;
    }

    public String getDescripcionvector() {
        return descripcionvector;
    }

    public void setDescripcionvector(String descripcionvector) {
        this.descripcionvector = descripcionvector;
    }

    public Integer getTipovector() {
        return tipovector;
    }

    public void setTipovector(Integer tipovector) {
        this.tipovector = tipovector;
    }

    public String getUbicacionimagenvector() {
        return ubicacionimagenvector;
    }

    public void setUbicacionimagenvector(String ubicacionimagenvector) {
        this.ubicacionimagenvector = ubicacionimagenvector;
    }

    @XmlTransient
    public Collection<Archivos> getArchivosCollection() {
        return archivosCollection;
    }

    public void setArchivosCollection(Collection<Archivos> archivosCollection) {
        this.archivosCollection = archivosCollection;
    }

    public Planta getIdplanta() {
        return idplanta;
    }

    public void setIdplanta(Planta idplanta) {
        this.idplanta = idplanta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvector != null ? idvector.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vector)) {
            return false;
        }
        Vector other = (Vector) object;
        if ((this.idvector == null && other.idvector != null) || (this.idvector != null && !this.idvector.equals(other.idvector))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Vector[ idvector=" + idvector + " ]";
    }
    
}
