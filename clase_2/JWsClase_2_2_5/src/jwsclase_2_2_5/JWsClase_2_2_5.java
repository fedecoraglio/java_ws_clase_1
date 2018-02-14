/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwsclase_2_2_5;

import javax.xml.ws.Endpoint;
import jwsclase_2_2_5.ws.MiServicioExamploService;

/**
 *
 * @author Federico Coraglio
 */
public class JWsClase_2_2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Starting service");
        Endpoint.publish("http://localhost:8081/MiServicio", 
                new MiServicioExamploService());
        System.out.println("Service is started");
    }
    
}
