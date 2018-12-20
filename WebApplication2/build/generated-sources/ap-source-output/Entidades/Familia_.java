package Entidades;

import Entidades.Planta;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.4.v20170522-rNA", date="2018-12-20T14:11:51")
@StaticMetamodel(Familia.class)
public class Familia_ { 

    public static volatile SingularAttribute<Familia, String> nombrefamilia;
    public static volatile CollectionAttribute<Familia, Planta> plantaCollection;
    public static volatile SingularAttribute<Familia, Integer> idfamilia;
    public static volatile SingularAttribute<Familia, Planta> idplanta;
    public static volatile SingularAttribute<Familia, String> descripcionfamilia;

}