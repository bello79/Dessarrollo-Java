package temas;

import java.util.function.DoubleToIntFunction;

public class cadenasString {
    public static void main(String[] args) {

        String apellido = "Gomez";
        String primeras3 = apellido.substring(0, 3);

        System.out.println(primeras3);

        int longitud = apellido.length();
        System.out.println("La longitud es: " + longitud);

        String ultimas3 = apellido.substring(longitud-3);
        System.out.println("Las ultimas 3 de apellido son: " + ultimas3);



    }

   static String name;
        {
        name = "carlos";
    }
}
