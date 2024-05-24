import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner Teclado = new Scanner(System.in);
        Pila pila = new Pila();
        int opcion;
        boolean continuar = true;
        Object informacion;
        while(continuar){
            System.out.println("- - - - - Menú - - - - -");
            System.out.println("Ingresar nodo a la pila: 1");
            System.out.println("Tamaño de la pila: 2");
            System.out.println("Tope de la pila: 3");
            System.out.println("¿La pila está vacía?: 4");
            System.out.println("Imprimir pila: 5");
            System.out.println("Eliminar nodo de la pila: 6");
            System.out.println("Vacíar Pila: 7");
            System.out.println("Salir del programa: 8");
            System.out.print("\nIngrese una opción del menú:");
            opcion = Teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingresa un valor al nodo:");
                    informacion = Teclado.nextInt();
                    pila.IngresarNodoPila(informacion);
                    break;

                case 2:
                    if(pila.PilaVacia()){
                        System.out.println("La pila está vacía");
                    }
                    else{
                        System.out.println("El tamaño de la pila es: " + pila.TamañoPila());
                    }
                    break;
            
                case 3:
                    if(pila.PilaVacia()){
                        System.out.println("La pila está vacía");
                    }
                    else{
                        System.out.println("El tope de la pila es: " + pila.TopePila());
                    }
                    
                    break;

                case 4:
                    if(pila.PilaVacia()){
                        System.out.println("La pila está vacía");
                    }
                    else{
                        System.out.println("La pila no está vacía");
                    }
                    break;

                case 5:
                    if(pila.PilaVacia()){
                        System.out.println("La pila está vacía");
                    }
                    else{
                        System.out.println(pila.ImprimirPila());
                    }
                    break;

                case 6:
                    if(pila.PilaVacia()){
                        System.out.println("La pila está vacía");
                    }
                    else{
                        System.out.println("El nodo con valor " + pila.EliminarNodo() + " ha sido eliminado." );
                    }
                    break;

                case 7:
                    if(pila.PilaVacia()){
                        System.out.println("La pila está vacía");
                    }
                    else{
                        pila.VaciarPila();
                        System.out.println("Se ha vaciado la pila");
                    }
                    break;

                case 8:
                    System.out.println("Saliendo del Programa...");
                    continuar = false;
                    break;
                    
                default:
                    System.out.println("Ingrese una opción válida del menú.");
                    break;
            }
        }
        Teclado.close();
    }
}
