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
@Table(name = "ubicacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ubicacion.findAll", query = "SELECT u FROM Ubicacion u")
    , @NamedQuery(name = "Ubicacion.findByIdUbicacion", query = "SELECT u FROM Ubicacion u WHERE u.idUbicacion = :idUbicacion")
    , @NamedQuery(name = "Ubicacion.findByValorx", query = "SELECT u FROM Ubicacion u WHERE u.valorx = :valorx")
    , @NamedQuery(name = "Ubicacion.findByValory", query = "SELECT u FROM Ubicacion u WHERE u.valory = :valory")
    , @NamedQuery(name = "Ubicacion.findByDescripcion", query = "SELECT u FROM Ubicacion u WHERE u.descripcion = :descripcion")})
public class Ubicacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_ubicacion")
    private String idUbicacion;
    @Column(name = "valorx")
    private String valorx;
    @Column(name = "valory")
    private String valory;
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "idplanta", referencedColumnName = "idplanta")
    @ManyToOne
    private Planta idplanta;

    public Ubicacion() {
    }

    public Ubicacion(String idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(String idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getValorx() {
        return valorx;
    }

    public void setValorx(String valorx) {
        this.valorx = valorx;
    }

    public String getValory() {
        return valory;
    }

    public void setValory(String valory) {
        this.valory = valory;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        hash += (idUbicacion != null ? idUbicacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ubicacion)) {
            return false;
        }
        Ubicacion other = (Ubicacion) object;
        if ((this.idUbicacion == null && other.idUbicacion != null) || (this.idUbicacion != null && !this.idUbicacion.equals(other.idUbicacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Ubicacion[ idUbicacion=" + idUbicacion + " ]";
    }
    
}
