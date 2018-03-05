/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawsclase3_3_5;

import javawsclase3_3_5.ws.MyService;
import javax.xml.ws.Endpoint;

/**
 *
 * @author Federico Coraglio
 */
public class JavaWsClase3_3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Levantando el servicio");
        Endpoint.publish("http://localhost:8088/myServicio", new MyService());
        System.out.println("El servicio esta levantado");
    }
    
}
