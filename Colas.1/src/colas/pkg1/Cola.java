
package colas.pkg1;
import java.util.Scanner;
public class Cola {
    nodo primero;
    nodo ultimo;
    private int []cola;
    Scanner teclado = new Scanner(System.in);
    public Cola(){
        primero = null;
        ultimo = null;
    }
    
    public void insertarnodo(){
        nodo nuevo = new nodo();
        System.out.println(" Ingrese un dato:");
        nuevo.dato = teclado.nextInt();
        if(primero == null ){
            primero = nuevo;
        }else{
            ultimo.siguiente = nuevo;
            nuevo.siguiente = null;
            ultimo =nuevo;
        }
        System.out.println(" Nodo ingresado ");
    }//fin insertar
    
    public void desplegar(){
        nodo  actual = new nodo();
        actual = primero;
        if(primero !=null){
            while(actual != null){
                System.out.println(" "+ actual.dato);
                actual = actual.siguiente;
            }
        }else {
            System.out.println("La cola se encuenttra vacía");
        }
    }
    
    public void buscarnodo(){
        nodo actual = new nodo();
        actual = primero;
        boolean encontrado = false;
        System.out.println(" Ingrese el dato del nodo a buscar ");
        int nodobuscado = teclado.nextInt();
        if(primero !=null){
            while(actual != null && encontrado != true){
                if(actual.dato == nodobuscado){
                    System.out.println("Nodo con el dato (" +actual.dato + ") Encontrado");
                    
                    encontrado=true;
                }
                System.out.println(" "+ actual.dato);
                actual = actual.siguiente;
            }
            if(!encontrado){
                System.out.println("Nodo no encongtrado");
            }
        }else{
            System.out.println("La cola se encuentra vacia");
        }
        
    }
    
    public void modificarnodo(){
        nodo actual = new nodo();
        actual = primero;
        boolean encontrado = false;
        System.out.println(" Ingrese el dato del nodo a buscar ");
        int nodobuscado = teclado.nextInt();
        if(primero !=null){
            while(actual != null && encontrado != true){
                if(actual.dato == nodobuscado){
                    System.out.println("Nodo con el dato (" +actual.dato + ") Encontrado");
                    System.out.println("Ingrese el nuevo dato para este nodo: ");
                    actual.dato = teclado.nextInt();
                    System.out.println("Nodo modificado");
                    encontrado = true;
                }
                actual = actual.siguiente;
            }
            if(!encontrado){
                System.out.println("Nodo no encongtrado");
            }
        }else{
            System.out.println("La cola se encuentra vacia");
        }
    }
}
