/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;


import java.util.List;
import modelo1.Carro;

/**
 *
 * @author emili
 */
public interface CarroService {
    
    public void crearCarro(Carro carro);
    public List<Carro>listar();
    
    
}
