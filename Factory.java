public class Factory {
    public static void run() {
        PizzaFactory fac = new PizzaFactory();

        System.out.println("ELIGE TU PIZZA\n");
        System.out.print("1) Queso\n2) Pepperoni\n3) Suprema\n\nIngresa el número de la pizza que deseas: ");

        try {
            TipoPizza t = TipoPizza.values()[Examen.sc.nextInt() - 1];

            System.out.println("\nLos ingredientes de tu pizza son:");
            fac.crearPizza(t).listarIngredientes();
        } catch (Exception e) {
            System.out.println("[ERROR] Tipo inválido. Por favor intente de nuevo.");
        }
}}