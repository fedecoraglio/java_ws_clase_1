/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwsclase2_2_1;

import javax.xml.ws.Endpoint;
import jwsclase2_2_1.ws.ProductoService;

/**
 *
 * @author Federico Coraglio
 */
public class JWsClase2_2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Starting service");
        Endpoint.publish("http://localhost:8181/ProductoService", 
                           new ProductoService());
        System.out.println("Service is started");
    }
    
}
