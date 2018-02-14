/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwsclase2_2_3.ws;

import javax.jws.WebService;
import jwsclase2_2_3.model.Persona;

/**
 *
 * @author Federico Coraglio
 */
@WebService(endpointInterface = "jwsclase2_2_3.ws.IPersonaService")
public class PersonaImpl2Service implements IPersonaService {

    @Override
    public Persona getPersona() {
        return new Persona("421", "persona2");
    }
    
}
