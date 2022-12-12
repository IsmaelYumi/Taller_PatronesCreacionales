/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronchain;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.List;

/**
 *
 * @author Michelle
 */
public class producto {
    private double precio;
    private int cantidadStock;
    private LocalDate garantiaLimite;
    private List<problema> problema_admitidos;
    
    public producto(double precio, int cantidadStock, LocalDate garantiaLimite, List<problema> problema_admitidos){
        this.cantidadStock = cantidadStock;
        this.precio=precio;
        this.garantiaLimite=garantiaLimite;
        this.problema_admitidos=problema_admitidos;
    }
            

    public double getPrecio() {
        return precio;
    }

    public LocalDate getGarantiaLimite() {
        return garantiaLimite;
    }

    public List<problema> getProblema_admitidos() {
        return problema_admitidos;
    }

    ChronoLocalDate getgarantiaLimite() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    List<problema> getproblema() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
