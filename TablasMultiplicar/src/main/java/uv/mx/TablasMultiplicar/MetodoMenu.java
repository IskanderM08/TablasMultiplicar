package uv.mx.TablasMultiplicar;

import java.util.Scanner;

public class MetodoMenu {
    public static void mostrarMenu(){
        System.out.println("Bienvenido al programa para mostrar tablas de multiplicar");
        Scanner reader = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombreUsuario = reader.next();

        int opcionSelector = 0;
        boolean salir = false;
        int tablaMaxima = 5;
        int numeroSeleccionado = 0;

        do {
            System.out.println("Seleccione la opción que desea desplegar: ");
            System.out.println("(1) Mostrar una tabla");
            System.out.println("(2) Mostrar todas las tablas del 2 al 5");
            System.out.println("(3) Salir");
            opcionSelector = reader.nextInt();

            switch (opcionSelector) {
                case 1:
                    do {
                        System.out.println("Ingrese un número del 2 al 5");
                        numeroSeleccionado = reader.nextInt();    
                    } while (numeroSeleccionado < 2 || numeroSeleccionado > 5);
                    MetodoMultiplicar.imprimirMultiplicacion(numeroSeleccionado);
                    System.out.println("Un saludo " + nombreUsuario);
                    break;
                
                case 2:
                    for (int i = 2; i <= tablaMaxima; i++) {
                        MetodoMultiplicar.imprimirMultiplicacion(i);
                        System.out.println("=============");
                    }
                    break;

                case 3:
                    System.out.println("Muchas gracias por utilizar el programa");
                    salir = true;
                    System.exit(0);
                    break;

                default:
                    System.out.println("Seleccione una opción correcta");
                    break;
            }    
        } while (!salir);
        
    }
}