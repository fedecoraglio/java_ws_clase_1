/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawsclase3_3_3;

import javawsclase3_3_3.ws.ProductoService;
import javax.xml.ws.Endpoint;

/**
 *
 * @author Federico Coraglio
 */
public class JavaWSClase3_3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Starting web service");
        Endpoint.publish("http://localhost:8089/productoService", new ProductoService());
        System.out.println("Web Service was started");
    }
    
}
