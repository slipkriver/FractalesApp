
import java.util.ArrayList;
import java.util.Iterator;

public class cNodoRed {

    private String Info;
    private ArrayList<cNodoArco> ListaNA;

    public cNodoRed(String Info) {
        this.Info = Info;
        this.ListaNA = new ArrayList<cNodoArco>();
    }

    public String getInfo() {
        return Info;
    }

    public void setInfo(String Info) {
        this.Info = Info;
    }

    public ArrayList<cNodoArco> getListaNA() {
        return ListaNA;
    }

 






   public void setListaNA(ArrayList<cNodoArco> ListaNA) {
        this.ListaNA = ListaNA;
    }

    public void insertarNodoArco(String info, int tipo, cNodoRed destino) {
        cNodoArco objNA = new cNodoArco(info, tipo, destino);
        ListaNA.add(objNA);
    }

    public boolean listaVacía() {
        return ListaNA.isEmpty();
    }

    public cNodoArco existeRelación(cNodoRed destino) {
        cNodoArco objAux = null;
        Iterator it = ListaNA.iterator();
        while (it.hasNext()) {
            cNodoArco objNA = (cNodoArco) it.next();
            if (objNA.getDestino().getInfo().equals(destino.getInfo())) {
                objAux = objNA;
            }
        }
        return objAux;
    }
    public void eliminarNodoArco(String info, cNodoRed destino) {
        Iterator it = ListaNA.iterator();
        while (it.hasNext()) {
            cNodoArco objNA = (cNodoArco) it.next();
            if (objNA.getInfo().equals(info) && objNA.getDestino().getInfo().equals(destino.getInfo())) {
                ListaNA.remove(objNA);
            }
        }
    }

    public void caracteristicas(ArrayList<String> lista) {
        Iterator it = ListaNA.iterator();
        while (it.hasNext()) {
            cNodoArco objNA = (cNodoArco) it.next();
            if (objNA.getTipo() == 1) {
                if (!lista.contains(objNA.getInfo() + " " + objNA.getDestino().getInfo())) {
                    lista.add(objNA.getInfo() + " " + objNA.getDestino().getInfo());
                    objNA.getDestino().caracteristicas(lista);
                }
            } else {
                lista.add(objNA.getInfo() + " " + objNA.getDestino().getInfo());
            }
        }
    }

    public boolean existeRelacionTipo(cNodoRed destino, int tipo) {
        boolean aux = false;
        Iterator it = ListaNA.iterator();
        while (it.hasNext()) {
            cNodoArco objNA = (cNodoArco) it.next();
            if (objNA.getDestino().equals(destino) && objNA.getTipo() == tipo) {
                aux = true;
            }
        }
        return aux;
    }
}
