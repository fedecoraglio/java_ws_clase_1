/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawsclase3_3_4;

import java.util.logging.Level;
import java.util.logging.Logger;
import javawsclase3_3_4.ws.response.Producto;
import javawsclase3_3_4.ws.response.ProductoException_Exception;
import javawsclase3_3_4.ws.response.ProductoService;
import javawsclase3_3_4.ws.response.ProductoServiceService;

/**
 *
 * @author Federico Coraglio
 */
public class JavaWSClase3_3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ProductoServiceService serviceProxy = new ProductoServiceService();
            ProductoService productoService = serviceProxy.getProductoServicePort();
            Producto producto = new Producto();
            producto.setName("Mi nuevo producto");
            producto.setType("tipo 1");
            Producto prod = productoService.guardarProducto(producto);
            System.out.println("Producto Guardado con el id " + prod.getId());
        } catch (ProductoException_Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            System.out.println("Error details " + ex.getFaultInfo().getFaultCode() 
            + " " + ex.getFaultInfo().getFailtString() + " " + 
                    ex.getFaultInfo().getMessage());
        }
    }
    
}
