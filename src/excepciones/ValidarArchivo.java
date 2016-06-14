package excepciones;

/**
 *
 * @author T-107
 */
public class ValidarArchivo {
    
    public static void validarExtencion(String extencion)throws ArchivoNoTxtException {
        if(!extencion.equals("txt"))throw new ArchivoNoTxtException();
            
    }
}
