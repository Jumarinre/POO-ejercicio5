package ejercicio5;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        double suma = 0, x, y;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de x");
        x = entrada.nextInt();
        System.out.println("Ingrese el valor de y");
        y = entrada.nextInt();
        suma = suma + x;
        System.out.println("El valor de la suma1 es: " + suma);
        x= x + Math.pow(y,2);
        System.out.println("El nuevo valor de x es: " + x);
        suma = suma + (x/y); 
        System.out.println("El valor de la suma2 es: " + suma);
    }
}
