package taller3java;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Programa para calcular el sueldo de un empleado");
        int cont, acum,hem,hr,hrse,hrex,sb;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de empleados: ");
        cont=leer.nextInt();
        for (int i = 0; i <cont; i++) {
            acum=+1;
            System.out.println("Cantidad de horas del empleado "+ (i+1));
            hem=leer.nextInt();
            System.out.println("Digitar el Precio de la hora:");
            hr=leer.nextInt();
            
            hrse=hem-40;
            hrex= (int)(float)( hrse*hr*1.5);           
            sb= hrex+(40*hr);
            System.out.println("el sueldo bruto es: "+sb);
            
        }
    }
}      
