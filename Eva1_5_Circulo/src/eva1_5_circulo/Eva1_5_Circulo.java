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
public class Eva1_5_Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo C1 = new Circulo();
        
        //C1.area();
        //C1.perimetro();
                
                C1.imprimeresultados();
                
                
                
        Circulo C2 = new Circulo(7);
        
        C2.area();
        C2.perimetro();
                
                C2.imprimeresultados();        
    }
    
}
