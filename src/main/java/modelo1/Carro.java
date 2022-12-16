/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo1;

import java.time.LocalDate;

/**
 *
 * @author emili
 */
public class Carro {
    private String propietario;
    private String marca;
    private LocalDate yearCreacion;
    private boolean matricula;

    public Carro(String propietario, String marca, LocalDate yearCreacion, boolean matricula) {
        this.propietario = propietario;
        this.marca = marca;
        this.yearCreacion = yearCreacion;
        this.matricula = matricula;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDate getYearCreacion() {
        return yearCreacion;
    }

    public void setYearCreacion(LocalDate yearCreacion) {
        this.yearCreacion = yearCreacion;
    }

    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Carro{" + "propietario=" + propietario + ", marca=" + marca 
            + ", yearCreacion=" + yearCreacion.toString() + ", matricula=" 
                + matricula + '}';
    }
    
    

}