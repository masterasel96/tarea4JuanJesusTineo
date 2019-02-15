/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.juanjesus;

/**
 *
 * @author juanjesus
 */
public class Coche {

    private String marca;
    private String matricula;
    private int potenciaMotor;

    public Coche(String marca, String matricula, int potenciaMotor) {
        this.marca = marca;
        this.matricula = matricula;
        this.potenciaMotor = potenciaMotor;
    }

    public Coche() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", matricula=" + matricula + ", potenciaMotor=" + potenciaMotor + '}';
    }
    
    
    
}
