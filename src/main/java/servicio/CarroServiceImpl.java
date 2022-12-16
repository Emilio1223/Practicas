/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo1.Carro;

/**
 *
 * @author emili
 */
public class CarroServiceImpl implements CarroService{
    
    private List <Carro> carrolist = new ArrayList<>();

    @Override
    public void crearCarro(Carro carro) {
        this.carrolist.add(carro);
   }

    @Override
    public List<Carro> listar() {
        return this.carrolist;
    
    }        
}
