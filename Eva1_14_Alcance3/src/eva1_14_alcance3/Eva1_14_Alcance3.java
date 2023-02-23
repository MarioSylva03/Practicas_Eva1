/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_14_alcance3;

/**
 *
 * @author mario
 */
public class Eva1_14_Alcance3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 100;
        System.out.println(x);
        for (int i = 0; i < 10; i++) {
            //int x = 100; // no se puede, ya existe en el main
            System.out.println(x); //visible en todo el main
            System.out.println(i);
            if(i==5){
                System.out.println(x); //visible en todo el amin
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            
        }
    }
    public static void Algo(int x){
        
    }
    
    public static void Algo2(int x){
        
    }
}
