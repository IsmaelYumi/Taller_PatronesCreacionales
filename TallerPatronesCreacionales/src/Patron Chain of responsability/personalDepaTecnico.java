/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronchain;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;


/**
 *
 * @author Michelle
 */
public class personalDepaTecnico extends Empleado {
    private boolean flag = true;
    List<problema> problemaproducto= new ArrayList<>();
    
    public personalDepaTecnico(){
        problemaproducto.add(problema.Articulodescompuesto);
        
    }
    public boolean admitirCambio(producto p){
        List<problema> problema=p.getproblema();
        for(problema pro:problema){
            flag=flag && problemaproducto.contains(pro);
        }
        if(flag){
            System.out.println("problema cubierto con la garantia");
            return next.admitirCambio(p);
            
        }
        flag = true;
        System.out.println("problema no cubierto con la garantia");
        return false;
    }

    

  
}
