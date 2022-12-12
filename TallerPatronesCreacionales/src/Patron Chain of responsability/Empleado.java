/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronchain;

/**
 *
 * @author Michelle
 */
public abstract class Empleado implements AdmitirCambio{
    AdmitirCambio next;
    public AdmitirCambio getNext(){
        return this.next;
        
    };
   
    public void setNext(AdmitirCambio acb){
        next = acb;
    }
    
    public boolean admitirCambio(producto p){
        if(next != null) return next.admitirCambio(p);
        return true;
    }
}
