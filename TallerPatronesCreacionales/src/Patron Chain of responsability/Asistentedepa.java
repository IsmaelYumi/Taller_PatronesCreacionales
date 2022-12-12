/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronchain;

import java.time.LocalDate;

/**
 *
 * @author Michelle
 */
public class Asistentedepa extends Empleado{
    
    public boolean admitirCambio(producto p){
        if(LocalDate.now().isBefore(p.getgarantiaLimite())& getNext()!= null){
            System.out.println("tiempo valido");
            return next.admitirCambio(p);
        }
        System.out.println("tiempo no valido");
        return false;
    }

   
    
}
