/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_20_calculos_geometricos;

/**
 *
 * @author mario
 */
public class Geometria {
//Final un significado para las clases
// un significado para las variable    
//CONSTANTES:
    
    public static final double PI = 3.1416;
    
    //PERIMTERO DE UN CIRCULO
    public static double Pcirculo(double radio){
        return PI*(radio * 2);
    }
    public static double Acirculo(double radio){
        return PI*(radio * radio);
    }
    public static double Vesfera(double radio){
        return (4.0/3.0)*(PI * (radio*radio*radio));
    }
}
