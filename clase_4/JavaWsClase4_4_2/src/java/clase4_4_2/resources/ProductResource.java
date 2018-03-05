/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4_4_2.resources;

import clase4_4_2.model.Product;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Federico Coraglio
 */
@Path("productos")
public class ProductResource {
    
    private static List<Product> PRODUCTS = new ArrayList<Product>();
    static {
        PRODUCTS.add(new Product(1, "Default", "mi tipo"));
    }
    
    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<Product> getProducts() {
        return PRODUCTS;
    }
    
    @GET
    @Path("{id}")
    @Produces(value = {MediaType.APPLICATION_JSON})
    public Product getProductById(@PathParam("id") long id) {
        Product product = null;
        for(Product p: PRODUCTS) {
            if(p.getId() == id) {
                product = p;
                break;
            }
        }
        return product;
    }
    
    @POST
    @Produces(value = {MediaType.APPLICATION_JSON})
    @Consumes(value = {MediaType.APPLICATION_JSON})
    public Product saveProduct(Product product) {
        if(product != null) {
            product.setId(Math.round(Math.random() * 100));
            PRODUCTS.add(product);
        }
        return product;
    }
    
    @DELETE
    @Path("{id}")
    @Produces(value = {MediaType.APPLICATION_JSON})
    public Product deleteProduct(@PathParam("id") long id) {
        Product productToDelete = new Product();
        productToDelete.setId(id);
        PRODUCTS.remove(productToDelete);
        return productToDelete;
    }
}
