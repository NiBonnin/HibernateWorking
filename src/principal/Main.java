/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.List;
import modelo.dao.GenericDAO;
import modelo.pojo.Cliente;

/**
 *
 * @author Nico
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /*
        
        FOR THIS TO WORK YOU NEED TO ADD THE LIBRARIES
            -SPRING FRAMEWORK
            -HIBERNATE
            -PERSISTENCE
            -JSTL
            -mysql-connector-java-5.1.23-bin.jar
        
        
        */
        GenericDAO clienteDAO = new GenericDAO();

        //Creamos tes instancias de Contacto  (String nombre, String direccion, int codigoPostal, String telefono, String cuit)
        Cliente cliente1 = new Cliente("Pedro", "dr clark 385","2466", "3260", 86 ,15531.0 ,465.0); 
        Cliente cliente2 = new Cliente("Manuel", "dr clark 385","2466", "3260", 86 ,15531.0 ,465.0);
        Cliente cliente3 = new Cliente("Martin", "dr clark 385","2466", "3260", 86 ,15531.0 ,465.0);
        Cliente cliente4 = new Cliente("Josecito", "dr clark 385","2466", "3260", 86 ,15531.0 ,465.0);

        
        
        
        clienteDAO.save(cliente1);
        List<Cliente> list = clienteDAO.getAll(Cliente.class);
        System.out.println(list.size());
        for(Cliente c : list)
        {System.out.println("-> " + c.getNombre());
        } 

        //Guardamos las tres instancias, guardamos el id del contacto1 para usarlo posteriormente 
        /*System.out.println(clienteDAO.get(Cliente.class, 9));
        Object contacoborrar = clienteDAO.get(Cliente.class, 9);
        if (contacoborrar == null) {
            System.out.println("es null el concatco este papu");
        } 
        else{
            clienteDAO.delete(contacoborrar);
        }*/
        
        /*clienteDAO.save(cliente1); 
        clienteDAO.save(cliente2);
        clienteDAO.save(cliente3);
        clienteDAO.save(cliente4);
        clienteDAO.delete(cliente3);*/
        
        //Modificamos el contacto 2 y lo actualizamos         
        /*cliente2.setNombre("Nuevo Cliente 2");
        clienteDAO.actualizaCliente(cliente2);
        //genericDAO.save(cliente4);
        //Recuperamos el contacto1 de la base de datos 
        //contactoRecuperado = genericDAO.get(Cliente.class, idAEliminar);
        contactoRecuperado = clienteDAO.obtenContacto(idAEliminar);
        System.out.println("Recuperamos a " + contactoRecuperado.getNombre());

        //Eliminamos al contactoRecuperado (que es el contacto3)
        clienteDAO.eliminaCliente(contactoRecuperado);
        
        //Obtenemos la lista de contactos que quedan en la base de datos y la mostramos
        List<Cliente> listaContactos = clienteDAO.obtenListaContactos();
        System.out.println("Hay " + listaContactos.size() + " clientes en la base de datos");

        for(Cliente c : listaContactos)
        {System.out.println("-> " + c.getNombre());
        } */
    }
    
}
