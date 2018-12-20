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
@Table(name = "numeroficha")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Numeroficha.findAll", query = "SELECT n FROM Numeroficha n")
    , @NamedQuery(name = "Numeroficha.findByIdNumficha", query = "SELECT n FROM Numeroficha n WHERE n.idNumficha = :idNumficha")
    , @NamedQuery(name = "Numeroficha.findBySiglafichaespecie", query = "SELECT n FROM Numeroficha n WHERE n.siglafichaespecie = :siglafichaespecie")
    , @NamedQuery(name = "Numeroficha.findBySiglareserva", query = "SELECT n FROM Numeroficha n WHERE n.siglareserva = :siglareserva")
    , @NamedQuery(name = "Numeroficha.findByNumerof", query = "SELECT n FROM Numeroficha n WHERE n.numerof = :numerof")
    , @NamedQuery(name = "Numeroficha.findBySiglasegmento", query = "SELECT n FROM Numeroficha n WHERE n.siglasegmento = :siglasegmento")})
public class Numeroficha implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_numficha")
    private String idNumficha;
    @Column(name = "siglafichaespecie")
    private String siglafichaespecie;
    @Column(name = "siglareserva")
    private String siglareserva;
    @Column(name = "numerof")
    private String numerof;
    @Column(name = "siglasegmento")
    private String siglasegmento;
    @JoinColumn(name = "idplanta", referencedColumnName = "idplanta")
    @ManyToOne
    private Planta idplanta;

    public Numeroficha() {
    }

    public Numeroficha(String idNumficha) {
        this.idNumficha = idNumficha;
    }

    public String getIdNumficha() {
        return idNumficha;
    }

    public void setIdNumficha(String idNumficha) {
        this.idNumficha = idNumficha;
    }

    public String getSiglafichaespecie() {
        return siglafichaespecie;
    }

    public void setSiglafichaespecie(String siglafichaespecie) {
        this.siglafichaespecie = siglafichaespecie;
    }

    public String getSiglareserva() {
        return siglareserva;
    }

    public void setSiglareserva(String siglareserva) {
        this.siglareserva = siglareserva;
    }

    public String getNumerof() {
        return numerof;
    }

    public void setNumerof(String numerof) {
        this.numerof = numerof;
    }

    public String getSiglasegmento() {
        return siglasegmento;
    }

    public void setSiglasegmento(String siglasegmento) {
        this.siglasegmento = siglasegmento;
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
        hash += (idNumficha != null ? idNumficha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Numeroficha)) {
            return false;
        }
        Numeroficha other = (Numeroficha) object;
        if ((this.idNumficha == null && other.idNumficha != null) || (this.idNumficha != null && !this.idNumficha.equals(other.idNumficha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Numeroficha[ idNumficha=" + idNumficha + " ]";
    }
    
}
