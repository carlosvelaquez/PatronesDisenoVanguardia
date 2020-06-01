public class ControladorImpresora {
    private static ControladorImpresora instanciaControlador = new ControladorImpresora();

    private ControladorImpresora() {
    }

    public static ControladorImpresora recuperarInstancia() {
        return instanciaControlador;
    }

    public String imprimirDocumento(String datos) {
        System.out.print("Imprimiendo documento: ");
        System.out.println(datos);

        return "Impresión Exitosa";
    }
}