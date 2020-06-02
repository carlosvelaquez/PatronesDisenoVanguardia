package State;

public class Carro {
    int velocidad = 0;
    Cambio cambioActual;

    public Carro() {
        cambioActual = new Park();
    }

    public void acelerar() {
        velocidad = cambioActual.acelerar(velocidad);
    }

    public void frenar() {
        velocidad = cambioActual.frenar(velocidad);
    }

    public void cambiar(Cambio c) {
        cambioActual = c;
        velocidad = 0;
        System.out.println(String.format("Cambiando a %s", c));
    }
}