package ejemplosPDF;

public class ejercicio4Vector {
    public static void main(String[] args) {
        int[] nota = new int[5];
        int i;
        nota[0] = 3;
        nota[1] = 10;
        nota[2] = 7;
        nota[3] = 5;
        nota[4] = 8;

        System.out.println("El array tiene: " + nota.length + " elementos");
        System.out.println("lOS ELEMENTOS SON: ");
        for (i = 0; i < nota.length; i ++ ){
            System.out.println(nota[i] + ", ");
        }
        System.out.println();
    }
}
