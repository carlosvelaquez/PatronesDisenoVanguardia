import java.util.Scanner;

public class Examen {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Examen I - Carlos Velásquez\n-----");

        boolean salir = false;

        while (!salir) {
            System.out.println("1) Singleton\n2) Factory\n7) Salir del programa");
            System.out.print("\nIngrese el número del ejercicio a observar: ");

            int opcion = sc.nextInt();
            System.out.println("-----");

            switch (opcion) {
                case 1:
                    Singleton.run();
                    break;

                case 2:
                    Factory.run();
                    break;

                case 7:
                    salir = true;
                    break;

                default:
                    System.out.println("\n[ERROR] Opción inválida, por favor intente de nuevo.\n-----");
                    break;
            }

            System.out.println("-----");
        }

        sc.close();

    }
}