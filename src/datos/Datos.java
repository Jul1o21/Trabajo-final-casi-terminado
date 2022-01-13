package datos;

import modelo.Alumno;
import modelo.Operario;
import modelo.TipoFacultadArreglo;
import modelo.Usuario;

/**
 *
 * @author Favio
 */
public class Datos {
   public static Usuario  operario  = new Operario("contraop", "codigoop");
   
   public static Usuario  alumno = new Alumno("contra1", "codigo1");
   public static TipoFacultadArreglo arreglotipofacultad  = new TipoFacultadArreglo();
}
