/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.ente;

/**
 *
 * @author ryzen 5
 */
public class Estudiante extends Persona{
    
    private String numCuenta;
    private String carrera;
    private int semestre;

    public Estudiante() {
    }

    public Estudiante(String numCuenta, String carrera, int semestre) {
        this.numCuenta = numCuenta;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public Estudiante(String numCuenta, String carrera, int semestre, String nombre, int edad, int genero, float altura) {
        super(nombre, edad, genero, altura);
        this.numCuenta = numCuenta;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return super.toString() + "Estudiante{" + "numCuenta=" + numCuenta + ", carrera=" + carrera + ", semestre=" + semestre + '}';
    }
    
    
}
