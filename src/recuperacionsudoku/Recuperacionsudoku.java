/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacionsudoku;

import java.util.Scanner;

/**
 *
 * @author tunmi
 */
public class Recuperacionsudoku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //teclado para la salidad por pantalla
        Scanner teclado = new Scanner (System.in);
        int opcion = 0;
        
        //este es un menu que tiene opcciones del juego
        System.out.println("-------Menu sudoku------------------");
        System.out.println("1---- iniciar o reiniciar sudoku");
        System.out.println("2---- realizar movimiento");
        System.out.println("3---- vaciar casilla");
        System.out.println("4---- mostrar sudoku");
        System.out.println("5---- terminar partida");
        System.out.println("-------------------------------------");
        
        
        System.out.println("Dime que opcion quieres elegir:");
        opcion = teclado.nextInt();
        
        //los if para ver que opcion se coge
        if(opcion == 1){
            System.out.println("has elegido la "+opcion);
        }
        if(opcion == 2){
            System.out.println("has elegido la "+opcion);
        }
        if(opcion == 3){
            System.out.println("has elegido la "+opcion);
        }
        if(opcion == 4){
            System.out.println("has elegido la "+opcion);
        }
        if(opcion == 5){
            System.out.println("has elegido la "+opcion);
        
    }
    
    }
    
}
