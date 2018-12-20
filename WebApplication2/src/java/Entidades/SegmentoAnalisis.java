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
@Table(name = "segmento_analisis")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SegmentoAnalisis.findAll", query = "SELECT s FROM SegmentoAnalisis s")
    , @NamedQuery(name = "SegmentoAnalisis.findByIdsegmento", query = "SELECT s FROM SegmentoAnalisis s WHERE s.idsegmento = :idsegmento")
    , @NamedQuery(name = "SegmentoAnalisis.findByNombreu", query = "SELECT s FROM SegmentoAnalisis s WHERE s.nombreu = :nombreu")
    , @NamedQuery(name = "SegmentoAnalisis.findByDescripcion", query = "SELECT s FROM SegmentoAnalisis s WHERE s.descripcion = :descripcion")})
public class SegmentoAnalisis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idsegmento")
    private Integer idsegmento;
    @Column(name = "nombreu")
    private String nombreu;
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "idplanta", referencedColumnName = "idplanta")
    @ManyToOne
    private Planta idplanta;

    public SegmentoAnalisis() {
    }

    public SegmentoAnalisis(Integer idsegmento) {
        this.idsegmento = idsegmento;
    }

    public Integer getIdsegmento() {
        return idsegmento;
    }

    public void setIdsegmento(Integer idsegmento) {
        this.idsegmento = idsegmento;
    }

    public String getNombreu() {
        return nombreu;
    }

    public void setNombreu(String nombreu) {
        this.nombreu = nombreu;
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
        hash += (idsegmento != null ? idsegmento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SegmentoAnalisis)) {
            return false;
        }
        SegmentoAnalisis other = (SegmentoAnalisis) object;
        if ((this.idsegmento == null && other.idsegmento != null) || (this.idsegmento != null && !this.idsegmento.equals(other.idsegmento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.SegmentoAnalisis[ idsegmento=" + idsegmento + " ]";
    }
    
}
