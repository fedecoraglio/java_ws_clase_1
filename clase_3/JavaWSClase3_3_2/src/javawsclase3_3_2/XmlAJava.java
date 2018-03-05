/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawsclase3_3_2;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Federico Coraglio
 */
public class XmlAJava {
    
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Cliente.class);
        Unmarshaller u = context.createUnmarshaller();
        Cliente cliente = (Cliente)u.unmarshal(new File("cliente.xml"));
        System.out.println(cliente);
    }
    
}
