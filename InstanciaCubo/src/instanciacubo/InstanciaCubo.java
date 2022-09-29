/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instanciacubo;

import Dominio.Cubo;

/**
 *
 * @author Alumno Mañana
 */
public class InstanciaCubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instancia de cubo
        Cubo cub = new Cubo(7,4,10);
        System.out.println("ESTE CUBO MIDE "+cub.volumen()+" METROS CÚBICOS");
    }
    
}
