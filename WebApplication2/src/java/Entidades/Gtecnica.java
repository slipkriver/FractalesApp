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
@Table(name = "gtecnica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gtecnica.findAll", query = "SELECT g FROM Gtecnica g")
    , @NamedQuery(name = "Gtecnica.findByIdtecnica", query = "SELECT g FROM Gtecnica g WHERE g.idtecnica = :idtecnica")
    , @NamedQuery(name = "Gtecnica.findByNombretecnica", query = "SELECT g FROM Gtecnica g WHERE g.nombretecnica = :nombretecnica")
    , @NamedQuery(name = "Gtecnica.findByDescripciontecnica", query = "SELECT g FROM Gtecnica g WHERE g.descripciontecnica = :descripciontecnica")
    , @NamedQuery(name = "Gtecnica.findByUbicacionimagentecnica", query = "SELECT g FROM Gtecnica g WHERE g.ubicacionimagentecnica = :ubicacionimagentecnica")})
public class Gtecnica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idtecnica")
    private Integer idtecnica;
    @Column(name = "nombretecnica")
    private String nombretecnica;
    @Column(name = "descripciontecnica")
    private String descripciontecnica;
    @Column(name = "ubicacionimagentecnica")
    private String ubicacionimagentecnica;
    @JoinColumn(name = "idplanta", referencedColumnName = "idplanta")
    @ManyToOne
    private Planta idplanta;
    @OneToMany(mappedBy = "idtecnica")
    private Collection<Tipogaleriat> tipogaleriatCollection;

    public Gtecnica() {
    }

    public Gtecnica(Integer idtecnica) {
        this.idtecnica = idtecnica;
    }

    public Integer getIdtecnica() {
        return idtecnica;
    }

    public void setIdtecnica(Integer idtecnica) {
        this.idtecnica = idtecnica;
    }

    public String getNombretecnica() {
        return nombretecnica;
    }

    public void setNombretecnica(String nombretecnica) {
        this.nombretecnica = nombretecnica;
    }

    public String getDescripciontecnica() {
        return descripciontecnica;
    }

    public void setDescripciontecnica(String descripciontecnica) {
        this.descripciontecnica = descripciontecnica;
    }

    public String getUbicacionimagentecnica() {
        return ubicacionimagentecnica;
    }

    public void setUbicacionimagentecnica(String ubicacionimagentecnica) {
        this.ubicacionimagentecnica = ubicacionimagentecnica;
    }

    public Planta getIdplanta() {
        return idplanta;
    }

    public void setIdplanta(Planta idplanta) {
        this.idplanta = idplanta;
    }

    @XmlTransient
    public Collection<Tipogaleriat> getTipogaleriatCollection() {
        return tipogaleriatCollection;
    }

    public void setTipogaleriatCollection(Collection<Tipogaleriat> tipogaleriatCollection) {
        this.tipogaleriatCollection = tipogaleriatCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtecnica != null ? idtecnica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gtecnica)) {
            return false;
        }
        Gtecnica other = (Gtecnica) object;
        if ((this.idtecnica == null && other.idtecnica != null) || (this.idtecnica != null && !this.idtecnica.equals(other.idtecnica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Gtecnica[ idtecnica=" + idtecnica + " ]";
    }
    
}
