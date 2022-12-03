
package colas.pkg1;
import java.util.Scanner;
public class Colas1 {

    public static void main(String[] args) {
     Cola c = new Cola();
      Cola Cola = new Cola();
      Cola cajero1 = new Cola();
      Cola cajero2 = new Cola();
      Cola cajero3 = new Cola();
      Cola cajero4 = new Cola();
     Scanner teclado = new Scanner(System.in);
     int opcionMenu = 0;
     do{
         System.out.println("|---------------------------------------|");
         System.out.println("|                | COLAS |              |");
         System.out.println("|--------------------|------------------|");
         System.out.println("|1.Insertar----------|------------------|");
         System.out.println("|2.Buscar------------|4.Desplegar-------|");
         System.out.println("|3.Modificar---------|5.Salir-----------|");
         System.out.println("|---------------------------------------|");
         System.out.println("Escoja una opcion: ");
         opcionMenu = teclado.nextInt();
         switch(opcionMenu){
             case 1:
                 System.out.println("Insete el Nodo ");
                 c.insertarnodo();
                 break;
             case 2:
                 System.out.println("Buscar Nodo");
                 c.buscarnodo();
                 break;
             case 3:
                 System.out.println("Modificar Nodo");
                 c.modificarnodo();
                 break;
             case 4:
                 System.out.println("Desplegar Nodo");
                 c.desplegar();
             case 5:
                 System.out.println("Programa finalizado....");
                 break;
             default:
                   System.out.println("Opcion no valida");
                   System.exit(0);
                   break;
             
         }
         
     }
     while (opcionMenu !=5);
     }

    
}
