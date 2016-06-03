/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposDatos;
/**
 *
 * @author T-107
 */
public class Tipos1 {
    public static void main(String[] args) {
        //declaramos un byte
        byte b=2; //byte [-128 -> 127]
        short s=2;
        int i=2;
        long l=2;
       /** b=(byte)s; //se recorta al tamaño necesario
        s=b; //casting direcot
        l=i;
        i=s;
        l=b;
        s=(short)l; //casting forzado (se usa mucho en android)
        i=b;
        */
       Operaciones o=new Operaciones();
        System.out.println(o.suma(4.0f, 5.0F)); 
//se agrega la Fóf  porque el valor por defecto es double y con la F se indica que es un flotante
//serializacion -> arreglos de bytes o datos                
    }
    
}
