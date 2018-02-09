/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwclase1_1.pkg7;

import jwclase1_1.pkg7.wsdl.response.MiPrimerWebServiceService;
import jwclase1_1.pkg7.wsdl.response.WebServiceProducer;

/**
 *
 * @author Federico Coraglio
 */
public class JWClase1_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MiPrimerWebServiceService service =
                new MiPrimerWebServiceService();
        WebServiceProducer webService = 
                service.getWebServiceProducerProxy();
        
        System.out.println("Consumiendo desde el proyecto 1.7");
        System.out.println(webService.operationSaludos("lolo"));
        System.out.println(webService.saludos());
    }
    
}
