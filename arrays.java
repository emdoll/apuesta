import java.util.InputMismatchException;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        double[] promedios;
        double suma = 0;
        int calificaciones;
        double promedio, maximo = Double.MIN_VALUE, minimo = Double.MAX_VALUE;
        Scanner entrada = new Scanner(System.in);
        System.out.print("cuantas calificaciones desea agregar? ");
        while (true) {
            try {
                calificaciones = entrada.nextInt();
                break;
            } catch (InputMismatchException err) {
                System.out.println("error");
                entrada.next();
                System.out.println("ingrese un numero valido" + err);
            }
        }

        promedios = new double[calificaciones];

        for (int j = 0; j < calificaciones; j++) {
            while (true) {
                try {
                    System.out.print("introduzca una calificacion: ");
                    promedios[j] = entrada.nextDouble();

                    break;
                } catch (InputMismatchException er) {
                    System.out.println("introduzca un numero valido");
                    entrada.next();
                }
            }
        }

        for (int j = 0; j < calificaciones; j++) {
            double numactual = promedios[j];
            if (numactual > maximo) {
                maximo = numactual;
            }
            if (numactual < minimo) {
                minimo = numactual;
            }
            suma = suma + promedios[j];
        }
        promedio = suma / calificaciones;
        System.out.println(promedio);
        System.out.println("el numero maximo es: " + maximo);
        System.out.println("el numero minimo es: " + minimo);
        if (promedio > 3) {
            System.out.println("aprobado");
        } else {
            System.out.println("reprobado");
        }
        ;

        entrada.close();
    }
}

