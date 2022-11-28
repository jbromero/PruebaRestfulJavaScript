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
        
        get("/hello", (req, res) -> "Hola Jose. Saludos desde Spark.");
        /*get("/map", (req, res) -> 
        {
            page obj = new prueba();
            return obj;
        });*/
    }
}

 
