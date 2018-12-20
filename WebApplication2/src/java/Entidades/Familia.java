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
@Table(name = "familia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Familia.findAll", query = "SELECT f FROM Familia f")
    , @NamedQuery(name = "Familia.findByIdfamilia", query = "SELECT f FROM Familia f WHERE f.idfamilia = :idfamilia")
    , @NamedQuery(name = "Familia.findByNombrefamilia", query = "SELECT f FROM Familia f WHERE f.nombrefamilia = :nombrefamilia")
    , @NamedQuery(name = "Familia.findByDescripcionfamilia", query = "SELECT f FROM Familia f WHERE f.descripcionfamilia = :descripcionfamilia")})
public class Familia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idfamilia")
    private Integer idfamilia;
    @Column(name = "nombrefamilia")
    private String nombrefamilia;
    @Column(name = "descripcionfamilia")
    private String descripcionfamilia;
    @OneToMany(mappedBy = "idfamilia")
    private Collection<Planta> plantaCollection;
    @JoinColumn(name = "idplanta", referencedColumnName = "idplanta")
    @ManyToOne
    private Planta idplanta;

    public Familia() {
    }

    public Familia(Integer idfamilia) {
        this.idfamilia = idfamilia;
    }

    public Integer getIdfamilia() {
        return idfamilia;
    }

    public void setIdfamilia(Integer idfamilia) {
        this.idfamilia = idfamilia;
    }

    public String getNombrefamilia() {
        return nombrefamilia;
    }

    public void setNombrefamilia(String nombrefamilia) {
        this.nombrefamilia = nombrefamilia;
    }

    public String getDescripcionfamilia() {
        return descripcionfamilia;
    }

    public void setDescripcionfamilia(String descripcionfamilia) {
        this.descripcionfamilia = descripcionfamilia;
    }

    @XmlTransient
    public Collection<Planta> getPlantaCollection() {
        return plantaCollection;
    }

    public void setPlantaCollection(Collection<Planta> plantaCollection) {
        this.plantaCollection = plantaCollection;
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
        hash += (idfamilia != null ? idfamilia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Familia)) {
            return false;
        }
        Familia other = (Familia) object;
        if ((this.idfamilia == null && other.idfamilia != null) || (this.idfamilia != null && !this.idfamilia.equals(other.idfamilia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Familia[ idfamilia=" + idfamilia + " ]";
    }
    
}
