package CapMenu;

import static CapMenu.UIMenuNaveNoTripulada.vistaMenuNaveNoTripulada;
import static CapMenu.UIMenuNaveTripulada.vistaMenuNaveTripulada;
import static CapMenu.UIMenuVehiculosLanzadera.vistaMenuVehiculoLanzadera;
import static CapNavesService.NavesService.buscarGrupoDeNaves;
import static CapNavesService.NavesService.buscarNaveEspecifica;
import static CapNavesService.NavesService.modificarNave;
import static CapNavesService.NavesService.mostrarTotalidadNaves;
import java.util.Scanner;

//Clase UIMenu en donde se encunetra los metodos que haran las veces de Menus para que el usuario pueda interactuar
public class UIMenu {

    //Metodo vistaGeneralMenu que se era el menu general de interaccion con el usuario
    public static void vistaGeneralMenu() {
        System.out.println("BIENVENIDO AL PROGRAMA NAVES\n\n");
        System.out.println("Digite el numero correspondiete segun la opcion que desea ejecutar:");
        System.out.println("1. Ingresar nueva Nave");
        System.out.println("2. Buscar nave especifica");
        System.out.println("3. Buscar grupo de naves");
        System.out.println("4. Mirar el total de naves en inventario");
        System.out.println("5. Modificar alguna de las naves en inventario");
        System.out.println("6. Salir\n\n");

        Scanner sc = new Scanner(System.in);
        int opcionMenuGeneral = 0;

        //Condicional do-while para ejecutar el menu como minimo una vez
        do {
            opcionMenuGeneral = sc.nextInt();

            //Switch para ejecutar una accion segun la opcion leida por teclado
            switch (opcionMenuGeneral) {
                
                //Redirecciona a la opcion de crear una nave
                case 1:
                    int opcionSelecionTipoNave = 0;
                    System.out.println("Sleccione el tipo de nave que vamos a ingresar");
                    System.out.println("1. Vehivulo Lanzadera");
                    System.out.println("2. Nave No Tripulada");
                    System.out.println("3. Nave Tripulada");
                    System.out.println("4. Para volver al menu anterior\n\n");
                    opcionSelecionTipoNave = sc.nextInt();

                    //Condicional if para determinar el tipo de nave a crear segun la opcion leida por teclado
                    if (opcionSelecionTipoNave == 1) {
                        //Se llama el metodo vistaMenuVehiculoLanzadera
                        vistaMenuVehiculoLanzadera();
                    }
                    if (opcionSelecionTipoNave == 2) {
                        //Se llama el metodo vistaMenuNaveNoTripulada
                        vistaMenuNaveNoTripulada();
                    }
                    if (opcionSelecionTipoNave == 3) {
                        //Se llama el metodo vistaMenuNaveTripulada
                        vistaMenuNaveTripulada();
                    } else {
                        System.out.println("Selecciona una opcion correcta\n\n");
                        //Se llama el metodo vistaGeneralMenu en caso de dar una opcion invalida
                        vistaGeneralMenu();
                    }
                    break;
                
                // Redirecciona a la opcion de buscar una nave especifica   
                case 2:
                    System.out.println("Las busquedas especificas se realizan atraves de los nombres de las naves");
                    System.out.println("Digite el nombre de la nave que desea buscar");
                    
                    //Se llama al metodo buscarNaveEspecifica de la capa de Servicio
                    buscarNaveEspecifica();
                    break;
                    
                // Redirecciona a la opcion de buscar un grupo de naves    
                case 3:
                    System.out.println("Las busquedas generales se realizan atraves de caracteristicas como:");
                    System.out.println("1. Nacionalidad");
                    System.out.println("2. Tipo de combustible");
                    System.out.println("3. Tipo de nave");
                    System.out.println("4. Mision prinicipal de la nave");
                    System.out.println("Digita la palabra clave para comenzar la busqueda: ejemplo[EEUU] o [Nave No Tripulada]");
                    
                    //Se llama al metodo buscarGrupoDeNaves de la capa de Servicio
                    buscarGrupoDeNaves();
                    break;
                    
                // Redirecciona a la opcion de mostrar el inventario de naves    
                case 4:
                    //Se llama al metodo mostrarTotalidadNaves de la capa de Servicio
                    mostrarTotalidadNaves();
                    
                    //Se llama el metodo vistaGeneralMenu
                    vistaGeneralMenu();
                    break;
                
                // Redirecciona a la opcion de modificar alguna nave existente en la base de datos    
                case 5:
                    //Se llama al metodo modificarNave de la capa de servicio
                    modificarNave();
                    break;
                
                //Opcion para terminar el ciclo do-while y cerrar la ejecuion del programa    
                case 6:
                    System.out.println("Hasta Pronto!!");
                    System.exit(0);
                    break;
                
                //Opcion que retorna al menu general en caso de dar una respuesta erronea
                default:
                    System.out.println("Por favor digita una opcion correcta");
                    //Se llama el metodo vistaGeneralMenu
                    vistaGeneralMenu();
                    break;
            }
        } while (opcionMenuGeneral != 6);
    }
}
