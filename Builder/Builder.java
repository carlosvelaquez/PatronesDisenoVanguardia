package Builder;

import Builder.PC.ConfiguradorPC;
import Constants.Constants;

public class Builder {
    public static void run() {
        System.out.println("CONFIGURA TU PC\nFase 1: Especificar partes requeridas\n-----");

        System.out.print("Nucleos de CPU: ");
        int nucleosCPU = Constants.sc.nextInt();

        System.out.print("Frecuencia de CPU (GHz): ");
        float frecuenciaCPU = Constants.sc.nextFloat();

        System.out.print("Almacenamiento SSD para SO (GB): ");
        float almacenamientoSSD = Constants.sc.nextInt();

        ConfiguradorPC conf = new ConfiguradorPC(nucleosCPU, frecuenciaCPU, almacenamientoSSD);

        System.out.println("\n-----\nParte 2: Agregar partes opcionales\n-----");

        System.out.print("¿Deseas agregar un HDD? (y/n): ");

        switch (Constants.sc.nextLine()) {
            case "yes":
            case "YES":
            case "y":
            case "Y":
                System.out.print("Especifique la capacidad del HDD (GB): ");
                conf.setAlmacenamientoHDD(Constants.sc.nextInt());
                break;

            default:
                break;
        }

        System.out.print("¿Deseas agregar un GPU? (y/n): ");
        switch (Constants.sc.nextLine()) {
            case "yes":
            case "YES":
            case "y":
            case "Y":
                System.out.print("Especifique la capacidad del HDD (GB): ");
                conf.setAlmacenamientoHDD(Constants.sc.nextInt());
                break;

            default:
                break;
        }

        System.out.println();
        System.out.println(conf.finalizar());
    }
}