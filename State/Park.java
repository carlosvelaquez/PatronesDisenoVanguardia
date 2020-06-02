package State;

public class Park implements Cambio {
    public int acelerar(int velocidad) {
        System.out.println("El carro está en Park. La velocidad se mantiene en 0");
        return 0;
    }

    public int frenar(int velocidad) {
        System.out.println("El carro está en Park. La velocidad se mantiene en 0");
        return 0;
    }

    @Override
    public String toString() {
        return "Park";
    }
}