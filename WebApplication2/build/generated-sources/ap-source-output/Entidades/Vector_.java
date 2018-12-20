package Entidades;

import Entidades.Archivos;
import Entidades.Planta;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.4.v20170522-rNA", date="2018-12-20T14:11:51")
@StaticMetamodel(Vector.class)
public class Vector_ { 

    public static volatile SingularAttribute<Vector, String> descripcionvector;
    public static volatile SingularAttribute<Vector, Planta> idplanta;
    public static volatile SingularAttribute<Vector, String> ubicacionimagenvector;
    public static volatile SingularAttribute<Vector, Integer> idvector;
    public static volatile CollectionAttribute<Vector, Archivos> archivosCollection;
    public static volatile SingularAttribute<Vector, Integer> tipovector;

}