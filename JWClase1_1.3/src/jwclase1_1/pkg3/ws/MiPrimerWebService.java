/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwclase1_1.pkg3.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Federico Coraglio
 */
@WebService(name = "WebServiceProducer", portName = "WebServiceProducerProxy")
public class MiPrimerWebService {
    
    @WebMethod(exclude = false)
    public String saludos() {
        return "Bienvenido a el curso Java Web Service";
    }
    
    @WebMethod(exclude = false, operationName = "operationSaludos")
    public String saludosConNombre(String nombre) {
        System.out.println("La respuesta fue enviada. Parametro : " + nombre);
        return "Bienvenido " + nombre;
    }
    
    @WebMethod(exclude = false)
    public MiPrimerModel getPrimerModel() {
        return new MiPrimerModel("mi primero model object");
    }
    
}
