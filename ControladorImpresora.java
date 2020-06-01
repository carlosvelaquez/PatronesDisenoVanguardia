public class ControladorImpresora {
    private static ControladorImpresora instanciaControlador = new ControladorImpresora();

    private ControladorImpresora() {
    }

    public static ControladorImpresora recuperarInstancia() {
        return instanciaControlador;
    }

    public boolean imprimirDocumento(String datos) {
        System.out.println(String.format("---\n[Controlador] Enviando documento para impresión: %s\n---", datos));
        return true;
    }
}