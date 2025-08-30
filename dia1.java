import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class dia1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad, mes, anio, dia;
        String nombre;

        System.out.println("introduzca su nombre");
        nombre = entrada.nextLine();
        System.out.println("introduzca su fecha de nacimiento");
        System.out.println("dia(1-31)");
        dia = entrada.nextInt();
        System.out.println("mes(1-12)");
        mes = entrada.nextInt();
        System.out.println("anio(ej:2000)");
        anio = entrada.nextInt();

        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        LocalDate hoy = LocalDate.now();

        Period aniosPeriodo = Period.between(fechaNacimiento, hoy);
        edad = aniosPeriodo.getYears();

        System.out.println(nombre +" Tu edad es: " + edad + " años.");

        LocalDate cumpleanios = fechaNacimiento.withYear(hoy.getYear());

        if (cumpleanios.isBefore(hoy) || cumpleanios.equals(hoy)) {
            System.out.println("ya cumpliste este anio");
        } else {
            System.out.println("no has cumplido este anio ");
        }
        entrada.close();
    }

}
