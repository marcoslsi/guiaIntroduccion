
import java.util.Scanner;

/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
 */

/**
 *
 * @author virginia_mateo
 */
public class ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase=leer.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
    
}
