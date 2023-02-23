/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_constructores;

/**
 *
 * @author mario
 */
public class EVA1_3_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // calse IDENTIFICADOR = new CONSTRUCTOR():
        CuentaBancaria perso1 = new CuentaBancaria("100", 1000 , "joe");

        /*perso1.setPropietario("amon goth");
        perso1.setNcuenta("SS69420");
        perso1.setSaldo(1000);*/
        System.out.println("Datos del cliente");
        System.out.println(perso1.getSaldo());
        System.out.println(perso1.getNcuenta());
        System.out.println(perso1.getPropietario());
        
        CuentaBancaria perso2 = new CuentaBancaria();
        
        System.out.println("Datos del cliente");
        System.out.println(perso2.getSaldo());
        System.out.println(perso2.getNcuenta());
        System.out.println(perso2.getPropietario());
        
         CuentaBancaria perso3 = new CuentaBancaria("300000", 100000 , "Mario");
        
        System.out.println("Datos del cliente");
        System.out.println(perso3.getSaldo());
        System.out.println(perso3.getNcuenta());
        System.out.println(perso3.getPropietario());
        
       
    }
    
}
