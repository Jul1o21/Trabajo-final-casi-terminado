
package modelo;

import java.util.Date;

/**
 *
 * @author Favio
 */
public class Operario extends Usuario{
    private Date entrada;

    public Operario(Date entrada, String contrasena, String nombres, String apellidos, String codigo) {
        super(contrasena, nombres, apellidos, codigo);
        this.entrada = entrada;
    }

    public Operario(String contrasena, String codigo) { //Esto se usara para verificar si el operario esta registrado
        super(contrasena, codigo);
    }

    public Date getEntrada() {
        return entrada;
    }

    public void cambiarRacionesPorTurno(int nuevacantidad) {
        Sistema.racionestotalesporturno = nuevacantidad;

    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Fecha crearFechaParaTickets() { //Parte donde el operario crea la clase fecha

        Date fechadate;
        fechadate = new Date();
        boolean estado = false;
        if (fechadate.getHours() >= Sistema.intervaloinferior && fechadate.getHours() <= Sistema.intervalosuperior) {
            estado = true;
            System.out.println("Se le asigna true al estado de la fecha");
        }

        Fecha fechacreada; //Clase 
        fechacreada = new Fecha(fechadate, estado);
        System.out.println("Se creo la clase Fecha ");

        System.out.println(fechacreada);

        return fechacreada;

    }

    public void registrarAlumno(Alumno alumno, ArregloAlumnos alumnos) {

        alumnos.agregarAlumno(alumno);

    }

    public void validarticketop(String codigo, ArregloCabeceras Ticketsgenerados) {
        
        Ticketsgenerados.validaralumnocabeceras(codigo);
    }

    @Override
    public String toString() {
        return "Operario{" + "\n"
                + "entrada=" + entrada + "\n"
                + "contraseña=" + this.getContraseña() + "\n"
                + "codigo=" + this.getCodigo() + "\n"
                + "apellidos=" + this.getApellidos() + "\n"
                + "nombres=" + this.getNobmres() + '}';
    }
}
