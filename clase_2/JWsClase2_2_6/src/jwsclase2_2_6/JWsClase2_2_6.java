/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwsclase2_2_6;

import jwsclase2_2_6.wsresp.MiServicioExamploService;
import jwsclase2_2_6.wsresp.ServicioEjemplo;

/**
 *
 * @author Federico Coraglio
 */
public class JWsClase2_2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioEjemplo servicioEjemplo = new ServicioEjemplo();
        MiServicioExamploService service = 
                servicioEjemplo.getGetServicioEjemplo();
        service.guardarMsj("Este es un ejemplo");
    }
    
}
