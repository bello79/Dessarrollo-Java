package ejemplosPDF;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un numero para la tabla");
        byte num = lector.nextByte();

        System.out.println("Uso de FOR");
        for(int i = 1; i <= num; i++ ){
            System.out.println(i*num);
            System.out.println("Repito despues de cada ciclo FOR");
        }

        System.out.println("Uso de While");
        int contador = 1;
        while (contador <= num){
            System.out.println(contador * num);
            System.out.println("repito despues de cada ciclo WHILE");
            contador++;
        }

        System.out.println("Uso de DO WHILE");
        int contador2= 1;
        do {
            System.out.println(contador * num);
            System.out.println("Repito despues de cada ciclo DO WHILE");
            contador2++;
        }while (contador <= num);
    }
}
