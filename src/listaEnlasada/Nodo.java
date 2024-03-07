package listaEnlasada;

public class Nodo {
    /* //Pruebas unitarias 1
    Object valor;
    Nodo siguiente;

    public Nodo(Object valor){
        this.valor=valor;

    }

    public Object getValor() {
        return valor;
    }

    public void enlazarSiguiente(Nodo n){
        siguiente = n;

    }
    public Nodo obtenerSiguiente(){
        return siguiente;
    }
*/
    private String dato;
    Nodo siguiente;
    public Nodo(String i, Nodo s){
        dato = i;
        siguiente = s;
    }
    public String getDato(){
        return dato;
    }
    public  void setDato(String dato){
        this.dato = dato;
    }
    public Nodo getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
}
