package Observer;

public abstract class Escuadron {
    protected General general;
    String nombre, ubicacion;
    int distancia;

    public Escuadron(General general) {
        this.general = general;
        this.general.enlazar(this);
    }

    public void actuar(TipoOrden t) {
        switch (t) {
            case AVANZAR: {
                if (distancia > 0) {
                    distancia--;
                }

                break;
            }

            case RETROCEDER: {
                distancia++;
                break;
            }

            default:
                break;
        }

        if (distancia <= 0) {
            System.out.println(String.format("[Escuadrón %s] Ubicado en %s.", nombre, ubicacion));
        } else {
            System.out.println(String.format("[Escuadrón %s] Ubicado a %dkm de %s.", nombre, distancia, ubicacion));
        }
    };
}