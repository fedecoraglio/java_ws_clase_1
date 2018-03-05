/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawsclase3_3_5.ws;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Federico Coraglio
 */
@WebService
@HandlerChain(file = "Servicio.xml")
public class MyService {
    
    @WebMethod
    public String greetings() {
        System.out.println("Ejecutando el servicio greetings");
        return "Este es un ejemplo utilizando handlers";
    }
    
}
