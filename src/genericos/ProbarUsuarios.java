/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class ProbarUsuarios {
    public static void main(String[] args) {
        //paso 1 crear el usuario
        Usuarios u=new Usuarios("Juan", 20, "juan@gmail.com");
        //paso 2 guardar usuario
        PersistenciaUsusario p=new PersistenciaUsusario();
        try {
            p.guardar(u);
            System.out.println("Usuario guardado1");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }    
}
