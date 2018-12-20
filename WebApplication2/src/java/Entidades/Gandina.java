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
@Table(name = "gandina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gandina.findAll", query = "SELECT g FROM Gandina g")
    , @NamedQuery(name = "Gandina.findByIdandina", query = "SELECT g FROM Gandina g WHERE g.idandina = :idandina")
    , @NamedQuery(name = "Gandina.findByNombreandina", query = "SELECT g FROM Gandina g WHERE g.nombreandina = :nombreandina")
    , @NamedQuery(name = "Gandina.findByDescripcionandina", query = "SELECT g FROM Gandina g WHERE g.descripcionandina = :descripcionandina")
    , @NamedQuery(name = "Gandina.findByTipoandina", query = "SELECT g FROM Gandina g WHERE g.tipoandina = :tipoandina")
    , @NamedQuery(name = "Gandina.findByUbicacionimagenandina", query = "SELECT g FROM Gandina g WHERE g.ubicacionimagenandina = :ubicacionimagenandina")})
public class Gandina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idandina")
    private Integer idandina;
    @Column(name = "nombreandina")
    private String nombreandina;
    @Column(name = "descripcionandina")
    private String descripcionandina;
    @Column(name = "tipoandina")
    private Integer tipoandina;
    @Column(name = "ubicacionimagenandina")
    private String ubicacionimagenandina;
    @JoinColumn(name = "idplanta", referencedColumnName = "idplanta")
    @ManyToOne
    private Planta idplanta;

    public Gandina() {
    }

    public Gandina(Integer idandina) {
        this.idandina = idandina;
    }

    public Integer getIdandina() {
        return idandina;
    }

    public void setIdandina(Integer idandina) {
        this.idandina = idandina;
    }

    public String getNombreandina() {
        return nombreandina;
    }

    public void setNombreandina(String nombreandina) {
        this.nombreandina = nombreandina;
    }

    public String getDescripcionandina() {
        return descripcionandina;
    }

    public void setDescripcionandina(String descripcionandina) {
        this.descripcionandina = descripcionandina;
    }

    public Integer getTipoandina() {
        return tipoandina;
    }

    public void setTipoandina(Integer tipoandina) {
        this.tipoandina = tipoandina;
    }

    public String getUbicacionimagenandina() {
        return ubicacionimagenandina;
    }

    public void setUbicacionimagenandina(String ubicacionimagenandina) {
        this.ubicacionimagenandina = ubicacionimagenandina;
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
        hash += (idandina != null ? idandina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gandina)) {
            return false;
        }
        Gandina other = (Gandina) object;
        if ((this.idandina == null && other.idandina != null) || (this.idandina != null && !this.idandina.equals(other.idandina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Gandina[ idandina=" + idandina + " ]";
    }
    
}
