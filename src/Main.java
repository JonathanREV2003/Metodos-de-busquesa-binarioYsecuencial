import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //METODO DE BUSQUEDA BINARIA

        Scanner dato = new Scanner(System.in);
        Scanner busquedaNum = new  Scanner(System.in);
        System.out.println("Ingrese el tamaño de del arreglo");
        int tamaño = dato.nextInt();

        // declaración del arreglo

        int[] Arreglo = new int[tamaño];

        //capturar datos dentro del arreglo

        for (int i = 0; i < Arreglo.length; i++){

            System.out.println("Ingresa un numero para la pocición > " + i + " < del arreglo");
            Arreglo[i] = dato.nextInt();
        }

        System.out.println("¿Que numero desea saber su posicion dentro del arreglo?");
        int Buscar = busquedaNum.nextInt();

        //Mostrar el arreglo

        System.out.println("Contenido del Arreglo");
        for(int y = 0; y < Arreglo.length; y++){
            System.out.println("Arreglo["+y+"] = " + Arreglo[y]);
        }

        //int busquedaNum;
        int inferior = 0;
        int centro;
        int superior = tamaño -1;

        //Algoritmo de busqueda
        while (inferior <= superior){

            centro = (superior+inferior)/2;
            if (Arreglo[centro] == Buscar){

                System.out.println("El numero buscado esta en la posicion: "+centro);
                break;

            } else if (Buscar < Arreglo[centro]){
                superior = centro-1;
            } else {
                inferior = centro + 1;
            }
        }
    }
}