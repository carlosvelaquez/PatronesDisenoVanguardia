package Observer;

import java.util.ArrayList;

public class General {
    private ArrayList<Escuadron> escuadrones = new ArrayList<Escuadron>();
    private TipoOrden ordenActual;

    public void enlazar(Escuadron e) {
        escuadrones.add(e);
    }

    public TipoOrden getOrden() {
        return ordenActual;
    }

    public void setOrden(TipoOrden orden) {
        ordenActual = orden;
        notificarEscuadrones();
    }

    public void notificarEscuadrones() {
        for (Escuadron e : escuadrones) {
            e.actuar(ordenActual);
        }
    }
}