/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cod_libreria;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class COD_Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero;
       String mEntrada="Introduzca un numero";
       String mSalida="Su numero es:";
       
       numero= IO.introducir(IO.CONSOLA,mEntrada);
       
       IO.mostrar(IO.CONSOLA,mSalida, numero);
       
        
        
    }

}
