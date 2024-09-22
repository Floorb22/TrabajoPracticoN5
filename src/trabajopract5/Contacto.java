/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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


