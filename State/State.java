package State;

import Constants.Constants;

public class State {
    public static void run() {
        Carro c = new Carro();
        System.out.println("MANEJANDO\n");

        boolean salir = false;

        while (!salir) {
            System.out.println(
                    String.format("Velocidad actual: %d km/hr | Cambio actual: %s\n", c.velocidad, c.cambioActual));
            System.out.println(
                    "1) Acelerar\n2) Frenar\n3) Cambiar a Drive\n4) Cambiar a Reversa\n5) Cambiar a Park\n6) EYECTAR");
            System.out.print("\nElige una Acción: ");

            int a = Constants.sc.nextInt();

            System.out.println("-----");

            switch (a) {
                case 1:
                    c.acelerar();
                    break;

                case 2:
                    c.frenar();
                    break;

                case 3:
                    c.cambiar(new Drive());
                    break;

                case 4:
                    c.cambiar(new Reversa());
                    break;

                case 5:
                    c.cambiar(new Park());
                    break;

                case 6:
                    salir = true;
                    break;

                default:
                    break;
            }

            System.out.println("-----");
        }

    }
}