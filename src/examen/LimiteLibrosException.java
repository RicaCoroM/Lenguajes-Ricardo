/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author T-107
 */
public class LimiteLibrosException extends Exception{
    public LimiteLibrosException(){
        super("Se sobreásp el limite de libros permitidos");
    }
    
}
