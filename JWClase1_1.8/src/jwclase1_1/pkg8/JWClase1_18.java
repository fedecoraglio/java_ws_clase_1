/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwclase1_1.pkg8;

import jwclase1_1.pkg8.wsdl.response.MiPrimerModel;
import jwclase1_1.pkg8.wsdl.response.MiPrimerWebServiceService;
import jwclase1_1.pkg8.wsdl.response.WebServiceProducer;

/**
 *
 * @author Federico Coraglio
 */
public class JWClase1_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MiPrimerWebServiceService service = new
            MiPrimerWebServiceService();
        WebServiceProducer webService = 
                service.getWebServiceProducerProxy();
        
        MiPrimerModel model = webService.getPrimerModel();
        
        System.out.println("Consumiendo desde el proyecto 1.8");
        System.out.println(webService.getPrimerModel().getName());
        System.out.println(model.getName());
    }
    
}
