import java.util.ArrayList;
import java.util.Scanner;

public class datatype {
    public static void main(String[] args) {
        long num;
        Scanner entrada = new Scanner(System.in);

        int t = entrada.nextInt();
        ArrayList<String> lista = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            lista.add(entrada.next());
        }
        for (String numcadena : lista) {

            try {
                num = Long.parseLong(numcadena);
                System.out.println(num + " can be fitted in:");

                if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) {
                    System.out.println("* byte");

                }
                if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) {
                    System.out.println("* int");

                }
                if (num >= Long.MIN_VALUE && num <= Long.MAX_VALUE) {
                    System.out.println("* long");

                }

            } catch (Exception err) {
                System.out.println(numcadena + " can't be fitted anywhere.");
            }
        }
        entrada.close();

    }

}
