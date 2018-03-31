/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacionsudoku;

/**
 *
 * @author tunmi
 */
public class Rsudoku {
        
    /**
        * Constructor de la clase sudoku
        * @param las variables del sudoku
    */
        public Rsudoku(){
            
        }
      
    /**
        * metodo iniciar sudoku
        * @param iniciar para el metodo de iniciar la partidad del sudoku
    */
        public void inicializar(){
            
        }
      
      
     /**
        * metodo toString del sudoku
        * @param toString para el metodo toString
    */
      @Override
      public String toString()
      {
      String resultadoFinal = "";
      return resultadoFinal;
      }
      
      /**
        * modificar numeros del juego
        * @param metodo para modificar el numero introducido en las filas o colunmas del juego
      */
      public void modificarElemento(int fila, int columna, int elemento) throws SudokuException
      {
      }
      
      
       /**
        * vaciar los numeros del juego
        * @param metodo para vaciar el numero introducido en las filas o colunmas del juego
      */
      public void vaciarElemento(int fila, int columna)
      {
      }
      
       /**
        * comprobar la fila de numeros del juego
        * @param metodo para comprobar  la fila de los numeros introducidos en las filas del juego
    */
      private boolean comprobarFila(int fila, int elemento)
      {
      boolean resultado = true;
      return resultado;
      }
      
       /**
        * comprobar la columna de los numeros del juego
        * @param metodo para comprobar los  numeros introducidos en las  colunmas del juego
    */
      private boolean comprobarColumna(int columna, int elemento)
      {
      boolean resultado = true;
      return resultado;
      }
      
      
       /**
        * comprobar el cuadro del juego para ver si los numeros son correctos o no
        * @param metodo para comprobar el numero introducido en el cuadrante del juego para comprobar si son correctos o no
    */
      private boolean comprobarCuadrante(int fila, int columna, int elemento)
      {
      boolean resultado = true;
      return resultado;
      }
      
       /**
        * introducir numeros del juego
        * @param metodo para insertar los nuermoros en el juego en las filas y las columnas
    */
      private boolean puedoInsertar(int fila, int columna, int elemento)
      {
      boolean resultado = false;
      return resultado;
      }  


      }


      
      