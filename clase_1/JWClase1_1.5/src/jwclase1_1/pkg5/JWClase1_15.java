/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwclase1_1.pkg5;

import jwclase1_1.pkg3.ws.MiPrimerWebService;
import jwclase1_1.pkg3.ws.MiPrimerWebServiceService;

/**
 *
 * @author Federico Coraglio
 */
public class JWClase1_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MiPrimerWebServiceService service = 
                new MiPrimerWebServiceService();
        MiPrimerWebService mpService = 
                service.getMiPrimerWebServicePort();
        
        System.out.println("Consumiendo desde el ws");
        System.out.println(mpService.saludos());
    }
    
}
