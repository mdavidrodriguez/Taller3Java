package taller3java;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int A,B,C, x[], mayor, menor, suma=0;
       
        System.out.println("Ingresemos el codigo de los productos vendidos:");
        A= teclado.nextInt();    
        x= new int[A];
       
        for(int i=0;i<A;i++)
        {
            System.out.println("x["+i+"]");
            x[i]= teclado.nextInt();
        }
         System.out.println("Elementos del Arreglo:");
         for(int i=0;i<A;i++)
         {
             System.out.println("x["+i+"]:" +x[i]);
         }
         
        System.out.println("Cantidad de elementos:");
        B= teclado.nextInt();    
        x= new int[B];
       
        for(int i=0;i<B;i++)
        {
            System.out.println("x["+i+"]");
            x[i]= teclado.nextInt();
        }
         System.out.println("Elementos del Arreglo:");
         for(int i=0;i<B;i++)
         {
             System.out.println("x["+i+"]:" +x[i]);
         }
         
        System.out.println("Cantidad de elementos:");
        C= teclado.nextInt();    
        x= new int[C];
       
        for(int i=0;i<C;i++)
        {
            System.out.println("x["+i+"]");
            x[i]= teclado.nextInt();
        }
         System.out.println("Elementos del Arreglo:");
         for(int i=0;i<C;i++)
         {
             System.out.println("x["+i+"]:" +x[i]);
         }
         
         mayor=menor=x[0];
         for(int i=0;i<C;i++)
             if(x[i]>mayor)
                 mayor=x[i];
         else
                 if(x[i]<menor)
                     menor=x[i];
       
         for(int i=0;i<C;i++)
             suma= x[i]+suma;
         
        

         System.out.println("El producto mas vendido fue:" +mayor);
         System.out.println("El numero menor es:" +menor);
         System.out.println("La cantidad de productos vendidos en el dia fue de:" +suma);                                                                                    
    }  
}
