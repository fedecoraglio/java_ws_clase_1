/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawsclase3_3_2;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


/**
 *
 * @author Federico Coraglio
 */
public class JavaAXml {
    
    public static void main(String[] args) throws JAXBException {
        Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setEdad(25);
        cliente.setNombre("juan perez");
        JAXBContext context = JAXBContext.newInstance(Cliente.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(cliente, System.out);
        m.marshal(cliente, new File("cliente.xml"));
    }
    
}
