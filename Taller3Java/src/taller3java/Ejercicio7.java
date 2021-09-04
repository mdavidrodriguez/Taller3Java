package taller3java;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de numeros: ");
        int contador=entrada.nextInt();
        
        int mayor=0;
        
        for (int i = 0; i < contador; i++) {
            System.out.println("Ingrese el numero: "+(i+1));
            int numero=entrada.nextInt();
            
            if(i==0){
                mayor=numero;
                
            }else if(numero>mayor){
            mayor=numero;
            }
        }
        System.out.println("El numero Mayor es: "+ mayor);
        
    }
}
    

