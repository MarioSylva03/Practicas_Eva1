/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack1;

import Pack2.ClassE;

/**
 *
 * @author mario
 */
public class ClassA {
 public int publicA;
 int defaultA;
 private int privateA;
 
 public void prueba(){
     ClassB objB = new ClassB();
     //objB.defaultB;
     //objB.PublicB;
     
     ClassC objC = new ClassC();
     //objC.PublicC;
     //objC.defaultC;
     
     ClassC objD = new ClassC();
     //objC.PublicD;
     //objC.defaultD;
     
     //CLASES DEL PAQUETE2
     ClassE objE = new ClassE();
     //objE.publicE;
     
     
     
 }
 
 
}
class ClassB{
    public int publicB;
 int defaultB;
 private int privateB;
}
