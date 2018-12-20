import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class cRed {

    private ArrayList<cNodoRed> ListaNR;

    public cRed() {
        ListaNR = new ArrayList<cNodoRed>();
    }

    public ArrayList<cNodoRed> getListaNR() {
        return ListaNR;
    }

    public void setListaNR(ArrayList<cNodoRed> Lista) {
        this.ListaNR = Lista;
    }

    public void insertarNodoRed(String info) {
        if (buscarNodoRed(info) == null) {
            cNodoRed objNR = new cNodoRed(info);
            ListaNR.add(objNR);
        }
    }

    public cNodoRed buscarNodoRed(String info) {
        cNodoRed aux = null;
        Iterator it = ListaNR.iterator();
        while (it.hasNext()) {
            cNodoRed objNR = (cNodoRed) it.next();
            if (objNR.getInfo().equals(info)) {
                aux = objNR;
            }
        }
        return aux;
    }

    public cNodoArco buscarNodoArco(String infoNO, String infoND) {
        cNodoRed objNO = buscarNodoRed(infoNO);
        return objNO.existeRelación(buscarNodoRed(infoND));
    }

    public void insertarNodoArco(String infoNO, String infoND, String infoNA, int tipo) {
        if (buscarNodoRed(infoNO) != null && buscarNodoRed(infoND) != null) {
            if (buscarNodoArco(infoNO, infoND) == null) {
                buscarNodoRed(infoNO).insertarNodoArco(infoNA, tipo, buscarNodoRed(infoND));
            }
        }
    }

    public boolean eliminarNodoRed(String info) {
        cNodoRed objNR = buscarNodoRed(info);
        int aux = 0;
        if (objNR != null) {
            if (objNR.listaVacía()) {
                Iterator it = ListaNR.iterator();
                while (it.hasNext()) {
                    cNodoRed objN = (cNodoRed) it.next();
                    Iterator it2 = objN.getListaNA().iterator();
                    while (it2.hasNext()) {
                        cNodoArco objNA = (cNodoArco) it2.next();
                        if (objNA.getDestino().equals(objNR)) {
                            aux = 1;
                        }
                    }
                }
            }
        }
        if (aux == 0) {
            ListaNR.remove(objNR);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean eliminarNodoArco(String infoNO, String infoND, String infoNA) {
        boolean aux=false;
        cNodoRed objNO = buscarNodoRed(infoNO);
        if (objNO != null && buscarNodoRed(infoND) != null) {
            if (objNO.existeRelación(buscarNodoRed(infoND)) != null) {
                if (objNO.existeRelación(buscarNodoRed(infoND)).getInfo().equals(infoNA)) {
                    objNO.getListaNA().remove(objNO.existeRelación(buscarNodoRed(infoND)));
                    objNO.eliminarNodoArco(infoNA, objNO);
                    aux=true;
                }
            }
        }
        return aux;
    }

    public void caracteristicasNodo(String infoNR, ArrayList<String> lista) {
        cNodoRed objNR = buscarNodoRed(infoNR);
        if (objNR != null) {
            objNR.caracteristicas(lista);
        }
    }

    public void quienesPertenecenA(String infoNR, ArrayList<String> lista) {
        cNodoRed objNR = buscarNodoRed(infoNR);
        if (objNR != null) {
            Iterator it = ListaNR.iterator();
            while (it.hasNext()) {
                cNodoRed objN = (cNodoRed) it.next();
                if (objN.existeRelacionTipo(objNR, 1)) {
                    if(!lista.contains(objN.getInfo())){
                    lista.add(objN.getInfo());
                    quienesPertenecenA(objN.getInfo(), lista);}
                }
            }
        }
    }

    public void quienTieneCaracteristica(String caracteristica, ArrayList<String> lista) {
        Iterator it = ListaNR.iterator();
        while (it.hasNext()) {
            cNodoRed objNR = (cNodoRed) it.next();
            ArrayList<String> lstCar = new ArrayList<String>();
            objNR.caracteristicas(lstCar);
            Iterator it2 = lstCar.iterator();
            while (it2.hasNext()) {
                String car = (String) it2.next();
                if (car.equals(caracteristica)) {
                    if (!lista.contains(objNR.getInfo())) {
                        lista.add(objNR.getInfo());
                    }
                }
            }

        }
    }

    public void cargarRed() throws FileNotFoundException, IOException {

        File archivo = new File("D:\\Archivo-Nodos.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);

        String linea;
        while ((linea = br.readLine()) != null) {

            int numTokens = 0;
            StringTokenizer st = new StringTokenizer(linea);
            String s2;

            while (st.hasMoreTokens()) {
                s2 = st.nextToken();
                numTokens++;
                insertarNodoRed(s2);
            }
        }

        archivo = new File("D:\\Archivo-Relaciones.txt");
        fr = new FileReader(archivo);
        br = new BufferedReader(fr);

        while ((linea = br.readLine()) != null) {

            int numTokens = 0;
            StringTokenizer st = new StringTokenizer(linea);
            String s2;

            String origen = st.nextToken();
            String destino = st.nextToken();
            String relacion = st.nextToken();
            int tipo = Integer.parseInt(st.nextToken());

            insertarNodoArco(origen, destino, relacion, tipo);
        }
    }

}
