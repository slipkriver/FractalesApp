package Entidades;

import Entidades.Analisisproporcionandina;
import Entidades.Codigo;
import Entidades.Familia;
import Entidades.Gandina;
import Entidades.Gfractal;
import Entidades.Ggeneral;
import Entidades.Gtecnica;
import Entidades.Numeroficha;
import Entidades.Reserva;
import Entidades.SegmentoAnalisis;
import Entidades.Ubicacion;
import Entidades.Usuario;
import Entidades.Vector;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.4.v20170522-rNA", date="2018-12-20T14:11:51")
@StaticMetamodel(Planta.class)
public class Planta_ { 

    public static volatile CollectionAttribute<Planta, Codigo> codigoCollection;
    public static volatile CollectionAttribute<Planta, Familia> familiaCollection;
    public static volatile SingularAttribute<Planta, String> ubicacionarchimagenplanta;
    public static volatile CollectionAttribute<Planta, Gandina> gandinaCollection;
    public static volatile CollectionAttribute<Planta, Numeroficha> numerofichaCollection;
    public static volatile SingularAttribute<Planta, String> descripcionplanta;
    public static volatile SingularAttribute<Planta, Usuario> cedula;
    public static volatile CollectionAttribute<Planta, Gfractal> gfractalCollection;
    public static volatile SingularAttribute<Planta, Familia> idfamilia;
    public static volatile SingularAttribute<Planta, String> nombreplanta;
    public static volatile SingularAttribute<Planta, String> baucherherbario;
    public static volatile CollectionAttribute<Planta, Ggeneral> ggeneralCollection;
    public static volatile SingularAttribute<Planta, Date> fecharecoleccion;
    public static volatile CollectionAttribute<Planta, Analisisproporcionandina> analisisproporcionandinaCollection;
    public static volatile CollectionAttribute<Planta, SegmentoAnalisis> segmentoAnalisisCollection;
    public static volatile CollectionAttribute<Planta, Vector> vectorCollection;
    public static volatile SingularAttribute<Planta, Integer> idplanta;
    public static volatile CollectionAttribute<Planta, Ubicacion> ubicacionCollection;
    public static volatile CollectionAttribute<Planta, Reserva> reservaCollection;
    public static volatile CollectionAttribute<Planta, Gtecnica> gtecnicaCollection;

}