/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Monit;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author ryzen 5
 */
public class Computadora {
    private int marca;
    private int modelo;

    public Computadora() {
    }

    public Computadora(int marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + "Acteck" + ", modelo=" + "GAMMAXXGT" + '}';
    }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora pc1 = new Computadora(1, 1);
        Monit mon1 = new Monit("Sony", "SonyTV", 80);
        Mouse mou1 = new Mouse("Logitech", "g502 hero", "Alámbrico");
        Teclado tecl1 = new Teclado("HyperX", "Alloy fps pro", 101, 1);
        CPU pro1 = new CPU("AMD", "Ryzen 7 3700X", 4);
        
        System.out.println(pc1);
        System.out.println(mon1);
        System.out.println(mou1);
        System.out.println(tecl1);
        System.out.println(pro1);
        
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
}
