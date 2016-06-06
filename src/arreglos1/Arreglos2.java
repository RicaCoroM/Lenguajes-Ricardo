/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos1;

/**
 *
 * @author T-107
 */
public class Arreglos2 {

        public static void main(String[] args) {
          /**
         * 1. Todos los arreglos son tratados como objetos
         */
        int arreglo1[]=new int [3];
        arreglo1[0]=34;
        arreglo1[1]=-23;
        arreglo1[2]=180;
        /**
         * int x; //es necesario dar un valor de inicio a la x
         * System.out.println(arreglo1[1]);
         */
        for(int i=0;i<arreglo1.length;i++){
            System.out.println(arreglo1[i]);
        }
            
    }
    
}
