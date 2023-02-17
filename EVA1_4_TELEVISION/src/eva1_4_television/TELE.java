/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_television;

/**
 *
 * @author mario
 */
public class TELE {
    // Atributos = Estado
    private boolean power;
    private int V;
    private int C;
    //Metodos = Comportamiento
    //Constructor
    public TELE (){ //Constructor deafult
        power = false; //Apagado
        V = 5;
        C = 95;
        
    }
    public void estado(){
        
        if(power == false){ //apagado
            power = true; // enciende la Tv
            System.out.println("Televesion encendida");
        }else{
            power = false;
            System.out.println("Televesion apagada");
        }
        
    }
    public void SubirV(){
        if(power == true){
            if(V < 100){
           V = V + 5;
        System.out.println("Volumen:" +V);
                       }
    }
    }
    public void BajarV(){
        if(power ==true){
            if(V > 0){
           V = V - 5;
        System.out.println("Volumen:" +V);
            }
            if(V == 0){
                System.out.println("mute");
            }
    }
    }
    public void SubirC(){
        if(power == true){
            
            if(C < 100){
            C = C + 1;
                System.out.println("Canal: " +C);
             
        }
            if(C == 100){
                C = 0;
                System.out.println("Canal:" +C);
            }
        }
    }
    public void BajarC(){
        if(power == true){
            
            if(C > 0){
            C = C - 1;
                System.out.println("Canal: " +C);
             
        }
            if(C == 0){
                C = 100;
                System.out.println("Canal:" +C);
            }
        }
        
    }
}
