public class Pila {
    private Nodo ultimovaloringresado;
    private String lista;
    private int tamaño;

    public Pila(){
        this.ultimovaloringresado = null;
        this.tamaño = 0;
        this.lista = "";
    }

    public void IngresarNodoPila(Object informacion){
        Nodo nuevoNodo = new Nodo(informacion);
        nuevoNodo.siguiente = ultimovaloringresado;
        ultimovaloringresado = nuevoNodo;
        tamaño++;
    }

    public int TamañoPila(){
        return tamaño;
    }

    public String ImprimirPila(){
        lista = "";
        Nodo recorrido = ultimovaloringresado;
        while(recorrido != null){
            lista += recorrido.informacion + " - > ";
            recorrido = recorrido.siguiente;
        }
        return lista;
    }

    public boolean PilaVacia(){
        return ultimovaloringresado == null;
    }

    public Object TopePila(){
        return ultimovaloringresado.informacion;
    }

    public Object EliminarNodo(){
        Object eliminado = ultimovaloringresado.informacion;
        ultimovaloringresado = ultimovaloringresado.siguiente;
        tamaño--;
        return eliminado;
    }

    public void VaciarPila(){
        while(!PilaVacia())
            EliminarNodo();
    }
}
