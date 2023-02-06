package CapNaves;

//Clase Padre que contiene los atributos y los metodos que se heredan a las subclases
public abstract class Naves {

    //Declaracion de los atributos
    private int id_nave;
    private String nombre;
    private String combustible;
    private String nacionalidad;
    private int añoLanzamineto;
    private int añoAterrizaje;
    private String misionPrincipal;

    //Metodo constructor
    public Naves(String nombre, String combustible, String nacionalidad, int añoLanzamineto, int añoAterrizaje, String misionPrincipal) {
        this.nombre = nombre;
        this.combustible = combustible;
        this.nacionalidad = nacionalidad;
        this.añoLanzamineto = añoLanzamineto;
        this.añoAterrizaje = añoAterrizaje;
        this.misionPrincipal = misionPrincipal;
    }

    //getters y setters 
    public int getId_nave() {
        return id_nave;
    }

    public void setId_nave(int id_nave) {
        this.id_nave = id_nave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getAñoLanzamineto() {
        return añoLanzamineto;
    }

    public void setAñoLanzamineto(int añoLanzamineto) {
        this.añoLanzamineto = añoLanzamineto;
    }

    public int getAñoAterrizaje() {
        return añoAterrizaje;
    }

    public void setAñoAterrizaje(int añoAterrizaje) {
        this.añoAterrizaje = añoAterrizaje;
    }

    public String getMisionPrincipal() {
        return misionPrincipal;
    }

    public void setMisionPrincipal(String misionPrincipal) {
        this.misionPrincipal = misionPrincipal;
    }

    //Metodo definido como comportamiento especifico de las naves
    public static String tiempoEnElEspacio(int añoLanzamiento, int añoAterrizaje) {
        int tiempoEnOrbita;
        tiempoEnOrbita = añoLanzamiento - añoAterrizaje;
        if (tiempoEnOrbita == 0) {
            tiempoEnOrbita = 1;
        } else {
            tiempoEnOrbita = añoLanzamiento - añoAterrizaje;
        }
        return "Tiempo en el espacio = " + tiempoEnOrbita + " años";
    }

}
