/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.holaspark;
import static spark.Spark.*;

/**
 *
 * @author mauro
 */
public class Holaspark {

    public static void main(String[] args) {
        String apiKey = "AIzaSyC8EbCWBV5LmxSfbMO-PB9SXaMIM0IRZeo";
        String map = "https://maps.googleapis.com/maps/api/js?key="+ apiKey +"&callback=initMap&v=weekly";
        
        get("/hello", (req, res) -> "Hola Jose. Saludos");
        get("/map", (req, res) ->
        {
            res.status(200);
            res.type("index.html");
            return map;
        });
    }
}
