/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_circulo;

/**
 *
 * @author mario
 */
public class Circulo {
    private double A;
    private double P;
    private double R;
    
    public Circulo(){
    R=5;
    }
    public Circulo(double Radio) {
       R=Radio;
        
    } 
    public double area(){ //valor default
        A = Math.PI * Math. pow(R,2);
        return A;
}
    public double perimetro(){
        P = (2*Math.PI)*(R);
        return P;
    }
    public void imprimeresultados(){
        System.out.println("El valor de la area del circulo es: " +A);
        System.out.println("El valor del perimetro del circulo es: " +P);
    }
            
    
}
