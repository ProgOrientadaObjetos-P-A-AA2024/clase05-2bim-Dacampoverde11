/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04o;

/**
 *
 * @author utpl
 */
public class TransporteMaritimo extends Transporte {
    private String cooperativaMar;
    
    public void establecerCooperativaMar(String s){
        cooperativaMar = s;
    }
    
    public String obtenerCooperativaMar(){
        return cooperativaMar;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 60;
    }
    
}
