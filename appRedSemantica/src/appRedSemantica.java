import java.util.ArrayList;
import java.util.Iterator;

public class appRedSemantica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, java.io.IOException {
        // TODO code application logic here
        cRed objRed = new cRed();
        objRed.cargarRed();
        ArrayList<String> lista = new ArrayList<String>();
        objRed.quienTieneCaracteristica("Reproduccion Vivipara", lista);
        Iterator it = lista.iterator();
        while(it.hasNext()){
            String caracteristica = (String) it.next();
            System.out.println(caracteristica);
        }
        
        objRed.quienesPertenecenA("Persona", lista);
        Iterator it3 = lista.iterator();
        while(it3.hasNext()){
            String pertenece = (String) it3.next();
            System.out.println(pertenece);
        }
        
        System.out.println("Características de Juan: ");
        objRed.caracteristicasNodo("Juan", lista);
        Iterator it2 = lista.iterator();
        while(it2.hasNext()){
            String pertenece = (String) it2.next();
            System.out.println(pertenece);
        }
         objRed.quienesPertenecenA("Tornero",lista);
        Iterator it10 = lista.iterator();
        while(it10.hasNext()){
            String pertenece = (String) it10.next();
            System.out.println(pertenece);
        }
       
         //Eliminar Nodo
        System.out.println("Eliminar Nodo: ");
            if(objRed.eliminarNodoRed("Lodo")){
            System.out.println("Nodo Eliminado");
        }else
        System.out.println("No se puede eliminar el nodo ya que tiene arcos");
            
            //Eliminar Arco
        System.out.println("Eliminar Relación: ");
         if(objRed.eliminarNodoArco("Persona", "Tornero","Es-Un")){
            System.out.println("Arco Eliminado");
        }else
        System.out.println("El arco no existe");
        
    }

    private static class IOException extends Exception {

        public IOException() {
        }
    }
    
}
