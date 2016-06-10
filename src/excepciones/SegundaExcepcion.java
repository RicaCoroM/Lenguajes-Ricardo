/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *Aqui usaremos las excepciones de tipo checked de las que TU 
 * tienes que hacerte cargo de ellas, vamos a usar un paquete que no
 * se encuentra por defecto, tienes que agregarlo con un import * 
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SegundaExcepcion {
    
    public static void main(String[] args) {
        
        File f=new File("D:\\java.txt");
        //input = leer algo
        //ouput = escribir algo
        try {
            int x=2;
            int y=0;
            int div=x/y;
            
            FileInputStream fis=new FileInputStream(f);
            int ch=0;
            StringBuilder builder=new StringBuilder();
            
            while( (ch=fis.read() )!=-1) {
                builder.append((char)ch);
            }
            
            System.out.println("Se leyo bien y se encontro esto:"+builder.toString());
            
        } catch (FileNotFoundException ex) {
                  System.out.println("Checa el nombre de tu archivo");
        } catch (IOException ex) {
            
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally{
        /**EXCEPCIONES:
          * 
          * 1ra regla:
          * un bloque try catch tiene una llave de apertura y una llave 
          * de cierre. dentro de su cuerpo puede contener uno o mas 
          * renglones que las excepciones
          * 
          * 2da regla:
          * despues del try inmediatamente sigue el bloque catch, puede haber 
          * tantos catch como excepciones se lancen en el try.
          * 
          * 3ra regla:
          * Puede ponerse un solo catch con una referencia a exceptiony ella se
          * hace cargo de cualquier numero de excepciones que podrian tenerse
          * en el try.
          * 
          * 4ta regla:
          * Es conveniente cerrar el codigo de excepciones con un bloque catch
          * que tenga una referencia de exception, seguido de un finally.
          * 
          * INVESTIGAR  que significa el bloque "try catch" 
          * contrastarlo con el throws
          */   
        }
    }
    
}
