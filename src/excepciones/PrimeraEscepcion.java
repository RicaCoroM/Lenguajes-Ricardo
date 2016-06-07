/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *¿Que es una excepcion en Java?
 *R -Es un error en tiempo de ejecucion
 * Las excepciones en Java son de dos tipos:
 * 1.Checked exception TU tienes que hacerte cargo de ellas con el codigo
 * 2.Unchecked  exception NO tiene que hacerte cargo de ellas,
 *          el compilador te ayuda
 */
public class PrimeraEscepcion {
    public static void main(String[] args) {
        //veremos primero las mas comunes de las unchecked
        
        float x=4;
        int y=0;
        System.out.println(x/y);
        
        //ArithmeticException solo se da entre enteros
        
        String falsoNumero="5";
        int numeroReal=5;
        System.out.println("Este es antes de la excepcion");
        int suma=Integer.parseInt(falsoNumero)+numeroReal;
        System.out.println("Todo esta bien hasta aqui");
        if(true){
            System.out.println("Siempre aparecere");
        }
        System.out.println("La ejecucion siempre pasa aqui, se ejecute o no el if");
        
        //NumberFormatException es el error de letras a numeros
        
    }
    
}
