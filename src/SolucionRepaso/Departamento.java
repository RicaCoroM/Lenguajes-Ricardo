
package SolucionRepaso;


public class Departamento {
    private Integer id;
    private String nombre;
    
    public Departamento(){
    
}
    public Departamento(Integer id, String nombre)throws ValorMenoQueCeroException{
        if(id<0)throw  new ValorMenoQueCeroException();
        this.id=id;
        this.nombre=nombre;
        
    }
    
    public void setId(Integer id)throws ValorMenoQueCeroException{
        if(id<0)throw  new ValorMenoQueCeroException();
        this.id=id;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public Integer getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
}
