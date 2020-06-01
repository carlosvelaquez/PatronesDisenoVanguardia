public class Singleton {
    public static void run() {
        ControladorImpresora controlador = ControladorImpresora.recuperarInstancia();

        System.out.println(controlador.imprimirDocumento("Olo"));
    }
}