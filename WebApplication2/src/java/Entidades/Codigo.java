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
@Table(name = "codigo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Codigo.findAll", query = "SELECT c FROM Codigo c")
    , @NamedQuery(name = "Codigo.findByIdcodigo", query = "SELECT c FROM Codigo c WHERE c.idcodigo = :idcodigo")
    , @NamedQuery(name = "Codigo.findBySiglaespecie", query = "SELECT c FROM Codigo c WHERE c.siglaespecie = :siglaespecie")
    , @NamedQuery(name = "Codigo.findBySiglareserva", query = "SELECT c FROM Codigo c WHERE c.siglareserva = :siglareserva")
    , @NamedQuery(name = "Codigo.findByNumerof", query = "SELECT c FROM Codigo c WHERE c.numerof = :numerof")})
public class Codigo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idcodigo")
    private String idcodigo;
    @Column(name = "siglaespecie")
    private String siglaespecie;
    @Column(name = "siglareserva")
    private String siglareserva;
    @Column(name = "numerof")
    private String numerof;
    @JoinColumn(name = "idplanta", referencedColumnName = "idplanta")
    @ManyToOne
    private Planta idplanta;

    public Codigo() {
    }

    public Codigo(String idcodigo) {
        this.idcodigo = idcodigo;
    }

    public String getIdcodigo() {
        return idcodigo;
    }

    public void setIdcodigo(String idcodigo) {
        this.idcodigo = idcodigo;
    }

    public String getSiglaespecie() {
        return siglaespecie;
    }

    public void setSiglaespecie(String siglaespecie) {
        this.siglaespecie = siglaespecie;
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

    public Planta getIdplanta() {
        return idplanta;
    }

    public void setIdplanta(Planta idplanta) {
        this.idplanta = idplanta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcodigo != null ? idcodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Codigo)) {
            return false;
        }
        Codigo other = (Codigo) object;
        if ((this.idcodigo == null && other.idcodigo != null) || (this.idcodigo != null && !this.idcodigo.equals(other.idcodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Codigo[ idcodigo=" + idcodigo + " ]";
    }
    
}
