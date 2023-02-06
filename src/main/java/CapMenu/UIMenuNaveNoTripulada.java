package CapMenu;

import static CapMenu.UIMenu.vistaGeneralMenu;
import CapNaves.NavesNoTripuladas;
import static CapNavesService.NavesService.crearNaveNoTripulada;
import java.util.Scanner;

//Clase que contiene el menu para agregar una nave no tripulada
public class UIMenuNaveNoTripulada {

    public static void vistaMenuNaveNoTripulada() {

        System.out.println("A continuaicon añadiremos una Nave No Tripulada\n\n");

        System.out.println("Si estas seguro de añadir la nave pulsa 1");
        System.out.println("de no ser asi pulsa 2 para retornar al menu anterior\n\n");
        
        //Solicitamos una opcion para validar que el usuario este seguro del tipo de nave que va a crear
        Scanner sc = new Scanner(System.in);
        String opcionSeguirleida = sc.nextLine();
        
        //Debido a que el mextLine lee un dato de tipo String convertimos este dato en entero para
        //ejecutar el switch
        int opcionSeguir = Integer.parseInt(opcionSeguirleida);

        switch (opcionSeguir) {
            
            //Caso 1 para el ingreso de los atributos de la nave y posteriro creacion del objeto
            case 1:
                System.out.println("Ten a la mano los siguientes datos");
                System.out.println("Nombre de la nave ");
                System.out.println("Tipo de combustible ");
                System.out.println("Nacionalidad de la Nave ");
                System.out.println("Año de lanzamiento y de aterrizaje");
                System.out.println("Mision principal en su lanzamiento \n\n");
                //Asignamos las cadenas de texto o enteros segun sea el caso mediante los metodos nextLine o nextInt
                //a cada una de los atributos requeridos para crear el objeto nave
                System.out.println("Digita el nombre de la nave");
                String nombreNaveNoTripuladaIngresado = sc.nextLine();
                System.out.println("Digita el combustible de la nave");
                String combustibleNaveNoTripuladaIngresado = sc.nextLine();
                System.out.println("Digita la nacionalidad de la nave");
                String nacionalidadNaveNoTripuladaIngresado = sc.nextLine();
                System.out.println("Digita la mision principal de la nave");
                String misionPrincipalNaveNoTripuladaIngresado = sc.nextLine();
                System.out.println("Digita el año de lanzamiento de la nave");
                int añoDeLanzamientoNaveNoTripuladaIngresado = sc.nextInt();
                System.out.println("Digita el año de aterrizaje de la nave");
                System.out.println("Si aun sigue en ortbita digita el año actual");
                int añoDeAterriazajeNaveNoTripuladaIngresado = sc.nextInt();
                System.out.println("");

                //Creamos el objeto nave instanciado desde la clase NavesNoTripuladas
                NavesNoTripuladas nave = new NavesNoTripuladas(nombreNaveNoTripuladaIngresado, combustibleNaveNoTripuladaIngresado, nacionalidadNaveNoTripuladaIngresado,
                        añoDeLanzamientoNaveNoTripuladaIngresado, añoDeAterriazajeNaveNoTripuladaIngresado, misionPrincipalNaveNoTripuladaIngresado);

                //Llamamos el metodo crearNaveNoTripulada y le damos el objeto nave como partida
                crearNaveNoTripulada(nave);
                break;
            
            //El usuario se ha equivocado en la eleccion del tipo de nave y retorna al menu general
            case 2:
                //Lamamos el metodo vistaGeneralMenu
                vistaGeneralMenu();
                break;
            
            //El usuario ha digitado una opcion incorrecta y retorna al menu general
            default:
                System.out.println("Digita opcion correcta\n\n");
                //Lamamos el metodo vistaMenuNaveNoTripulada
                vistaMenuNaveNoTripulada();
                break;
        }
    }

}
