
package SolucionRepaso;

public class GeneradorDeEmpleados {
    
    public static void generar()throws Exception{
        Thread t1=new Thread(new Runnable(){
            public  void run(){
                for(int i=0;i<5;i++){
                    try{
                        Departamento depa=new Departamento(i, "Sistemas");
                        Empleado emp=new Empleado(i, "Empleado "+i,depa);
                        System.out.println("Empleado:"+emp.getNombre()+" departamento:"+emp.getDepa().getNombre());
                    }catch(Exception e){
                        
                    }
                    
                }
            }
            
        });
        t1.start();
    }
    
}
