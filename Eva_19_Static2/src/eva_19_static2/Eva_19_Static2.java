/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_19_static2;

/**
 *
 * @author mario
 */
public class Eva_19_Static2 {
int x = 100;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(x);
        //mensajeNOestatico();
        Eva_19_Static2 obj = new Eva_19_Static2();
        System.out.println(obj.x);
        obj.mensajeNOestatico();
        
        obj.mensajeEstatico();
    }
    public void mensajeNOestatico(){
        System.out.println("Mensaje NO esatico");
    }
    public static void mensajeEstatico(){
        System.out.println("Mensaje estatico");
    }
}
