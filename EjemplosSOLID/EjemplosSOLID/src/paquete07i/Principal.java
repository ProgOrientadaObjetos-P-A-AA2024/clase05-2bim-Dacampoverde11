/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07i;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        try {
            EvaluacionEnsayo ensayo = new EvaluacionEnsayo();
            ensayo.establecerNumeroProblemas(10);
            ensayo.establecerTotalProblemas(20);
            ensayo.establecerPromedioEnsayo();
            ensayo.establecerPromedioObjetivas();
            
            System.out.printf("%d\n", ensayo.obtenerNumeroProblemas());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
