/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwsclase2_2_2;

import jwsclase2_2_2.wsresponse.GetProducto;
import jwsclase2_2_2.wsresponse.Producto;
import jwsclase2_2_2.wsresponse.ProductoService;
import jwsclase2_2_2.wsresponse.ProductoServiceService;

/**
 *
 * @author Federico Coraglio
 */
public class JWsClase2_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoServiceService productoServiceService =
                new ProductoServiceService();
        
        ProductoService service = productoServiceService.getProductoServicePort();
        Producto producto = service.getProducto();
        System.out.println("Recibiendo el producto desde el web service");
        System.out.println(producto.getId());
    }
    
}
