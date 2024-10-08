package trabajopract5;

import java.util.ArrayList;
import java.util.Set;

/**
 *
 * @author analf
 */
public class TrabajoPract5 {

    
    public static void main(String[] args) {
        
            DirTelefonico directorio = new DirTelefonico();

       
        Contacto contacto1 = new Contacto("12345678", "Jose", "Pereyra", "Buenos Aires", "Av San Juan 456");
        Contacto contacto2 = new Contacto("45869345", "María", "Gimenez", "San Luis", "Av. Illia 458");
        Contacto contacto3 = new Contacto("44589632", "Laura", "Pereyra", "Cordoba", "Av. Lafinur 350");
        Contacto contacto4 = new Contacto("39393626", "Ailen", "Fernandez", "Buenos Aires", "Av San Jose 101");

        // 1
        directorio.agregarContacto(1111111111L, contacto1);
        directorio.agregarContacto(2222222222L, contacto2);
        directorio.agregarContacto(3333333333L, contacto3);
        directorio.agregarContacto(4444444444L, contacto4);

        // 2
        System.out.println("\nBuscar contacto por teléfono 1111111111:");
        System.out.println(directorio.buscarContacto(1111111111L));
        
        // 3
        System.out.println("\nBuscar teléfonos por apellido 'Péreyra':");
        Set<Long> telefonosPereyra = directorio.buscarTelefono("Péreyra");
        for (Long telefono : telefonosPereyra) {
            System.out.println("Teléfono: " + telefono);
        }
        
        // 4
        System.out.println("\nBuscar contactos por ciudad 'Buenos Aires':");
        ArrayList<Contacto> contactosBuenosAires = directorio.buscarContactos("Buenos Aires");
        for (Contacto contacto : contactosBuenosAires) {
            System.out.println(contacto);
        }
        
        // 5
        System.out.println("\nEliminar contacto con teléfono 1111111111:");
        directorio.borrarContacto(1111111111L);

        // Mostrar todos los contactos
        System.out.println("\nContactos en el directorio:");
        directorio.mostrarContactos();
    }
}
    
    
