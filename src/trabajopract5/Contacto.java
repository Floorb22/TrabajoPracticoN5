/*
Un directorio telefónico posee una lista de Contactos de los que interesa conocer su
DNI, nombre, apellido, ciudad y dirección. Un contacto se empareja con un teléfono tipo Long.
 */
package trabajopract5;

/**
 *
 * @author analf
 */
public class Contacto {
   
    private final String dni;
    private final String nombre;
    private final String apellido;
    private final String ciudad;
    private final String direccion;

    public Contacto(String dni, String nombre, String apellido, String ciudad, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

   
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "DNI='" + dni + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Apellido='" + apellido + '\'' +
                ", Ciudad='" + ciudad + '\'' +
                ", Dirección='" + direccion + '\'' +
                '}';
    }
}


