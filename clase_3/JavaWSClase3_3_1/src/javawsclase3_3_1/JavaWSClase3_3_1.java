/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawsclase3_3_1;

import javawsclase3_3_1.responsews.GeoIP;
import javawsclase3_3_1.responsews.GeoIPService;
import javawsclase3_3_1.responsews.GeoIPServiceHttpGet;
import javawsclase3_3_1.responsews.GeoIPServiceHttpPost;
import javawsclase3_3_1.responsews.GeoIPServiceSoap;

/**
 *
 * @author Federico Coraglio
 */
public class JavaWSClase3_3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeoIPService service = new GeoIPService();
        GeoIPServiceHttpGet serviceGet = service.getGeoIPServiceHttpGet();
        GeoIP geoIP = serviceGet.getGeoIP("35.170.145.166");
        System.out.println("Return Code: " + geoIP.getReturnCode());
        System.out.println("Return Details: " + geoIP.getReturnCodeDetails());
        System.out.println("Contry Name: " + geoIP.getCountryName());
        System.out.println("Contry code: " + geoIP.getCountryCode());
        
    }
    
}
