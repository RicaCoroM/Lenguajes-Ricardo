/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class ProbarUsuarios {
    public static void main(String[] args) {
        //vamos a leer el arraylist a ver que hay
        //paso 1 creamos un objeto de la clase PersistenciaUsuario
        PersistenciaUsusario p=new PersistenciaUsusario();
        try{
            ArrayList<Usuarios> usuarios= p.buscarTodos();
           int tam= usuarios.size();
            System.out.println("usuarios guardados: "+tam);
            System.out.println(usuarios.get(0).getNombre());
                
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
    }
}