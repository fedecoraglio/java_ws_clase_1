/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clase4_4_3.javawsclase4_4_3;

import com.google.gson.Gson;
import com.google.gson.internal.StringMap;
import com.mercadolibre.sdk.Meli;
import com.mercadolibre.sdk.MeliException;
import com.ning.http.client.Response;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Federico Coraglio
 */
public class MercadoLibreMain {
    
    public static void main(String args[]) throws IOException {
        Meli meli = new Meli(4374812305345237L,
        "ux2qcwlpNj1EExKXxTnefTfMXs40UsQY");
        try {
            Response response = meli.get("/sites/");
            Gson gson = new Gson();
            List<StringMap<String>> sites = 
                    gson.fromJson(response.getResponseBody(), List.class);
            for(StringMap<String> entry: sites) {
                System.out.println(entry.get("id") + " - " + entry.get("name"));
            }            
        } catch (MeliException ex) {
            Logger.getLogger(MercadoLibreMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
