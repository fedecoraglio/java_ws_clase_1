/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwsclase2_2_4;

import jwsclase2_2_4.wsreponse.IPersonaService;
import jwsclase2_2_4.wsreponse.Persona;
import jwsclase2_2_4.wsreponse.PersonaImpl1Service;

/**
 *
 * @author Federico Coraglio
 */
public class JWsClase2_2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaImpl1Service service =
                new PersonaImpl1Service();
        IPersonaService iPersonaService = 
                service.getPersonaImpl1ServicePort();
        Persona persona = iPersonaService.getPersona();
        System.out.println("Estos son los datos");
        System.out.println(persona.getId());
        System.out.println(persona.getNombre());
    }
    
}
