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
@Table(name = "analisisproporcionandina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Analisisproporcionandina.findAll", query = "SELECT a FROM Analisisproporcionandina a")
    , @NamedQuery(name = "Analisisproporcionandina.findByCodigoa", query = "SELECT a FROM Analisisproporcionandina a WHERE a.codigoa = :codigoa")
    , @NamedQuery(name = "Analisisproporcionandina.findByNombrea", query = "SELECT a FROM Analisisproporcionandina a WHERE a.nombrea = :nombrea")
    , @NamedQuery(name = "Analisisproporcionandina.findByDescripciona", query = "SELECT a FROM Analisisproporcionandina a WHERE a.descripciona = :descripciona")
    , @NamedQuery(name = "Analisisproporcionandina.findByAltura", query = "SELECT a FROM Analisisproporcionandina a WHERE a.altura = :altura")
    , @NamedQuery(name = "Analisisproporcionandina.findByAncho", query = "SELECT a FROM Analisisproporcionandina a WHERE a.ancho = :ancho")
    , @NamedQuery(name = "Analisisproporcionandina.findByRazon", query = "SELECT a FROM Analisisproporcionandina a WHERE a.razon = :razon")
    , @NamedQuery(name = "Analisisproporcionandina.findByRango", query = "SELECT a FROM Analisisproporcionandina a WHERE a.rango = :rango")})
public class Analisisproporcionandina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigoa")
    private String codigoa;
    @Column(name = "nombrea")
    private String nombrea;
    @Column(name = "descripciona")
    private String descripciona;
    @Column(name = "altura")
    private String altura;
    @Column(name = "ancho")
    private String ancho;
    @Column(name = "razon")
    private String razon;
    @Column(name = "rango")
    private String rango;
    @JoinColumn(name = "idplanta", referencedColumnName = "idplanta")
    @ManyToOne
    private Planta idplanta;

    public Analisisproporcionandina() {
    }

    public Analisisproporcionandina(String codigoa) {
        this.codigoa = codigoa;
    }

    public String getCodigoa() {
        return codigoa;
    }

    public void setCodigoa(String codigoa) {
        this.codigoa = codigoa;
    }

    public String getNombrea() {
        return nombrea;
    }

    public void setNombrea(String nombrea) {
        this.nombrea = nombrea;
    }

    public String getDescripciona() {
        return descripciona;
    }

    public void setDescripciona(String descripciona) {
        this.descripciona = descripciona;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getAncho() {
        return ancho;
    }

    public void setAncho(String ancho) {
        this.ancho = ancho;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
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
        hash += (codigoa != null ? codigoa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Analisisproporcionandina)) {
            return false;
        }
        Analisisproporcionandina other = (Analisisproporcionandina) object;
        if ((this.codigoa == null && other.codigoa != null) || (this.codigoa != null && !this.codigoa.equals(other.codigoa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Analisisproporcionandina[ codigoa=" + codigoa + " ]";
    }
    
}
