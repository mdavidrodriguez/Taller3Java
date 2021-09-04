package taller3java;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double pago_semanal=200, ventas, x, y, pago_total;
        
        System.out.println("Ingrese el valor de las ventas realizadas en la semana: ");
        ventas=entrada.nextInt();       
        
        if (ventas>3000 && ventas<5000){
            x=ventas*0.09;
            y=ventas*0.05;
            pago_total=pago_semanal+x+y;
            System.out.println("El pago es de: "+ pago_total);
            
        
        }else if(ventas>=5000 && ventas<=7000){
            x=ventas*0.09;
            y=ventas*0.07;
            pago_total=pago_semanal+x+y;
            System.out.println("El pago es de: "+ pago_total);
    
        }else if(ventas>7000 && ventas<10000){
            x=ventas*0.09;
            y=ventas*0.1;
            pago_total=pago_semanal+x+y;
            System.out.println("El pago es de: "+ pago_total);
       
            
        }else if(ventas>=10000 && ventas<=15000){
            x=ventas*0.09;
            y=ventas*0.1;
            pago_total=pago_semanal+x+y;
            System.out.println("El pago es de: "+ pago_total);
        
    
        }else if(ventas>15000){
            x=ventas*0.09;
            y=ventas*0.13;
            pago_total=pago_semanal+x+y;
            System.out.println("El pago es de: "+ pago_total);
        }else{
            x=ventas*0.09;
            pago_total=pago_semanal+x;
            System.out.println("El pago es de: "+ pago_total);

        }
    
    }
        
}
    
