package State;

public class Reversa implements Cambio {
    public int acelerar(int velocidad) {
        int nVelocidad = velocidad - 1;

        System.out.println(String.format("Acelerando en reversa. Nueva velocidad: %d km/hr", nVelocidad));
        return nVelocidad;
    }

    public int frenar(int velocidad) {
        int nVelocidad;

        if (velocidad < 0) {
            nVelocidad = velocidad + 1;
        } else {
            nVelocidad = 0;
        }

        System.out.println(String.format("Frenando en reversa. Nueva velocidad: %d km/hr", nVelocidad));
        return nVelocidad;
    }

    @Override
    public String toString() {
        return "Reversa";
    }
}