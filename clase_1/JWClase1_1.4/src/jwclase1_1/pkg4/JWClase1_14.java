/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwclase1_1.pkg4;

import jwclase1_1.pkg4.wsdl.reponse.MiPrimerWebService;
import jwclase1_1.pkg4.wsdl.reponse.MiPrimerWebServiceService;

/**
 *
 * @author Federico Coraglio
 */
public class JWClase1_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MiPrimerWebServiceService service = new
            MiPrimerWebServiceService();
        MiPrimerWebService mpService = 
                service.getMiPrimerWebServicePort();
        
        System.out.println("Consumiendo el web Service");
        System.out.println(mpService.saludos());
        System.out.println(mpService.saludosConNombre("Jose"));
    }
    
}
