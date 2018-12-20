package Entidades;

import Entidades.Planta;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.4.v20170522-rNA", date="2018-12-20T14:11:51")
@StaticMetamodel(Reserva.class)
public class Reserva_ { 

    public static volatile SingularAttribute<Reserva, String> descripcion;
    public static volatile SingularAttribute<Reserva, Planta> idplanta;
    public static volatile SingularAttribute<Reserva, String> nombre;
    public static volatile SingularAttribute<Reserva, String> idReserva;

}