
import java.util.Scanner;

/*
 Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
 */

/**
 *
 * @author virginia_mateo
 */
public class ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float C;
        System.out.println("Ingrese la temperatura en grados celcius");
        C=leer.nextFloat();
        System.out.println(C);
        float F;
        F=32+(9*C/5);
        System.out.println("la temperatura en Fahrenheit es : "+ F );
    }
    
}
