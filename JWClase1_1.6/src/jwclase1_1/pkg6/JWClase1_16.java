/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwclase1_1.pkg6;

import jwclase1_1.pkg6.wsdl.response.MiPrimerWebService;
import jwclase1_1.pkg6.wsdl.response.MiPrimerWebServiceService;

/**
 *
 * @author Federico Coraglio
 */
public class JWClase1_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MiPrimerWebServiceService service = new MiPrimerWebServiceService();
        MiPrimerWebService mpService = service.getMiPrimerWebServicePort();
        
        System.out.println("Consumiendo desde 1.6");
        System.out.println(mpService.operationSaludos("Andres"));
    }
    
}
