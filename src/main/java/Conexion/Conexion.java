package Conexion;

//importamos las clases "Connection" y "DriverManager" necesarias para hacer la conexion a base de datos
import java.sql.Connection;
import java.sql.DriverManager;

//Clase mediante la cual realizamos la conexion a la base de datos
public class Conexion {
    
    //Creamos metodo que devuelve un objeto de tipo conexion
    //Este metodo tiene todas las funcionalidades para conectarnos a la base de datos
    public Connection get_connection (){
        
        //Definimos un objeto de tipo Connection
        Connection conecttion = null;
        
        //Realizamos la conexion
        try {
            //Asignamos los parametros para la conexion a la base de datos
            //Ruta de nuestro host que es local y el puerto en que corre nuestro servicio de datos
            //El nombre de la base de datos
            //Usuario root y sin contraseña que son parametros que viene asignados por defecto 
            conecttion = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_naves","root","");
            
            //Validamos la conexion
            if (conecttion != null) {
                System.out.println("Conexion exitosa");
            }
        } catch (Exception e) {
            System.out.println(e );
        }
        return conecttion;
    }
}
