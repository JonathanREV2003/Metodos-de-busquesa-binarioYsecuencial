package listaEnlasada;

public class Main {
    public static void main(String[] args) {
/* / Pruebas unitarias 1

        Nodo primero = new Nodo("eJEMPLO");
        Nodo segundo = new Nodo(100);
        Nodo tercero = new Nodo("Hola mundo");

        //Enlasar nodo primero
        primero.enlazarSiguiente(segundo);
        primero.obtenerSiguiente().enlazarSiguiente(tercero);
        System.out.println(primero
                .obtenerSiguiente()
                .obtenerSiguiente()
                .getValor()
                .toString());
*/

        Lista_Metodos a = new Lista_Metodos();

        a.insertarFinal("A");
        a.insertarFinal("B");
        a.insertarFinal("C");
        a.insertarFinal("D");
        a.insertarFinal("E");
        a.insertarInicio("Inicio");

        System.out.println("Lista completa");
        a.mostrarLista();

        System.out.println();
        System.out.println("Eliminamos el inicio");
        a.eliminarInicio();
        a.mostrarLista();

        System.out.println();
        System.out.println("Extraemos el nuevo inicio");

        System.out.println(a.extraerElInicio());
        System.out.println();
        System.out.println("Nueva lista completa");

        a.mostrarLista();


    }
}
