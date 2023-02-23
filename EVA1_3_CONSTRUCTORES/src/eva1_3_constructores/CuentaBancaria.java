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
public class CuentaBancaria {
    private String Ncuenta;
    private String Propietario;
    private Double Saldo;
    
    //CONSTRUCTOR:
    //MODIFICADRO DE ACCESO NOMBRE DE LA CLASE (ARGUMENTOS)
    
    public CuentaBancaria(){ //contructor default
        Ncuenta = "";
        Saldo = 10000.0;
        Propietario = "";
    }
    public CuentaBancaria(String Nocuenta, double cant, String Nomcliente){
        Ncuenta = Nocuenta;
        Saldo = cant;
        Propietario = Nomcliente;
        
    }
     public String getNcuenta(){ //metodo GET
        return Ncuenta;
    }
    public void setNcuenta(String valor){ // metodo SET
        Ncuenta = valor;
    }
    public String getPropietario(){ //metodo GET
        return Propietario;
    }
    public void getNcuenta(String valor){ // metodo SET
        Ncuenta = valor;
    }
    public String getSaldo(){ //metodo GET
        return Ncuenta;
    }
    public void setSaldo(double valor){ // metodo SET
        Saldo = valor;
    }
    public void imprimedatos(){
        System.out.println("Saldo Disponible: €" +Saldo);
        System.out.println("No. Cuenta: " +Ncuenta);
        System.out.println("Porpietario de la cuenta: " +Propietario);
}
}

