/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06l;

/**
 *
 * @author utpl
 */
public class TarjetaCredito {
    private String nombre;
    private String numero;
    private Banco banco;

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerNumero() {
        return numero;
    }

    public void establecerNumero(String n) {
        numero = n;
    }

    public Banco obtenerBanco() {
        return banco;
    }

    public void establecerBanco(Banco b) {
        banco = b;
    }
    
    
    
    
}
