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
@Table(name = "ggeneral")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ggeneral.findAll", query = "SELECT g FROM Ggeneral g")
    , @NamedQuery(name = "Ggeneral.findByIdgeneral", query = "SELECT g FROM Ggeneral g WHERE g.idgeneral = :idgeneral")
    , @NamedQuery(name = "Ggeneral.findByNombregeneral", query = "SELECT g FROM Ggeneral g WHERE g.nombregeneral = :nombregeneral")
    , @NamedQuery(name = "Ggeneral.findByUbicacionimagengeneral", query = "SELECT g FROM Ggeneral g WHERE g.ubicacionimagengeneral = :ubicacionimagengeneral")})
public class Ggeneral implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idgeneral")
    private Integer idgeneral;
    @Column(name = "nombregeneral")
    private String nombregeneral;
    @Column(name = "ubicacionimagengeneral")
    private String ubicacionimagengeneral;
    @JoinColumn(name = "idplanta", referencedColumnName = "idplanta")
    @ManyToOne
    private Planta idplanta;

    public Ggeneral() {
    }

    public Ggeneral(Integer idgeneral) {
        this.idgeneral = idgeneral;
    }

    public Integer getIdgeneral() {
        return idgeneral;
    }

    public void setIdgeneral(Integer idgeneral) {
        this.idgeneral = idgeneral;
    }

    public String getNombregeneral() {
        return nombregeneral;
    }

    public void setNombregeneral(String nombregeneral) {
        this.nombregeneral = nombregeneral;
    }

    public String getUbicacionimagengeneral() {
        return ubicacionimagengeneral;
    }

    public void setUbicacionimagengeneral(String ubicacionimagengeneral) {
        this.ubicacionimagengeneral = ubicacionimagengeneral;
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
        hash += (idgeneral != null ? idgeneral.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ggeneral)) {
            return false;
        }
        Ggeneral other = (Ggeneral) object;
        if ((this.idgeneral == null && other.idgeneral != null) || (this.idgeneral != null && !this.idgeneral.equals(other.idgeneral))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Ggeneral[ idgeneral=" + idgeneral + " ]";
    }
    
}
