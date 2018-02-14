/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwsclase2_2_7;

import javax.xml.ws.Endpoint;
import jwsclase2_2_7.ws.ServerInfo;

/**
 *
 * @author Federico Coraglio
 */
public class JWsClase2_2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8082/ServerInfo", new ServerInfo());
        System.out.println("Server is started");
    }
    
}
