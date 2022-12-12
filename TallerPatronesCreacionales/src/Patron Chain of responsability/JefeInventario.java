/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronchain;

/**
 *
 * @author Michelle
 */
public class JefeInventario extends Empleado{
    public boolean admitirCambio(producto p){
        if(p.getPrecio()<1000){
            System.out.println("precio correcto");
            return next.admitirCambio(p);
        }
        System.out.println("precio incorrecto");
        return false;
    }

    
}
