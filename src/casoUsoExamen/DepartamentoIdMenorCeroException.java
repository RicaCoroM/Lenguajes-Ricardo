/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casoUsoExamen;

/**
 *
 * @author T-107
 */
public class DepartamentoIdMenorCeroException extends Exception{
    public DepartamentoIdMenorCeroException(){
        super("el id no debe ser menor de cero");
    }
    
}
