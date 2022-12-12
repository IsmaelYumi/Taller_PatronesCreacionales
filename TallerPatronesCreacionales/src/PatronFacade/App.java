package com.mycompany.app;

import com.patron.facade.PatronFacade;
import java.util.ArrayList;


public class App {

    public static void main(String[] args) {
        ArrayList<String> productosDisponibles = new ArrayList<String>();
        productosDisponibles.add("iphoneX");
        productosDisponibles.add("televisor");
        PatronFacade cliente1 = new PatronFacade();
        PatronFacade cliente2 = new PatronFacade();
        PatronFacade cliente3 = new PatronFacade();
        cliente1.buscarPD(productosDisponibles);
        cliente2.buscarPF("PS4");
        cliente3.buscarPR("Laptop");
        
    }
}
