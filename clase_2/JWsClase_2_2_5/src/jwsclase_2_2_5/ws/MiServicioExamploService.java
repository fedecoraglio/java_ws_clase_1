/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwsclase_2_2_5.ws;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Federico Coraglio
 */
@WebService(serviceName = "servicioEjemplo",
        portName = "getServicioEjemplo")
public class MiServicioExamploService {
    
    @Oneway
    @WebMethod(operationName = "guardarMsj")
    public void guardarMensaje(@WebParam(name = "miParametro") String mensaje) {
        System.out.println(
                "Recibi el mensaje sin problemas. Mensaje: " + mensaje);
    }
}
