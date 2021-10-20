/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listalinkadt;

import ico.fes.modelo.DoubleListaLinkADT;
import ico.fes.modelo.Empleado;
import io.unam.fes.ListaADT;

/**
 *
 * @author joser
 */
public class ListaLinkADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaADT lsl = new ListaADT();
        
        lsl.append("Jose");
        lsl.append("Diana");
        lsl.append("Santiago");
        lsl.append("Daniela");
        lsl.append("Juan");
        lsl.transversal();
        
        ListaADT lsl2 = new ListaADT();
        
        lsl2.append(new Empleado(1, "Jose", "Perez", "Garcia", 1850.5f, 2015, 4));
        lsl2.append(new Empleado(2, "Diana", "Vallego", "Ñanez", 1500.5f, 2017, 7));
        lsl2.append(new Empleado(3, "Santiago", "Ramirez", "Cruz", 1000.5f, 2020, 10));
        lsl2.append(new Empleado(4, "Daniela", "Ramirez", "Cruz", 1100.5f, 2019, 46));
        lsl2.transversal();
        
        
        
        DoubleListaLinkADT ldl = new DoubleListaLinkADT();
        ldl.append(new Integer(10));
        ldl.transversal();
        ldl.append(new Integer(20));
        ldl.transversal();
        ldl.append(new Integer(30));
        ldl.transversal();
        ldl.append(new Integer(40));
        
        DoubleListaLinkADT ldl2 = new DoubleListaLinkADT();
        ldl2.append(new Empleado(12, "José", "Ramirez", "gonzalez", 2300.0f, 4, 2015));
        ldl2.append(new Empleado(21, "Diana", "Vallego", "Ñanez", 1500.5f, 2017, 7));
        ldl2.append(new Empleado(43, "Daniela", "Ramirez", "Cruz", 1100.5f, 2019, 46));
        ldl2.append(new Empleado(38, "Santiago", "Ramirez", "Cruz", 1000.5f, 2020, 10));
        ldl2.transversal();
        
    }
    
    
    
    
    
}
