package trabajoPracticaClass1;

import java.util.Scanner;

public class practica2 {
    public static void main(String[] args) {
        //Excercise 2
        String apto = "Usted es apto para percibir el subsidio";
        String noApto = "Usted no es apto para percibir el subsidio";
        //Condicion 1
        Scanner ingresos = new Scanner(System.in);
        System.out.println("cargue el ingreso mensual del hogar (sin puntos): ");
        int ingreso = Integer.parseInt(ingresos.next());

        //Condicion 2
        Scanner vehiculo = new Scanner(System.in);
        System.out.println("posee vehiculo? (1 por SI, 2 por NO)");
        int vehiculos = Integer.parseInt(vehiculo.next());
        int cumpleCondicionAuto = 2;

        if (vehiculos == 1){
            Scanner cuantos = new Scanner(System.in);
            System.out.println("Ingrese la cantidad de vehiculos que posee: ");
            int cuantosAutos = Integer.parseInt(cuantos.next());

            Scanner antiguedadAuto = new Scanner(System.in);
            System.out.println("Ingrese la antiguedad en años con numeros enteros del auto mas antiguo que posee: ");
            int antiguedadVehiculo = Integer.parseInt(antiguedadAuto.next());

            if (cuantosAutos > 3 && antiguedadVehiculo < 5){
                cumpleCondicionAuto = 1;
            }

        }

        //Condicion 3
        Scanner inmueble = new Scanner(System.in);
        System.out.println("posee inmuebles? (1 por SI, 2 por NO)");
        int inmuebles = Integer.parseInt(inmueble.next());

        int cantidadInmuebles = 0;

        if (inmuebles == 1){
            Scanner cuantosInm = new Scanner(System.in);
            System.out.println("Ingrese la cantidad de vehiculos que posee: ");
            int cuantosInmuebles = Integer.parseInt(cuantosInm.next());
            cantidadInmuebles = cuantosInmuebles;

        }

        //Condicion 4
        Scanner otrosBienes = new Scanner(System.in);
        System.out.println(" Posee una embarcación, una aeronave de lujo o ser titular de activos " +
                " societarios que demuestren capacidad económica plena ? (1 por SI, 2 por NO)");
        int otrosBienesLujo = Integer.parseInt(otrosBienes.next());

        if ((ingreso > 489083) || (cantidadInmuebles > 3) ||
                (cumpleCondicionAuto == 1) || (otrosBienesLujo == 1)) {
            System.out.println(noApto);
        } else {
            System.out.println(apto);
        }
    }
}
