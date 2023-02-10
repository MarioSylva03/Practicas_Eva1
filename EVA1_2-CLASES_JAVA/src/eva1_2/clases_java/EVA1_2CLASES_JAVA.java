/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2.clases_java;

/**
 *
 * @author mario
 */
public class EVA1_2CLASES_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CREAR OBJETO
        //INSTANSACION
        //INSTANSACION --> DAR MEMORIA RAM
          //nombre de la clase identificador = new constructor de la clase          
          
        Persona perso1 = new Persona(); //Persona clase perso1 objeto
        /*perso1.nombre = ("Mario");
        perso1.apellidos = ("Sylva");
        System.out.println(perso1.nombre + " " + perso1.apellidos);*/
        perso1.setNombre("Mario");
        perso1.setApellidos("Sylva Iracheta");
        perso1.setEdad(19);
        perso1.setGenero('H');
       /* System.out.println( perso1.getNombre());
        System.out.println( perso1.getApellidos());
        System.out.println( perso1.getEdad());
        System.out.println( perso1.getGenero());*/
        perso1.imprimirDatos();
        //--                   //Constructor
        
        System.out.println("");
        
        Persona perso2 = new Persona();
        perso2.setNombre("Nick");
        perso2.setApellidos("GR");
        perso2.setEdad(69);
        perso2.setGenero('G');
        perso2.imprimirDatos();
    }
    
}
