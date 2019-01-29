/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod_libreria;

import java.util.Scanner;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author lvazquezdorna
 */
public class IO {

    /**
     * Constante que devuelve un 0.
     */
    public static final int CONSOLA = 0;

    /**
     * Constante que devuelve un 1.
     */
    public static final int VENTANA = 1;

    /**
     *
     * @param tipo sirve para introducir una de las constantes CONSOLA O VENTANA
     * y elegir que muestre por pantalla o consola
     * @param mensaje sirve para introducir un mensaje que comunique al usuario
     * lo que guarda el metodo
     * @return devuelve una String que recoge lo que escriba por teclado el
     * usuario
     */
    public static String introducir(int tipo, String mensaje) {
        String x = null;
        switch (tipo) {
            case CONSOLA:
                Scanner teclado = new Scanner(System.in);
                System.out.println(mensaje);
                x = teclado.nextLine();
                return x;

            case VENTANA:
                return x = JOptionPane.showInputDialog(mensaje);

        }
        return x;
    }

    /**
     *
     * @param tipo sirve para introducir una de las constantes CONSOLA O VENTANA
     * y elegir que muestre por pantalla o consola
     * @param mensaje sirve para introducir un mensaje que comunique al usuario
     * lo que guarda el metodo
     * @param x devuelve una String con lo guardado
     */
    public static void mostrar(int tipo, String mensaje, String x) {

        switch (tipo) {
            case CONSOLA:
                System.out.println(mensaje);
                System.out.println(x);
                break;

            case VENTANA:
                JOptionPane.showMessageDialog (null, x, mensaje);
                break;
        }

    }

}
