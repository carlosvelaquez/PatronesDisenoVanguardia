package Factory;

public class PizzaPepperoni implements Pizza {

    @Override
    public void listarIngredientes() {
        System.out.println(("- Queso\n- Salsa\n- Pepperoni"));
    }
}