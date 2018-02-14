/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwsclase2_2_3.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import jwsclase2_2_3.model.Persona;

/**
 *
 * @author Federico Coraglio
 */
@WebService()
public interface IPersonaService {
    
    @WebMethod
    public Persona getPersona();
    
}
