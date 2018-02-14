/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwsclase2_2_3;

import javax.xml.ws.Endpoint;
import jwsclase2_2_3.ws.PersonaImpl1Service;
import jwsclase2_2_3.ws.PersonaImpl2Service;

/**
 *
 * @author Federico Coraglio
 */
public class JWsClase2_2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Starting web service");
        Endpoint.publish("http://localhost:8085/persona1Service", 
                new PersonaImpl1Service());
        Endpoint.publish("http://localhost:8084/persona2Service", 
                new PersonaImpl2Service());
        System.out.println("Server is started");
    }
    
}
