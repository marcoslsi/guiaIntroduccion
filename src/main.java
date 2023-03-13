
import java.util.Scanner;

/*
 Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
 */

/**
 *
 * @author virginia_mateo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num1;
       int num2;
        System.out.println("Ingrese un numero: ");
        num1=leer.nextInt();
        System.out.println("Ingrese otro numero: ");
        num2=leer.nextInt();
        int resultado=num1+num2;
        System.out.println("El resultado es: "+ resultado);
    
}
}