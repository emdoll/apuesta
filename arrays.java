import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        double[] promedios;
        double suma = 0;
        int calificaciones;
        double promedio;
        Scanner entrada = new Scanner(System.in);
        System.out.print("cuantas calificaciones desea agregar? ");
        calificaciones = entrada.nextInt();

        promedios = new double[calificaciones];

        for (int j = 0; j < calificaciones; j++) {
            System.out.print("introduzca una calificacion: ");
            promedios[j] = entrada.nextDouble();
        }
        
        for (int j = 0; j < calificaciones; j++) {
            suma = suma + promedios[j];
        }
        promedio = suma / calificaciones;
        System.out.println(promedio);

        entrada.close();
    }
}
