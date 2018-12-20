package Entidades;

import Entidades.Planta;
import Entidades.Tipogaleriat;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.4.v20170522-rNA", date="2018-12-20T14:11:51")
@StaticMetamodel(Gtecnica.class)
public class Gtecnica_ { 

    public static volatile SingularAttribute<Gtecnica, String> descripciontecnica;
    public static volatile SingularAttribute<Gtecnica, String> nombretecnica;
    public static volatile SingularAttribute<Gtecnica, Planta> idplanta;
    public static volatile CollectionAttribute<Gtecnica, Tipogaleriat> tipogaleriatCollection;
    public static volatile SingularAttribute<Gtecnica, Integer> idtecnica;
    public static volatile SingularAttribute<Gtecnica, String> ubicacionimagentecnica;

}