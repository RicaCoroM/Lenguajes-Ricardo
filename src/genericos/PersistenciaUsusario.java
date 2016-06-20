/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

import java.util.ArrayList;
import java.io.*;

public class PersistenciaUsusario {
    /*
    Esta es una clase model de tipo Logico, solamente contiene metodos que
    que representan acciones concretas, la sintaxis y estructura de dicho 
    metodo depende de la accion.
    */
    ArrayList<Usuarios>usuarios;

    public PersistenciaUsusario() {
        usuarios=new ArrayList<>();
    }
    //Primero generamos el metodo que nos guarda un usuario
    public void guardar(Usuarios u)throws Exception{
        //Paso 1 Generar el archivo a guardarse
        File f=new File("archivaldo.raton");
        //Indicar que se va a guardar
        FileOutputStream fos=new FileOutputStream(f);        
        
        //Generar el objeto que nos va a ayudar a guardar el arrayList de usuarios
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        //Ahora si a guardar el objeto
        
                    usuarios.add(u);
                    oos.writeObject(usuarios);      
    }
    
    //empieza el metodo de leer a los usuarios
    public ArrayList<Usuarios> buscarTodos()throws Exception{
        File f=new File("archivaldo.raton");
        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
        usuarios= (ArrayList<Usuarios>) ois.readObject();
        return usuarios;
    }
}
