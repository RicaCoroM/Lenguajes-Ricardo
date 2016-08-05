
package SolucionRepaso;


public class ProbarTodo {

    public static void main(String[] args) {
        Departamento depa=new Departamento();
        try{
            depa.setId(31);
            depa.setNombre("Sistemas");
            System.out.println("Departamento creado");
            GeneradorDeEmpleados.generar();
            
        }catch(Exception e){
            System.err.println(e.getMessage());
                        
        }


    }
    
}
