package taller3java;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        System.out.print("Por favor ingrese el tamaño del cuadrado entre los rangos de 1 y 20: ");
        int n = entrada.nextInt();
       
        if(n >= 0 && n<=20) {
            //Linea superior
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
           
            //centro de la forma
            for(int i = 0; i < n-2; i++) {
                System.out.print("*");
                for(int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
           
            //Linea inferior
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
        }else {
            System.out.println("Se encuentra Fuera de rango");
        }
               
 
    }
}
    

