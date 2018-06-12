/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

import java.util.Scanner;

/**
 *
 * @author pachoca
 */
public class Almacen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Hola como te llamas ");
        String nombre;
        Scanner teclado = new Scanner(System.in);
        nombre = teclado.nextLine();
        System.out.print(nombre+ " BIENVENIDO ALMACENES JAVA´S WEAR INTS \n");
        System.out.println("_____________________________________\n");
        System.out.println(nombre+" te ofrecemos gran variedad de: \n[CHAQUETAS] $ 300000\n" +
"[CAMISAS] $ 75000\n" +
"[PANTALONES] $ 150000\n" +
"[GAFAS] $ 100000\n" +
"[SOMBREROS] $ 80000\n" +
"[ZAPATOS] $ 300000\n" +
"[CORREAS] $ 20000\n" +
"[JEANS] $ 200000\n");

        
        
        
    }
    
}
