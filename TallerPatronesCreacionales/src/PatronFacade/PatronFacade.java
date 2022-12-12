package com.patron.facade;

import com.productos.api.ProductosDisponibles;
import com.productos.api.ProductosFallosos;
import com.productos.api.ProductosEnReparacion;

import java.util.ArrayList;

/**
 *
 * @author misae
 */
public class PatronFacade {
       
    private ProductosDisponibles productosDisponibles;
    private ProductosFallosos productosFallosos;
    private ProductosEnReparacion productosEnReparacion;
    
    public PatronFacade(){
        productosDisponibles = new ProductosDisponibles();
        productosFallosos = new ProductosFallosos();
        productosEnReparacion = new ProductosEnReparacion();
    }
  
    public void buscarPD(ArrayList productosD){
        productosDisponibles.productoDisponibles(productosD);
    }
    
    public void buscarPF(String productosF){
        productosFallosos.productoFallosos(productosF);
    }
   
    public void buscarPR(String productosR){
        productosEnReparacion.productosEnReparacion(productosR);
    }
    
}

