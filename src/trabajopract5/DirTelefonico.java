/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    

    

