
import java.util.Scanner;

/*
 Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
 */

/**
 *
 * @author virginia_mateo
 */
public class ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num;
        System.out.println("Ingrese un numero");
        num= leer.nextInt();
        System.out.println("El doble es: "+num*2+" el triple es: "+num*3+" la raiz: "+Math.sqrt(num));
        
        
    }
    
}
