/*
El directorio telefónico posee además las siguientes funcionalidades:
A. agregarContacto() que permite registrar un nuevo contacto con su respectivo nro. de
teléfono. Siendo el nro. del teléfono la clave del mismo.
B. buscarContacto() que en base al nro. de teléfono retorna el Contacto asociado al mismo.
C. buscarTeléfono() que en base a un apellido nos devuelve un Set<Long> con los números
de teléfono asociados a dicho apellido.
D. buscarContactos() que en base a una ciudad nos devuelve un ArrayList con los
Contactos asociados a dicha ciudad.
E. borrarContacto() que en base al número de teléfono elimina el contacto del directorio.
 */
package trabajopract5;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author analf
 */
public class DirTelefonico {
     private final TreeMap<Long, Contacto> contactos;

    public DirTelefonico() {
        this.contactos = new TreeMap<>();
    }

   
    public void agregarContacto(Long telefono, Contacto contacto) {
        if (!contactos.containsKey(telefono)) {
            contactos.put(telefono, contacto);
            System.out.println("El contacto ha sido agregado");
        } else {
            System.out.println("El num ya esta registrado.");
        }
    }

    
    public Contacto buscarContacto(Long telefono) {
        return contactos.get(telefono);
    }

   
    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> telefonos = new TreeSet<>();
        for (Map.Entry<Long, Contacto> entry : contactos.entrySet()) {
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)) {
                telefonos.add(entry.getKey());
            }
        }
        return telefonos;
    }

   
    public ArrayList<Contacto> buscarContactos(String ciudad) {
        ArrayList<Contacto> contactosEnCiudad = new ArrayList<>();
        for (Contacto contacto : contactos.values()) {
            if (contacto.getCiudad().equalsIgnoreCase(ciudad)) {
                contactosEnCiudad.add(contacto);
            }
        }
        return contactosEnCiudad;
    }

   
    public void borrarContacto(Long telefono) {
        if (contactos.containsKey(telefono)) {
            contactos.remove(telefono);
            System.out.println(" El contacto ha sido eliminado.");
        } else {
            System.out.println("El número no existe.");
        }
    }

   
    public void mostrarContactos() {
        for (Map.Entry<Long, Contacto> entry : contactos.entrySet()) {
            System.out.println("Teléfono: " + entry.getKey() + " - " + entry.getValue());
        }
    }
}
    

    

