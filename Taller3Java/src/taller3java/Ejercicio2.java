package taller3java;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        
        int SaldoInicio, AbonosMes, CargosCliente, LimiteCredito;
        System.out.println("Ingrese el saldo inicial: ");
        SaldoInicio = entrada.nextInt();
        
        System.out.println("Ingrese el total de abonos en el mes: ");
        AbonosMes = entrada.nextInt();
        
        System.out.println("Ingrese Cargos del cliente: ");
        CargosCliente = entrada.nextInt();
        
        System.out.println("Ingrese el limite del credito: ");
        LimiteCredito = entrada.nextInt();
        
        int Credito = SaldoInicio + AbonosMes - CargosCliente;
        int Total =  LimiteCredito - Credito;
        if( Credito < LimiteCredito ) {
            System.out.println( "El Saldo que quedo a favor fue de: " + Total);
            System.out.println("El credito no se ha excedido");
        } else {
            System.out.println("El limite del credito se ha excedido");
        }
    

    
    }
}
