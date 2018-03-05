/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4_4_2;

import clase4_4_2.resources.ProductResource;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author Federico Coraglio
 */
@ApplicationPath("recursos")
public class AppConfig extends Application {
    
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> sets = new HashSet<>();
        sets.add(ProductResource.class);
        return sets;
    }
}
