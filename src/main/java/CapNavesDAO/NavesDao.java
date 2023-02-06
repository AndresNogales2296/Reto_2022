package CapNavesDAO;

import CapMenu.UIMenu;
import CapNaves.NavesNoTripuladas;
import CapNaves.NavesTripuladas;
import CapNaves.VehiculosLanzadera;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


//Clase mediante la cual se reciben los datos de la capa de servicio y se realizan las consultas a la base de datos
public class NavesDao {

    
    //Metodo mediante el cual se almacena un nuevo objeto en la base de datos
    public static void crearNaveNoTripuladaDB(NavesNoTripuladas nave) {
        
        //Objeto de tipo Conexion
        Conexion db_connect = new Conexion();
        
        //Obtenemos un objeto de tipo Connection medainte el metodo get_connection que es el metodo crerado 
        //para conectar a la base de datos
        try (Connection conexion = db_connect.get_connection()) {
            
            //Creamos un objeto de tipo PreparedStatement o "sentencia preparada"
            PreparedStatement ps = null;

            //Creamos otro try para generar la insercion de los datos
            try {
                
                //Generamos un String llamado query en el cual se encuentra el comando SQL para realizar la consulta 
                String query = "INSERT INTO `tbl_naves` (`nombre_nave`, `combustible_nave`, `nacionalidad_nave`, `año_lanzamineto_nave`, `año_aterrizaje_nave`, `mision_principal_nave`, `tipo_de_nave`) VALUES (?,?,?,?,?,?,?);";
                ps = conexion.prepareStatement(query);
                ps.setString(1, nave.getNombre());
                ps.setString(2, nave.getCombustible());
                ps.setString(3, nave.getNacionalidad());
                ps.setInt(4, nave.getAñoLanzamineto());
                ps.setInt(5, nave.getAñoAterrizaje());
                ps.setString(6, nave.getMisionPrincipal());
                ps.setString(7, "Nave No Tripulada");
                //Llamamos al metodo executeUpdate o "Ejecutar Actualizacion" que da la instruccion a la base de datos
                //para que genere la consulta
                ps.executeUpdate();
                System.out.println("La nave fue añadida corretamente");
                System.out.println(" ===================================");
                
                //Retorno al menu general del programa
                UIMenu.vistaGeneralMenu();
            } catch (SQLException e) {
                //En caso de no haber conexion imprimimos en pantalla el fallo
                System.out.println(e);
                UIMenu.vistaGeneralMenu();
            }
        } catch (Exception e) {
            System.out.println(e);
            UIMenu.vistaGeneralMenu();
        }
    }

    public static void crearNaveTripuladaDB(NavesTripuladas nave) {
        Conexion db_connect = new Conexion();
        try (Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;

            try {
                String query = "INSERT INTO `tbl_naves` (`nombre_nave`, `combustible_nave`, `nacionalidad_nave`, `año_lanzamineto_nave`, `año_aterrizaje_nave`, `mision_principal_nave`, `tipo_de_nave`) VALUES (?,?,?,?,?,?,?);";
                ps = conexion.prepareStatement(query);
                ps.setString(1, nave.getNombre());
                ps.setString(2, nave.getCombustible());
                ps.setString(3, nave.getNacionalidad());
                ps.setInt(4, nave.getAñoLanzamineto());
                ps.setInt(5, nave.getAñoAterrizaje());
                ps.setString(6, nave.getMisionPrincipal());
                ps.setString(7, "Nave Tripulada");
                ps.executeUpdate();
                System.out.println("La nave fue añadida corretamente");
                System.out.println(" ===================================");
                UIMenu.vistaGeneralMenu();
            } catch (SQLException e) {
                System.out.println(e);
                UIMenu.vistaGeneralMenu();
            }
        } catch (Exception e) {
            System.out.println(e);
            UIMenu.vistaGeneralMenu();
        }
    }

    public static void crearVehiculoLanzaderaDB(VehiculosLanzadera nave) {
        Conexion db_connect = new Conexion();
        try (Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;

            try {
                String query = "INSERT INTO `tbl_naves` (`nombre_nave`, `combustible_nave`, `nacionalidad_nave`, `año_lanzamineto_nave`, `año_aterrizaje_nave`, `mision_principal_nave`, `tipo_de_nave`) VALUES (?,?,?,?,?,?,?);";
                ps = conexion.prepareStatement(query);
                ps.setString(1, nave.getNombre());
                ps.setString(2, nave.getCombustible());
                ps.setString(3, nave.getNacionalidad());
                ps.setInt(4, nave.getAñoLanzamineto());
                ps.setInt(5, nave.getAñoAterrizaje());
                ps.setString(6, nave.getMisionPrincipal());
                ps.setString(7, "Vehiculo Lanzadera");
                ps.executeUpdate();
                System.out.println("La nave fue añadida corretamente");
                System.out.println(" ===================================");
                UIMenu.vistaGeneralMenu();
            } catch (SQLException e) {
                System.out.println(e);
                UIMenu.vistaGeneralMenu();
            }
        } catch (Exception e) {
            System.out.println(e);
            UIMenu.vistaGeneralMenu();
        }
    }

    //Metodo mediante el cual se lee informacion de los objetos en la base de datos para filtrarlos como
    //una busqueda especifica
    public static void buscarNaveEspecificaDB(String nombreBusquedaEspecifica) {
        
        //Objeto de tipo Conexion
        Conexion db_connect = new Conexion();
        
        //Obtenemos un objeto de tipo Connection medainte el metodo get_connection que es el metodo creado 
        //para conectar a la base de datos
        try (Connection conexion = db_connect.get_connection()) {
            
            //Creamos un objeto de tipo PreparedStatement o "sentencia preparada"
            PreparedStatement ps = null;
            
            //Creamos un objeto de tipo ResulSet que nos permite traer los datos en fila para poder mostrarlos
            ResultSet rs = null;
            
            //Creamos otro try para generar la consulta de los datos
            try {
                //Generamos un String llamado query en el cual se encuentra el comando SQL para realizar la consulta
                String query = "SELECT * FROM tbl_naves WHERE nombre_nave LIKE ?";
                ps = conexion.prepareStatement(query);
                ps.setString(1, nombreBusquedaEspecifica);
                
                //Asignamos al objeto rs los datos que se extraen de la base de datos mediante el metodo executeQuery
                rs = ps.executeQuery();

                //Ciclo while en el cual mientras existan datos en el objeto rs mostraremos en tantalla los datos del objeto
                while (rs.next()) {
                    System.out.println("ID Nave: " + rs.getInt("id_nave"));
                    System.out.println("Nombre Nave: " + rs.getString("nombre_nave"));
                    System.out.println("Combustible Nave: " + rs.getString("combustible_nave"));
                    System.out.println("Nacionalidad Nave: " + rs.getString("nacionalidad_nave"));
                    System.out.println("Año de lanzamiento Nave: " + rs.getInt("año_lanzamineto_nave"));
                    System.out.println("Año de aterrizaje Nave: " + rs.getInt("año_aterrizaje_nave"));
                    System.out.println("Mision Principal Nave: " + rs.getString("mision_principal_nave"));
                    System.out.println("Tipo de Nave: " + rs.getString("tipo_de_nave"));
                    System.out.println("===============================");
                    System.out.println("");
                }
                
                //Retorno al menu general del programa
                UIMenu.vistaGeneralMenu();

            } catch (SQLException e) {
                System.out.println(e);
                UIMenu.vistaGeneralMenu();
            }
        } catch (Exception e) {
            System.out.println(e);
            UIMenu.vistaGeneralMenu();
        }

    }

    //Metodo mediante el cual se lee informacion de los objetos en la base de datos para filtrarlos como
    //una busqueda general segun un atributo especifico
    public static void buscarGrupoDeNavesDB(String caracteristicaParaBusqueda) {
   
        //Objeto de tipo Conexion
        Conexion db_connect = new Conexion();
        
        //Obtenemos un objeto de tipo Connection medainte el metodo get_connection que es el metodo creado 
        //para conectar a la base de datos
        try (Connection conexion = db_connect.get_connection()) {
            
            //Creamos un objeto de tipo PreparedStatement o "sentencia preparada"
            PreparedStatement ps = null;
            
            //Creamos un objeto de tipo ResulSet que nos permite traer los datos en fila para poder mostrarlos
            ResultSet rs = null;
            
            //Creamos otro try para generar la consulta de los datos
            try {
                //Generamos un String llamado query en el cual se encuentra el comando SQL para realizar la consulta
                String query = "SELECT * FROM tbl_naves WHERE nacionalidad_nave LIKE ? OR combustible_nave LIKE ? OR mision_principal_nave LIKE ? OR tipo_de_nave LIKE ?";
                ps = conexion.prepareStatement(query);
                ps.setString(1, caracteristicaParaBusqueda);
                ps.setString(2, caracteristicaParaBusqueda);
                ps.setString(3, caracteristicaParaBusqueda);
                ps.setString(4, caracteristicaParaBusqueda);
                
                //Asignamos al objeto rs los datos que se extraen de la base de datos mediante el metodo executeQuery
                rs = ps.executeQuery();

                //Ciclo while en el cual mientras existan datos en el objeto rs mostraremos en tantalla los datos del objeto
                while (rs.next()) {
                    System.out.println("ID Nave: " + rs.getInt("id_nave"));
                    System.out.println("Nombre Nave: " + rs.getString("nombre_nave"));
                    System.out.println("Combustible Nave: " + rs.getString("combustible_nave"));
                    System.out.println("Nacionalidad Nave: " + rs.getString("nacionalidad_nave"));
                    System.out.println("Año de lanzamiento Nave: " + rs.getInt("año_lanzamineto_nave"));
                    System.out.println("Año de aterrizaje Nave: " + rs.getInt("año_aterrizaje_nave"));
                    System.out.println("Mision Principal Nave: " + rs.getString("mision_principal_nave"));
                    System.out.println("Tipo de Nave: " + rs.getString("tipo_de_nave"));
                    System.out.println("===============================");
                    System.out.println("");
                }
                //Retornamos al menu principal del usuario
                UIMenu.vistaGeneralMenu();

            } catch (SQLException e) {
                //Imorimimos en pantalla en caso de que no se realice la conexion
                System.out.println(e);
                UIMenu.vistaGeneralMenu();
            }
        } catch (Exception e) {
            System.out.println(e);
            UIMenu.vistaGeneralMenu();
        }

    }

    //Metodo mediante el cual se lee informacion de los objetos en la base de datos para imprimirlos
    // como un inventario
    public static void mostrarTotalidadNavesDB() {
        
        //Objeto de tipo Conexion
        Conexion db_connect = new Conexion();

        //Creamos un objeto de tipo PreparedStatement o "sentencia preparada"
        PreparedStatement ps = null;
            
        //Creamos un objeto de tipo ResulSet que nos permite traer los datos en fila para poder mostrarlos
        ResultSet rs = null;
        
        //Obtenemos un objeto de tipo Connection medainte el metodo get_connection que es el metodo creado 
        //para conectar a la base de datos
        try (Connection conexion = db_connect.get_connection()) {
            
            //Generamos un String llamado query en el cual se encuentra el comando SQL para realizar la consulta
            String query = "SELECT * FROM tbl_naves";
            ps = conexion.prepareCall(query);
            
            //Asignamos al objeto rs los datos que se extraen de la base de datos mediante el metodo executeQuery
            rs = ps.executeQuery();

            //Ciclo while en el cual mientras existan datos en el objeto rs mostraremos en tantalla los datos del objeto
            while (rs.next()) {
                System.out.println("ID Nave: " + rs.getInt("id_nave"));
                System.out.println("Nombre Nave: " + rs.getString("nombre_nave"));
                System.out.println("Combustible Nave: " + rs.getString("combustible_nave"));
                System.out.println("Nacionalidad Nave: " + rs.getString("nacionalidad_nave"));
                System.out.println("Año de lanzamiento Nave: " + rs.getInt("año_lanzamineto_nave"));
                System.out.println("Año de aterrizaje Nave: " + rs.getInt("año_aterrizaje_nave"));
                System.out.println("Mision Principal Nave: " + rs.getString("mision_principal_nave"));
                System.out.println("Tipo de Nave: " + rs.getString("tipo_de_nave"));
                System.out.println("===============================");
                System.out.println("");
            }
            System.out.println("El anterior fue el inventario completo de las naves");
            System.out.println("");

        } catch (Exception e) {
            System.out.println("No se lograron traer los datos");
            UIMenu.vistaGeneralMenu();
        }

    }

    //Metodo mediante el cual se le reasignan los atributos a uno de los objetos en la base de datos
    public static void modificarNaveDB(int idModificado, String nombreModificado, String combustibleModificado, String nacionalidadModificada, int añoLanzamientoModificado, int añoAterrizajeModificado, String misionModificado, String tipoNaveModificado) {

        //Objeto de tipo Conexion
        Conexion db_connect = new Conexion();
        
        //Obtenemos un objeto de tipo Connection medainte el metodo get_connection que es el metodo creado 
        //para conectar a la base de datos
        try (Connection conexion = db_connect.get_connection()) {
            
            //Creamos un objeto de tipo PreparedStatement o "sentencia preparada"
            PreparedStatement ps = null;

            //Creamos otro try para generar la insercion de los datos
            try {
                
                //Generamos un String llamado query en el cual se encuentra el comando SQL para realizar la consulta
                String query = "UPDATE tbl_naves SET nombre_nave = ?, combustible_nave = ?, nacionalidad_nave = ?, año_lanzamineto_nave = ?, año_aterrizaje_nave = ?, mision_principal_nave = ?, tipo_de_nave = ? WHERE id_nave = ?";
                ps = conexion.prepareStatement(query);
                ps.setString(1, nombreModificado);
                ps.setString(2, combustibleModificado);
                ps.setString(3, nacionalidadModificada);
                ps.setInt(4, añoLanzamientoModificado);
                ps.setInt(5, añoAterrizajeModificado);
                ps.setString(6, misionModificado);
                ps.setString(7, tipoNaveModificado);
                ps.setInt(8, idModificado);
                
                //Llamamos al metodo executeUpdate o "Ejecutar Actualizacion" que da la instruccion a la base de datos
                //para que genere la consulta
                ps.executeUpdate();
                System.out.println("La nave se actualizo correctamente");
                
                //Retornamos al menu principal
                UIMenu.vistaGeneralMenu();
            } catch (SQLException e) {
                System.out.println(e);
                UIMenu.vistaGeneralMenu();
            }
        } catch (Exception e) {
            System.out.println("No se lograron traer los datos");
            UIMenu.vistaGeneralMenu();
        }

    }
}
