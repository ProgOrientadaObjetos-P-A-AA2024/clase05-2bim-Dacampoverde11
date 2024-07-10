/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06l;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        MayorEdad representante = new MayorEdad("José", "Visa");
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        
        Banco banco = new Banco();
        
        banco.estabecerNombre("Cacpe Zamora");
        
        TarjetaCredito tarjeta = new TarjetaCredito();
        tarjeta.establecerNombre("1010101010101010");
        tarjeta.establecerNombre("Daniel Campoverde");
        tarjeta.establecerBanco(banco);
        
        
        
        
        System.out.printf("Nombre:%s - Tarjeta:%s\n",
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjeta());
        
    }
}
