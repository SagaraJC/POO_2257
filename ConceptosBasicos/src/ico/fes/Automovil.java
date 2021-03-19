/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes;

import java.awt.Color;

/**
 *
 * @author ryzen 5
 */
public class Automovil {
    private String marca;
    private String submarca;
    private int modelo;//año del auto
    private Color color;

    public Automovil() {
    }

    public Automovil(String marca, String submarca, int modelo, Color color) {
        this.marca = marca;
        this.submarca = submarca;
        this.modelo = modelo;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        System.out.println("Metiendo el auto al taller de pintura... ");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubmarca() {
        return submarca;
    }

    public void setSubmarca(String submarca) {
        this.submarca = submarca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Automovil{" + "marca=" + marca + ", submarca=" + submarca + ", modelo=" + modelo + ", color=" + color + '}';
    }
    
    
}
