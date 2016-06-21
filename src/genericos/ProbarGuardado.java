/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

/**
 *
 * @author T-107
 */
public class ProbarGuardado {
    public static void main(String[] args) {
        Usuarios u=new Usuarios("juan" , 18 , "ana@gmail.com");
        PersistenciaUsusario p=new  PersistenciaUsusario();
        try{
            p.guardar(u);
            System.out.println("Usuario guardado");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
