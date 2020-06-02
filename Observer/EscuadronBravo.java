package Observer;

public class EscuadronBravo extends Escuadron {
    public EscuadronBravo(General general) {
        super(general);

        this.nombre = "Bravo";
        this.ubicacion = "San Pedro Sula";
        this.distancia = 3;
    }
}