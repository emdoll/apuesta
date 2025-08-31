import java.util.Scanner;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;

public class dia1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad, mes, anio, dia;
        String nombre;
        LocalDate fechaNacimiento = null;
        System.out.println("introduzca su nombre");
        nombre = entrada.nextLine();
        while (true) {

            while (fechaNacimiento == null) {
                try {

                    dia = ValidarNum(entrada, "Dia (1-31):", 1, 31);
                    mes = ValidarNum(entrada, "Mes (1-12):", 1, 12);
                    anio = ValidarNum(entrada, "Año (ej: 2000):", 1900, LocalDate.now().getYear());

                    fechaNacimiento = LocalDate.of(anio, mes, dia);
                    break;

                } catch (DateTimeException error) {
                    System.out.println("La fecha introducida no es válida.");
                    System.out.println("inténtelo de nuevo. " + error);
                }
            }

            LocalDate hoy = LocalDate.now();
            Period aniosPeriodo = Period.between(fechaNacimiento, hoy);
            edad = aniosPeriodo.getYears();

            System.out.println(nombre + " Tu edad es: " + edad + " años.");

            LocalDate cumpleanios = fechaNacimiento.withYear(hoy.getYear());

            if (cumpleanios.isBefore(hoy) || cumpleanios.equals(hoy)) {
                System.out.println("ya cumpliste este anio");
            } else {
                System.out.println("no has cumplido este anio ");
            }
            entrada.close();
            break;
        }
    }

    public static int ValidarNum(Scanner scanner, String mensaje, int min, int max) {
        int num = 0;
        while (true) {
            System.out.println(mensaje);
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                if (num >= min && num <= max) {
                    break;
                } else {
                    System.out.println("fecha no existente");
                }
            } else {
                System.out.println("debes introducir un numero");
                scanner.next();
            }

        }
        return num;
    }

}
