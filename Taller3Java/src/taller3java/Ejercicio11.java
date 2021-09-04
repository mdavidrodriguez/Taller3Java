package taller3java;
public class Ejercicio11
 {        

 public int Numero( int valor ){
  
 int divisor = 1;
 int contador = 0; 
 int digito = 1;

 while ( 0 != digito )
 {      
  
 digito = valor / divisor;
 divisor *= 10;
 contador++;

 }      

 return --contador;

 }      

 
 public void Invierte (int y ) 

 {         
 
 int digitos = Numero(y);

 for (int i = 1; i < digitos; i++)
 {       
 System.out.printf("\t%d", y % 10);     
 y /= 10;
          
 }       

 System.out.printf("\t%3d", y);
 System.out.println("\n");

 }         
 }

