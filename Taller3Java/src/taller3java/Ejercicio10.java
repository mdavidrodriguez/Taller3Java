package taller3java;
import java.util.Scanner;
public class Ejercicio10 {
 
    public void RecibeP(){
        
        Scanner sc = new Scanner(System.in);
        double Horas = 0;
        double Cargos = 0;
        double Total = 0;
        int Contador = 1;
    
        System.out.println("\nBienvenido al sistema de cobro del estacionamiento.");

        System.out.printf("Por favor Ingrese las horas de estacionamiento del cliente: %d:\n", Contador++);
        System.out.print("\n( 0 para terminar)\n");
        Horas =  sc.nextDouble();

        while ( 0 != Horas ){     

        System.out.printf("\nEl cargo para este cliente es de: %.2f\n", calcularCargos(Horas));
        Total += calcularCargos(Horas);

        System.out.printf("Por favor Ingrese las horas de estacionamiento del cliente: %d:\n", Contador++);
        System.out.print("\n(0 para terminar)\n");
        Horas =  sc.nextDouble();

        } 

        System.out.printf("\nEl Total acumulado de los estacionamientos es de: %.2f\n", Total);

        }   

    public double calcularCargos( double x){    

        if ( 3 >= x )
            return 2.0;

            else
                return (2 + 0.5*Math.ceil(x - 3)) <= 10? 2 + 0.5*Math.ceil(x -3) : 10; 

    }     

}
   
