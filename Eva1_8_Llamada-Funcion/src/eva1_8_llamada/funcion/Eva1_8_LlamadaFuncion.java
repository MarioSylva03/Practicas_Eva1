/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_llamada.funcion;

/**
 *
 * @author mario
 */
public class Eva1_8_LlamadaFuncion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("INICIA main()");
        A();     
        System.out.println("TERMINA main()");
        
    }
    public static void A(){
         System.out.println("INICIA A()");
         B();
        System.out.println("TERMINA A()");
    }
    public static void B(){
         System.out.println("INICIA B()");

        System.out.println("TERMINA B()");
    }
    
    
}
