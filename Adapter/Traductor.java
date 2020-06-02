package Adapter;

public class Traductor {
    public boolean traducirDirecciones(String dir, Turista t) {
        if (dir == "Siga dos bloques y doble a la derecha.") {
            return t.receiveDirections("Continue for two blocks and turn right.");
        }

        return false;
    }
}