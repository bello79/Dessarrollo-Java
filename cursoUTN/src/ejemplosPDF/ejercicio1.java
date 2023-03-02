package ejemplosPDF;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        int num1,num2,resultado;
        Scanner Teclado = new Scanner (System.in);
        System.out.print("Ingrese el primer numero:");
        num1 = Teclado.nextInt();
        System.out.println("Ingrese el segundo numero:");
        num2 = Teclado.nextInt();
        resultado = num1 + num2;
        System.out.println("El resultado es: "+"\n"+resultado);
    }
}
