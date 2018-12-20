/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Isaac Torres
 */
@Entity
@Table(name = "planta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Planta.findAll", query = "SELECT p FROM Planta p")
    , @NamedQuery(name = "Planta.findByIdplanta", query = "SELECT p FROM Planta p WHERE p.idplanta = :idplanta")
    , @NamedQuery(name = "Planta.findByNombreplanta", query = "SELECT p FROM Planta p WHERE p.nombreplanta = :nombreplanta")
    , @NamedQuery(name = "Planta.findByDescripcionplanta", query = "SELECT p FROM Planta p WHERE p.descripcionplanta = :descripcionplanta")
    , @NamedQuery(name = "Planta.findByBaucherherbario", query = "SELECT p FROM Planta p WHERE p.baucherherbario = :baucherherbario")
    , @NamedQuery(name = "Planta.findByUbicacionarchimagenplanta", query = "SELECT p FROM Planta p WHERE p.ubicacionarchimagenplanta = :ubicacionarchimagenplanta")
    , @NamedQuery(name = "Planta.findByFecharecoleccion", query = "SELECT p FROM Planta p WHERE p.fecharecoleccion = :fecharecoleccion")})
public class Planta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idplanta")
    private Integer idplanta;
    @Column(name = "nombreplanta")
    private String nombreplanta;
    @Column(name = "descripcionplanta")
    private String descripcionplanta;
    @Column(name = "baucherherbario")
    private String baucherherbario;
    @Column(name = "ubicacionarchimagenplanta")
    private String ubicacionarchimagenplanta;
    @Column(name = "fecharecoleccion")
    @Temporal(TemporalType.DATE)
    private Date fecharecoleccion;
    @OneToMany(mappedBy = "idplanta")
    private Collection<Codigo> codigoCollection;
    @OneToMany(mappedBy = "idplanta")
    private Collection<Ubicacion> ubicacionCollection;
    @OneToMany(mappedBy = "idplanta")
    private Collection<Gfractal> gfractalCollection;
    @OneToMany(mappedBy = "idplanta")
    private Collection<Gtecnica> gtecnicaCollection;
    @JoinColumn(name = "idfamilia", referencedColumnName = "idfamilia")
    @ManyToOne
    private Familia idfamilia;
    @JoinColumn(name = "cedula", referencedColumnName = "cedula")
    @ManyToOne
    private Usuario cedula;
    @OneToMany(mappedBy = "idplanta")
    private Collection<Gandina> gandinaCollection;
    @OneToMany(mappedBy = "idplanta")
    private Collection<Analisisproporcionandina> analisisproporcionandinaCollection;
    @OneToMany(mappedBy = "idplanta")
    private Collection<SegmentoAnalisis> segmentoAnalisisCollection;
    @OneToMany(mappedBy = "idplanta")
    private Collection<Ggeneral> ggeneralCollection;
    @OneToMany(mappedBy = "idplanta")
    private Collection<Numeroficha> numerofichaCollection;
    @OneToMany(mappedBy = "idplanta")
    private Collection<Vector> vectorCollection;
    @OneToMany(mappedBy = "idplanta")
    private Collection<Reserva> reservaCollection;
    @OneToMany(mappedBy = "idplanta")
    private Collection<Familia> familiaCollection;

    public Planta() {
    }

    public Planta(Integer idplanta) {
        this.idplanta = idplanta;
    }

    public Integer getIdplanta() {
        return idplanta;
    }

    public void setIdplanta(Integer idplanta) {
        this.idplanta = idplanta;
    }

    public String getNombreplanta() {
        return nombreplanta;
    }

    public void setNombreplanta(String nombreplanta) {
        this.nombreplanta = nombreplanta;
    }

    public String getDescripcionplanta() {
        return descripcionplanta;
    }

    public void setDescripcionplanta(String descripcionplanta) {
        this.descripcionplanta = descripcionplanta;
    }

    public String getBaucherherbario() {
        return baucherherbario;
    }

    public void setBaucherherbario(String baucherherbario) {
        this.baucherherbario = baucherherbario;
    }

    public String getUbicacionarchimagenplanta() {
        return ubicacionarchimagenplanta;
    }

    public void setUbicacionarchimagenplanta(String ubicacionarchimagenplanta) {
        this.ubicacionarchimagenplanta = ubicacionarchimagenplanta;
    }

    public Date getFecharecoleccion() {
        return fecharecoleccion;
    }

    public void setFecharecoleccion(Date fecharecoleccion) {
        this.fecharecoleccion = fecharecoleccion;
    }

    @XmlTransient
    public Collection<Codigo> getCodigoCollection() {
        return codigoCollection;
    }

    public void setCodigoCollection(Collection<Codigo> codigoCollection) {
        this.codigoCollection = codigoCollection;
    }

    @XmlTransient
    public Collection<Ubicacion> getUbicacionCollection() {
        return ubicacionCollection;
    }

    public void setUbicacionCollection(Collection<Ubicacion> ubicacionCollection) {
        this.ubicacionCollection = ubicacionCollection;
    }

    @XmlTransient
    public Collection<Gfractal> getGfractalCollection() {
        return gfractalCollection;
    }

    public void setGfractalCollection(Collection<Gfractal> gfractalCollection) {
        this.gfractalCollection = gfractalCollection;
    }

    @XmlTransient
    public Collection<Gtecnica> getGtecnicaCollection() {
        return gtecnicaCollection;
    }

    public void setGtecnicaCollection(Collection<Gtecnica> gtecnicaCollection) {
        this.gtecnicaCollection = gtecnicaCollection;
    }

    public Familia getIdfamilia() {
        return idfamilia;
    }

    public void setIdfamilia(Familia idfamilia) {
        this.idfamilia = idfamilia;
    }

    public Usuario getCedula() {
        return cedula;
    }

    public void setCedula(Usuario cedula) {
        this.cedula = cedula;
    }

    @XmlTransient
    public Collection<Gandina> getGandinaCollection() {
        return gandinaCollection;
    }

    public void setGandinaCollection(Collection<Gandina> gandinaCollection) {
        this.gandinaCollection = gandinaCollection;
    }

    @XmlTransient
    public Collection<Analisisproporcionandina> getAnalisisproporcionandinaCollection() {
        return analisisproporcionandinaCollection;
    }

    public void setAnalisisproporcionandinaCollection(Collection<Analisisproporcionandina> analisisproporcionandinaCollection) {
        this.analisisproporcionandinaCollection = analisisproporcionandinaCollection;
    }

    @XmlTransient
    public Collection<SegmentoAnalisis> getSegmentoAnalisisCollection() {
        return segmentoAnalisisCollection;
    }

    public void setSegmentoAnalisisCollection(Collection<SegmentoAnalisis> segmentoAnalisisCollection) {
        this.segmentoAnalisisCollection = segmentoAnalisisCollection;
    }

    @XmlTransient
    public Collection<Ggeneral> getGgeneralCollection() {
        return ggeneralCollection;
    }

    public void setGgeneralCollection(Collection<Ggeneral> ggeneralCollection) {
        this.ggeneralCollection = ggeneralCollection;
    }

    @XmlTransient
    public Collection<Numeroficha> getNumerofichaCollection() {
        return numerofichaCollection;
    }

    public void setNumerofichaCollection(Collection<Numeroficha> numerofichaCollection) {
        this.numerofichaCollection = numerofichaCollection;
    }

    @XmlTransient
    public Collection<Vector> getVectorCollection() {
        return vectorCollection;
    }

    public void setVectorCollection(Collection<Vector> vectorCollection) {
        this.vectorCollection = vectorCollection;
    }

    @XmlTransient
    public Collection<Reserva> getReservaCollection() {
        return reservaCollection;
    }

    public void setReservaCollection(Collection<Reserva> reservaCollection) {
        this.reservaCollection = reservaCollection;
    }

    @XmlTransient
    public Collection<Familia> getFamiliaCollection() {
        return familiaCollection;
    }

    public void setFamiliaCollection(Collection<Familia> familiaCollection) {
        this.familiaCollection = familiaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idplanta != null ? idplanta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Planta)) {
            return false;
        }
        Planta other = (Planta) object;
        if ((this.idplanta == null && other.idplanta != null) || (this.idplanta != null && !this.idplanta.equals(other.idplanta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Planta[ idplanta=" + idplanta + " ]";
    }
    
}
