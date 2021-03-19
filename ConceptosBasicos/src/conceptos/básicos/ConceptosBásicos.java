/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptos.básicos;

import ico.fes.Automovil;
import java.awt.Color;

/**
 *
 * @author ryzen 5
 */
public class ConceptosBásicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil miBocho= new Automovil();
        //miBocho.marca="VolkWagen";
        miBocho.setMarca("VW");
        miBocho.setSubmarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.blue);
        System.out.println( miBocho );
        
        //Programar los objetos miAcura y MiMustang
        Automovil miAcura= new Automovil();
        miAcura.setMarca("Acura");
        miAcura.setSubmarca("NSX");
        miAcura.setModelo(2013);
        miAcura.setColor(Color.gray);
        System.out.println( miAcura );
        
        Automovil miMustang= new Automovil();
        miMustang.setMarca("Ford");
        miMustang.setSubmarca("Mustang");
        miMustang.setModelo(2010);
        miMustang.setColor(Color.yellow);
        System.out.println( miMustang );
    }

    private static void setModelo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
