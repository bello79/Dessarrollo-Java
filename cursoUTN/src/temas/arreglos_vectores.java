package temas;

public class arreglos_vectores {
    public static void main(String[] args) {
        //tres formas de declarar el vector

        //1)
        int numeroTabla[];
        numeroTabla = new int[2]; //defino el alcance
            //a continuacion defino los valores que contine en sus respectivas posiciones
        numeroTabla[0] = 0;
        numeroTabla[1] = 1;

        //2)
        int[] numeroTabla2 = new int[3]; //creo y defino el alcance en la misma linea
        numeroTabla2[0] = 45; //al igual que el anterior defino su valor y posicion

        //3)
        int[] numeroTabla3 ={0, 1, 2}; /// Defino tanto el arreglo, su alcance y los datos que va a contener

    }
}
