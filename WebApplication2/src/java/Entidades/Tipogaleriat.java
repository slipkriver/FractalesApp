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
@Table(name = "tipogaleriat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipogaleriat.findAll", query = "SELECT t FROM Tipogaleriat t")
    , @NamedQuery(name = "Tipogaleriat.findByIdTipog", query = "SELECT t FROM Tipogaleriat t WHERE t.idTipog = :idTipog")
    , @NamedQuery(name = "Tipogaleriat.findByNombreTipog", query = "SELECT t FROM Tipogaleriat t WHERE t.nombreTipog = :nombreTipog")
    , @NamedQuery(name = "Tipogaleriat.findByDescripciontg", query = "SELECT t FROM Tipogaleriat t WHERE t.descripciontg = :descripciontg")})
public class Tipogaleriat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_tipog")
    private String idTipog;
    @Column(name = "nombre_tipog")
    private String nombreTipog;
    @Column(name = "descripciontg")
    private String descripciontg;
    @JoinColumn(name = "idtecnica", referencedColumnName = "idtecnica")
    @ManyToOne
    private Gtecnica idtecnica;

    public Tipogaleriat() {
    }

    public Tipogaleriat(String idTipog) {
        this.idTipog = idTipog;
    }

    public String getIdTipog() {
        return idTipog;
    }

    public void setIdTipog(String idTipog) {
        this.idTipog = idTipog;
    }

    public String getNombreTipog() {
        return nombreTipog;
    }

    public void setNombreTipog(String nombreTipog) {
        this.nombreTipog = nombreTipog;
    }

    public String getDescripciontg() {
        return descripciontg;
    }

    public void setDescripciontg(String descripciontg) {
        this.descripciontg = descripciontg;
    }

    public Gtecnica getIdtecnica() {
        return idtecnica;
    }

    public void setIdtecnica(Gtecnica idtecnica) {
        this.idtecnica = idtecnica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipog != null ? idTipog.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipogaleriat)) {
            return false;
        }
        Tipogaleriat other = (Tipogaleriat) object;
        if ((this.idTipog == null && other.idTipog != null) || (this.idTipog != null && !this.idTipog.equals(other.idTipog))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Tipogaleriat[ idTipog=" + idTipog + " ]";
    }
    
}
