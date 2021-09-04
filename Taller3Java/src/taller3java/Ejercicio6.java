import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        int numero, cifra, resultado=0, exp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un numero Binario: ");
        numero=sc.nextInt();
        do{
            cifra=numero%10;
            resultado=resultado+cifra*(int)Math.pow(2, exp);
            exp++;
            numero=numero/10;
        }while(numero>0);
        System.out.println("El numero decimal es: "+ resultado);
}
}
