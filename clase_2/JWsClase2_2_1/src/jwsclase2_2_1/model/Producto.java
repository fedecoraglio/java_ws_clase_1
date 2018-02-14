/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwsclase2_2_1.model;

/**
 *
 * @author Federico Coraglio
 */
public class Producto {
    
    private String id;
    private String nombre;
    
    public Producto(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public Producto(){}
    
    public String getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
