/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concatenacion;

/**
 *
 * @author Santiago
 */
public class Concatenacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var alumno = "Lucia";
        var titulo = "Informatico";
        
        var concat = titulo + " " + alumno;
        
        System.out.println("concat = "+concat);
        
        //Definimos variables enteras
        var valor1 = 1;
        var valor2 = 5;
        System.out.println(valor1 + valor2);
        System.out.println(valor1 + valor2 + alumno);
        System.out.println(alumno + valor1 + valor2);
        System.out.println(alumno + (valor1 + valor2));
    }
    
}
