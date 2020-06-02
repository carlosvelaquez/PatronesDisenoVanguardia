package Adapter;

import Constants.Constants;

public class Adapter {
    public static void run() {
        Turista t = new Turista();
        Recepcionista r = new Recepcionista();
        Traductor tr = new Traductor();

        String dir = "";
        boolean success = false;

        System.out.println("TRADUCTOR\n");
        System.out.println(
                "Estas atendiendo la recepción cuando un turista extranjero te pide direcciones hacia el museo.");

        while (!success) {
            System.out.println("1) Dar direcciones en español tío");
            System.out.println("2) Usar un traductor");
            System.out.print("\nElige una opción: ");

            switch (Constants.sc.nextInt()) {
                case 1:
                    dir = r.darDirecciones();
                    success = t.receiveDirections(dir);
                    break;

                case 2:
                    dir = r.darDirecciones();
                    success = tr.traducirDirecciones(dir, t);
                    break;

                default:
                    continue;
            }

            System.out.println("\nLe dices al turista:");
            System.out.println(dir);
            System.out.println();

            if (success) {
                System.out.println(
                        "El turista logra comprenderte, te agradece con una sonrisa y se va. ¡Encuentro social manejado con éxito!");
            } else {
                System.out.println("El turista te ve con una cara de frustración y dice \"I can't understand.\"");
                System.out.println("Tu jefe se molesta y te pide que hagas algo.\n-----");
            }
        }

    }
}