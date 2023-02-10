package eva1_2.clases_java;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mario
 */
public class Persona {
    //DATOS --> ATRIBUTOS DE LA CLASE
    private String nombre;
    private String apellidos;
    private int edad;
    private char genero;
    //METODOS --> COMPORTAMIENTO DE LA CLASE
    //LEER Y ESCRIBIR LOS ATRIBUTOS
    //LEER --> GET
    //ESCRIBIR --> SET
    // MODIFICADOR DE ACCESO DE VALOR DE RETORNO DE NONMBRE DEL METODO(ARGUMENTO)
    public String getNombre(){ //metodo GET
        return nombre;
    }
    public void setNombre(String valor){ // metodo SET
        nombre = valor;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String valor){
        apellidos = valor;
    }
    public int getEdad(){ //metodo GET
        return edad;
    }
    public void setEdad(int valor){ // metodo SET
        edad = valor;
    }
    public char getGenero(){ //metodo GET
        return genero;
    }
    public void setGenero(char valor){ // metodo SET
        genero = valor;
    }
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Edad: " + edad);
        if(genero == 'H'){
            System.out.println("Hombre");
        }else if (genero == 'M'){
            System.out.println("Mujer");
        }
        else if(genero == 'L'){
            System.out.println("Lesbiana");
        }
        else if (genero == 'G'){
            System.out.println("Joto");
        }
        else{
            System.out.println("Genero no registrado");
        }
    }
}
