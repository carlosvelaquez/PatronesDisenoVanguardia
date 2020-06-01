public class PizzaFactory {
    public Pizza crearPizza(TipoPizza t) {
        switch (t) {
            case QUESO:
                return new PizzaQueso();

            case PEPPERONI:
                return new PizzaPepperoni();

            case SUPREMA:
                return new PizzaSuprema();

            default:
                return null;
        }
    }
}