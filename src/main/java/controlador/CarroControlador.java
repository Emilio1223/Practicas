/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import java.util.List;
import modelo1.Carro;

import servicio.CarroServiceImpl;

/**
 *
 * @author emili
 */
public class CarroControlador {
    
    private CarroServiceImpl carroServiceImpl = new CarroServiceImpl();
    
    public void crear(String [] data){
        var propietario = data[0];
        var marca = data[1];
        var year = Integer.valueOf(data[2]);
        var mes = Integer.valueOf(data[3]);
        var dia = Integer.valueOf(data[4]);
        var yearCreacion = LocalDate.of(year,mes,dia);
        var matricula = Boolean.valueOf(data[5]);
        
        
        var carro = new Carro(propietario,marca,yearCreacion,matricula);
        this.carroServiceImpl.crearCarro(carro);
    }
    
    public List<Carro> lista(){
        
        return this.carroServiceImpl.listar();
    }
}
