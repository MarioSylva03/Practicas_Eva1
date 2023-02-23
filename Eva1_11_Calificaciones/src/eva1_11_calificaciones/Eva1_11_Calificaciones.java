/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_calificaciones;

/**
 *
 * @author mario
 */
public class Eva1_11_Calificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char result;
        result = grade(90);
        System.out.println(result);
        System.out.println(grade(80));
        
    }
        public static char grade(int n){
            char result;
            if(n>=90 && n<=100){
               result = 'A';
            }
            
            else if (n>=80 && n<=90){
                result = 'B';
            }
            else if (n>=70 && n<=80){
                result = 'C';
            }
            else{
               result = 'D';
            }
            return result;
        
        }
    }
    
