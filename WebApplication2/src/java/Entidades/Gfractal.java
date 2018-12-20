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
@Table(name = "gfractal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gfractal.findAll", query = "SELECT g FROM Gfractal g")
    , @NamedQuery(name = "Gfractal.findByAttribidgaleriaf", query = "SELECT g FROM Gfractal g WHERE g.attribidgaleriaf = :attribidgaleriaf")
    , @NamedQuery(name = "Gfractal.findByNombregf", query = "SELECT g FROM Gfractal g WHERE g.nombregf = :nombregf")
    , @NamedQuery(name = "Gfractal.findByDescripciongf", query = "SELECT g FROM Gfractal g WHERE g.descripciongf = :descripciongf")
    , @NamedQuery(name = "Gfractal.findByUbicacionimagengf", query = "SELECT g FROM Gfractal g WHERE g.ubicacionimagengf = :ubicacionimagengf")})
public class Gfractal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "attribidgaleriaf")
    private String attribidgaleriaf;
    @Column(name = "nombregf")
    private String nombregf;
    @Column(name = "descripciongf")
    private String descripciongf;
    @Column(name = "ubicacionimagengf")
    private String ubicacionimagengf;
    @JoinColumn(name = "idplanta", referencedColumnName = "idplanta")
    @ManyToOne
    private Planta idplanta;

    public Gfractal() {
    }

    public Gfractal(String attribidgaleriaf) {
        this.attribidgaleriaf = attribidgaleriaf;
    }

    public String getAttribidgaleriaf() {
        return attribidgaleriaf;
    }

    public void setAttribidgaleriaf(String attribidgaleriaf) {
        this.attribidgaleriaf = attribidgaleriaf;
    }

    public String getNombregf() {
        return nombregf;
    }

    public void setNombregf(String nombregf) {
        this.nombregf = nombregf;
    }

    public String getDescripciongf() {
        return descripciongf;
    }

    public void setDescripciongf(String descripciongf) {
        this.descripciongf = descripciongf;
    }

    public String getUbicacionimagengf() {
        return ubicacionimagengf;
    }

    public void setUbicacionimagengf(String ubicacionimagengf) {
        this.ubicacionimagengf = ubicacionimagengf;
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
        hash += (attribidgaleriaf != null ? attribidgaleriaf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gfractal)) {
            return false;
        }
        Gfractal other = (Gfractal) object;
        if ((this.attribidgaleriaf == null && other.attribidgaleriaf != null) || (this.attribidgaleriaf != null && !this.attribidgaleriaf.equals(other.attribidgaleriaf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Gfractal[ attribidgaleriaf=" + attribidgaleriaf + " ]";
    }
    
}
