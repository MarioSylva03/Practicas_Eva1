/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_18_static;

/**
 *
 * @author mario
 */
public class Eva_18_Static {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //AL INICIAR SU PROGRAMA SE CREA TODO LO ESTATICO
        Prueba hola = new Prueba();
        hola.mensaje();
        Prueba.mensajeEstatico();
        System.out.println("PI" + Math.PI);
    }
    
}

class Prueba{
    public void mensaje(){ // Solo al creaer objetos
        System.out.println("HOLA");
    }
    public static void mensajeEstatico(){ //Directamente de la clase prueba
        System.out.println("HOLA esatico");
    } 
}
class Otra{
    
}
