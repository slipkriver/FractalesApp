package Entidades;

import Entidades.TipoArchivo;
import Entidades.Vector;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.4.v20170522-rNA", date="2018-12-20T14:11:51")
@StaticMetamodel(Archivos.class)
public class Archivos_ { 

    public static volatile SingularAttribute<Archivos, String> iaArchivo;
    public static volatile CollectionAttribute<Archivos, TipoArchivo> tipoArchivoCollection;
    public static volatile SingularAttribute<Archivos, String> ubicacion;
    public static volatile SingularAttribute<Archivos, String> descripcionarch;
    public static volatile SingularAttribute<Archivos, Vector> idvector;
    public static volatile SingularAttribute<Archivos, String> nombrearch;

}