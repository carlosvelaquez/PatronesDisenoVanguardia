package Factory;

public class PizzaQueso implements Pizza {
    @Override
    public void listarIngredientes() {
        System.out.println("- Queso");
    }
}