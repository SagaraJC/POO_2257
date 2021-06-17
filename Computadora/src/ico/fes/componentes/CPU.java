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
public class CPU {
    private String marca;
    private String modelo;
    private int velocidadProcesdor;

    public CPU() {
    }

    public CPU(String marca, String modelo, int velocidadProcesdor) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadProcesdor = velocidadProcesdor;
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

    public int getVelocidadProcesdor() {
        return velocidadProcesdor;
    }

    public void setVelocidadProcesdor(int velocidadProcesdor) {
        this.velocidadProcesdor = velocidadProcesdor;
    }

    @Override
    public String toString() {
        return "CPU{" + "marca=" + marca + ", modelo=" + modelo + ", velocidadProcesdor=" + velocidadProcesdor + '}';
    }
    
    
}
