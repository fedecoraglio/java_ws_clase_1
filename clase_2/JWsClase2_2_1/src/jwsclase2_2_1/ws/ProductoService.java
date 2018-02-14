/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwsclase2_2_1.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import jwsclase2_2_1.model.Producto;

/**
 *
 * @author Federico Coraglio
 */
@WebService
public class ProductoService {
    
    @WebMethod
    public Producto getProducto() {
        return new Producto("123", "Teclado");
    }
}
