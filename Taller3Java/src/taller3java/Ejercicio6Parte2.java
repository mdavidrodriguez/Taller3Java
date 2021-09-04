package taller3java;
import java.util.Scanner;
public class Ejercicio6Parte2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int decimal, modulo, aux;
        String binario="";
        System.out.println("Ingresa numero Decimal: ");
        decimal=entrada.nextInt();
        aux=decimal;
        
        while(decimal > 0){
            modulo = (decimal%2);
            binario = modulo + binario;
            decimal = decimal/2;
            
        }
        System.out.println("El numero binario es: "+ binario);
    }
    
}
 