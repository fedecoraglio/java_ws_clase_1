/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawsclase3_3_3.ws;

import java.util.ArrayList;
import java.util.List;
import javawsclase3_3_3.exception.ProductoException;
import javawsclase3_3_3.model.Producto;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Federico Coraglio
 */
@WebService
public class ProductoService {
    
    private static List<Producto> PRODUCTOS = new
            ArrayList<Producto>();
    
    @WebMethod
    public List<Producto> obtenerProductos() {
        return PRODUCTOS;
    }
    
    @WebMethod
    public Producto guardarProducto(@WebParam(name = "producto") 
            Producto prod) throws ProductoException {
        if(prod == null) {
            throw new ProductoException("El producto no puede ser nulo");
        } else if("".equals(prod.getName())) {
            throw new ProductoException("El nombre producto no puede ser nulo");
        }
        prod.setId((long)(Math.random() * 100));
        PRODUCTOS.add(prod);
        return prod;
    }
}
