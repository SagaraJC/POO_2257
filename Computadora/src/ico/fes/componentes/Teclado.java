/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author ryzen 5
 */
public class Teclado {
    private String marca;
    private String modelo;
    private int numTeclas;
    private int multimedia;

    public Teclado() {
    }

    public Teclado(String marca, String modelo, int numTeclas, int multimedia) {
        this.marca = marca;
        this.modelo = modelo;
        this.numTeclas = numTeclas;
        this.multimedia = multimedia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumTeclas() {
        return numTeclas;
    }

    public void setNumTeclas(int numTeclas) {
        this.numTeclas = numTeclas;
    }

    public int getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(int multimedia) {
        this.multimedia = multimedia;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", modelo=" + modelo + ", numTeclas=" + numTeclas + ", multimedia=" + multimedia + '}';
    }
    
    
}
