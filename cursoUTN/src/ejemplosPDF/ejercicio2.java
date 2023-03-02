package ejemplosPDF;
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String usuarioDB = "Aracelli";
        String passwordDB = "1234";

        System.out.println("Ingrese su usuario");
        String usuario = teclado.next();

        System.out.println("Ingrese su Password");
        String password = teclado.next();

        if (usuarioDB.equals(usuario) && passwordDB.equals(password)){
            System.out.println("Ingreso Correctamente");
        } else {
            System.out.println("Usuario y contraseña son incorrectos");
        }
    }
}
