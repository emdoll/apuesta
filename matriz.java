import java.util.Scanner;
public class matriz {
    public static void main(String[] args) {
        int renglon, columna;
        Scanner entrada = new Scanner(System.in);

        System.out.println("proporciona los renglones");
        renglon = entrada.nextInt();
        System.out.println("ingrese las columnas");
        columna = entrada.nextInt();

        int[][] matriz = new int [renglon][columna];

        for(int i=0; i < renglon; i++){
            for(int j = 0; j < columna; j++){
                System.out.println("valor[" + i  + "][" + j + "]");
                matriz[i][j] = entrada.nextInt();

            }
        }
        int suma = 0;
        for(int i=0; i < renglon; i++){
            for(int j=0; j < columna; j++){
                if(i == j)
                suma += matriz[i][j];

            }
        }
        System.out.println("suma total " + suma);
    }
    
}
