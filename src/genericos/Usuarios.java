/*PROBLEMA: generar un sistema que te permita persistir entidades de tipo 
 usuario usando solamente JAVA.
NOTA: NO USAR ARCHIVOS DE TEXTO NI WORD, NI NADA DE ESAS COSAS RARAS, DEBES USAR
TU PROPIA TECNOLOGIA
 */
package genericos;

import java.io.Serializable;

/*1.Encapsulamiento:Atributos privados y metodos get y set por cada atributo

*/
public class Usuarios implements Serializable{
    private String nombre;
    private Integer edad;
    private String email;

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", edad=" + edad + ", email=" + email + '}';
    }

    public Usuarios() {
    }

    public Usuarios(String nombre, Integer edad, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
