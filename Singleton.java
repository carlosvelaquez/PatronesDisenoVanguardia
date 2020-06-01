import java.util.Scanner;

public class Singleton {
    public static void run() {
        ControladorImpresora controlador = ControladorImpresora.recuperarInstancia();

        Scanner sc = new Scanner(System.in);

        System.out.print("---\n[Editor de Texto] Presione ENTER para imprimir el contenido del bufer\n\n");
        String datos = sc.nextLine();

        String mensaje = "";

        if (controlador.imprimirDocumento(datos)) {
            mensaje = "Impresión Exitosa";
        } else {
            mensaje = "Error en la impresión";
        }

        System.out.print(String.format("[Editor de Texto] Resultado: %s", mensaje));

        sc.close();
    }
}