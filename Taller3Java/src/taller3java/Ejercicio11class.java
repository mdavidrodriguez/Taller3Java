package taller3java;
import java.util.Scanner;
public class Ejercicio11class {
    public static void main(String args[])
     {        
     Scanner entrada = new Scanner(System.in);
     int numero;
     Ejercicio11 miObjeto = new Ejercicio11();


     System.out.println("\nEste programa recibe un entero y lo presenta con los ");
     System.out.println("digitos invertidos. ");
     System.out.println("\nPor favor introduzca un numero: ");
     numero = entrada.nextInt();

     System.out.println("\nEste es el numero invertido:\n ");
     miObjeto.Invierte( numero );


     }          

}
