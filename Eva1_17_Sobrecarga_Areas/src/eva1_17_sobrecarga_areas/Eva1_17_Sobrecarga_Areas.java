/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_17_sobrecarga_areas;

/**
 *
 * @author mario
 */
public class Eva1_17_Sobrecarga_Areas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Area del circulo: "+ Area(10));
        System.out.println("Area del triangulo: "+ Area(10, 5));
        System.out.println("Area del trapecio: "+ Area(15, 10, 5));
    }
    public static double Area(double Radio){
        return Math.pow(Radio, 2)*Math.PI;
    }
    public static double Area(double B, double A){
        return B*A/2;
    }
    public static double Area(double BM, double bm, double A){
    return (A*(BM * bm))/2;
}
}
