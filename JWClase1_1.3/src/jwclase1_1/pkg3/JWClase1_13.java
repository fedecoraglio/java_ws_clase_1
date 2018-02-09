/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwclase1_1.pkg3;

import javax.xml.ws.Endpoint;
import jwclase1_1.pkg3.ws.MiPrimerWebService;

/**
 *
 * @author Federico Coraglio
 */
public class JWClase1_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Starting web service on 8084 port");
        Endpoint.publish("http://localhost:8084/MiPrimerWebService", 
                new MiPrimerWebService());
        System.out.println("Web service was started successfully!!");
    }
    
}
