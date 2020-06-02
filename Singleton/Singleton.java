package Singleton;

import Constants.*;

public class Singleton {
    public static void run() {
        ControladorImpresora controlador = ControladorImpresora.recuperarInstancia();

        System.out.print("[Editor de Texto] Presione ENTER para imprimir el contenido del bufer\n\n");
        String datos = Constants.sc.nextLine();

        String mensaje = "";

        if (controlador.imprimirDocumento(datos)) {
            mensaje = "Impresión Exitosa";
        } else {
            mensaje = "Error en la impresión";
        }

        System.out.println(String.format("[Editor de Texto] Resultado: %s", mensaje));
    }
}