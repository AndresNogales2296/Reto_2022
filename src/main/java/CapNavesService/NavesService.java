package CapNavesService;

import CapNaves.NavesNoTripuladas;
import CapNaves.NavesTripuladas;
import CapNaves.VehiculosLanzadera;
import CapNavesDAO.NavesDao;
import static CapNavesDAO.NavesDao.buscarGrupoDeNavesDB;
import static CapNavesDAO.NavesDao.buscarNaveEspecificaDB;
import static CapNavesDAO.NavesDao.modificarNaveDB;
import static CapNavesDAO.NavesDao.mostrarTotalidadNavesDB;
import java.util.Scanner;

//Clase mediante la cual se reciben los datos del usuario y se envia a la capa DAO
public class NavesService {

    //Metodo para proporcionar al programa las caracteristicas o atributos de las nave
    // para crear el objeto nave 
    public static void crearNaveNoTripulada(NavesNoTripuladas nave) {
        
        //Llamamos al metodo crearNaveNoTripuladaDB que se encuentra en la capa NavesDao y le asignamos
        //el objeto nave como dato de partida
        NavesDao.crearNaveNoTripuladaDB(nave);
    }

    public static void crearNaveTripulada(NavesTripuladas nave) {
        
        NavesDao.crearNaveTripuladaDB(nave);
    }

    public static void crearVehiculoLanzadera(VehiculosLanzadera nave) {
        
        NavesDao.crearVehiculoLanzaderaDB(nave);
    }

    //Metodo para asignar el atributo especifico nombre para realizar la busqueda de la nave en la base de datos
    public static void buscarNaveEspecifica() {
        //Medainte la clase Scanner accedemos a el atributo ingresado por teclado
        Scanner sc = new Scanner(System.in);
        
        //Asignamos la cadena de texto a la variable nombreBusquedaEspecifica
        String nombreBusquedaEspecifica = sc.nextLine();
        
        //Llamamos al metodo buscarNaveEspecificaDB que se encuentra en la capa NavesDao y le asignamos
        //la variable nombreBusquedaEspecifica como dato de partida
        buscarNaveEspecificaDB(nombreBusquedaEspecifica);

    }

    //Metodo para asignar el atributo general para realizar la busqueda del grupo de naves en la base de datos
    public static void buscarGrupoDeNaves() {
        
        Scanner sc = new Scanner(System.in);
        String nombreBusquedaEspecifica = sc.nextLine();
        buscarGrupoDeNavesDB(nombreBusquedaEspecifica);
    }

    public static void mostrarTotalidadNaves() {
        mostrarTotalidadNavesDB();
    }

    public static void modificarNave() {
        System.out.println("A continuacion se observaran el total de las naves");
        System.out.println("Ten en mente el ID de la nave que deseas modificar ");
        System.out.println("");
        mostrarTotalidadNavesDB();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita el nuevo nombre de la nave");
        String nombreModificado = sc.nextLine();
        System.out.println("Digita el nuevo combustible de la nave");
        String combustibleModificado = sc.nextLine();
        System.out.println("Digita la nueva nacionalidad de la nave");
        String nacionalidadModificado = sc.nextLine();
        System.out.println("Digita la nueva mision principal de la nave");
        String misionPrincipalModificado = sc.nextLine();
        System.out.println("Digita el nuevo tipo de nave");
        String tipoNaveModificado = sc.nextLine();
        System.out.println("Digita el nuevo año de lanzamiento de la nave");
        int añoDeLanzamientoModificado = sc.nextInt();
        System.out.println("Digita el nuevo año de aterrizaje de la nave");
        System.out.println("Si aun sigue en ortbita digita el año actual");
        int añoDeAterriazajeModificado = sc.nextInt();
        System.out.println("Digite el ID de la nave a modificar");
        int iDDeNaveModificada= sc.nextInt();
        
        modificarNaveDB(iDDeNaveModificada,nombreModificado,combustibleModificado,nacionalidadModificado,añoDeLanzamientoModificado,añoDeAterriazajeModificado,misionPrincipalModificado,tipoNaveModificado);
    }
}
