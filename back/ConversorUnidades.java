import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ConversorUnidadesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConversorUnidadesApplication.class, args);
        Scanner input = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Conversor unidades");
            System.out.println("Cantidad a convertir (pies): ");

            if (input.hasNextDouble()) {
                double Lpies = input.nextDouble();

                double LPulgadas = Lpies * 12;
                double LMetros = Lpies / 3.28;
                double LYardas = Lpies / 3;

                System.out.println("Resultado: ");
                System.out.println("Distancia en pulgadas: " + LPulgadas + " pulg.");
                System.out.println("Distancia en metros: " + LMetros + " m.");
                System.out.println("Distancia en yardas: " + LYardas + " yd.");
                System.out.println("Para salir introducir Q");
            } else {
                String entradaString = input.next();

                if (entradaString.equalsIgnoreCase("q")) {
                    continuar = false;
                } else {
                    System.out.println("Error");
                }
            }
        }
        input.close();
    }
}

