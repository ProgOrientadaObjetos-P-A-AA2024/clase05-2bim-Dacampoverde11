/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04o;

/**
 *
 * @author utpl
 */
public class TransporteAereo extends Transporte {
    
    private String aerolinea;
    
    public void establecerAerolinea(String s){
        aerolinea = s;
        
    }
    
    public String obtenerAerolinea(){
        return aerolinea;
    }
        

    @Override
    public void establecerTarifa() {
        tarifa = 1500;
    }

}
