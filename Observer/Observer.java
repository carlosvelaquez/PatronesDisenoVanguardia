package Observer;

import Constants.*;

public class Observer {
    public static void run() {
        General g = new General();
        Escuadron alpha = new EscuadronAlpha(g);
        Escuadron bravo = new EscuadronBravo(g);
        Escuadron charlie = new EscuadronCharlie(g);

        boolean salir = false;

        while (!salir) {
            System.out.println("¿General, qué ordenes dará hoy a sus escuadrones?\n");
            System.out.println("1) Avanzar\n2) Defender\n3) Retroceder\n4) Resignar del cargo\n");
            System.out.print("Ingrese la orden a dar: ");

            try {
                TipoOrden t = TipoOrden.values()[Constants.sc.nextInt() - 1];

                System.out.println("-----\nRESUMEN DEL DIA\n");
                g.setOrden(t);
            } catch (Exception e) {
                System.out.println("[ERROR] Órden inválida. Ha sido relevado de su cargo como general.");
                salir = true;
            }
        }

    }
}