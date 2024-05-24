public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Pila pila = new Pila();
        pila.IngresarNodoPila(5);
        pila.IngresarNodoPila(4);
        pila.IngresarNodoPila(3);
        pila.IngresarNodoPila(2);
        pila.IngresarNodoPila(1);
        System.out.println(pila.ImprimirPila());
    }
}
