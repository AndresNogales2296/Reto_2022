package CapNaves;

//Subclase que hereda atributos de la superclase Naves
public class NavesNoTripuladas extends Naves{
   
    public NavesNoTripuladas(String nombre, String combustible, String nacionalidad, int añoLanzamineto, int añoAterrizaje, String misionPrincipal) {
        super(nombre, combustible, nacionalidad, añoLanzamineto, añoAterrizaje, misionPrincipal);
    }
    
}
