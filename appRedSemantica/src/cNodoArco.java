public class cNodoArco {
    private String Info;
    private int Tipo;
    private cNodoRed Destino;

    public cNodoArco(String Info, int Tipo, cNodoRed Destino) {
        this.Info = Info;
        this.Tipo = Tipo;
        this.Destino = Destino;
    }

    public String getInfo() {
        return Info;
    }

    public void setInfo(String Info) {
        this.Info = Info;
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }

    public cNodoRed getDestino() {
        return Destino;
    }

    public void setDestino(cNodoRed Destino) {
        this.Destino = Destino;
    }
    
    
}
