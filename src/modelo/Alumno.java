package modelo;

/**
 *
 * @author Favio
 */
public class Alumno extends Usuario {

    private int DNI;
    private String correo;
    private Facultad facultad;
    private boolean haveticket;

    public Alumno(int DNI, String correo, String contrasena, String nombres, String apellidos, String codigo, Facultad facultad) {

        super(contrasena, nombres, apellidos, codigo);
        this.DNI = DNI;
        this.correo = correo;
        this.facultad = facultad;
        this.haveticket = false;

    }

    public Alumno(String contrasena, String codigo) {
        super(contrasena, codigo);
    }

    public void solicitarContraseña() {
        System.out.println("--------------------------------------------");
        System.out.println("Su contraseña es : " + getContraseña());
        System.out.println("--------------------------------------------");
    }

    public void cambiarContraseña(String nuevaContraseña) {
        this.contrasena = nuevaContraseña;
    }

    public int getDNI() {
        return DNI;
    }

    public String getCorreo() {
        return correo;
    }

    public void setHaveticket(boolean haveticket) {
        this.haveticket = haveticket;
    }

    public boolean isHaveticket() {
        return haveticket;
    }

    @Override
    public String toString() {
        return "Alumno{" + "\n" + "DNI=" + DNI + "\n"
                + "correo=" + correo + "\n"
                + //        "contraseña="+ this.getContraseña()+ "\n"+ 
                "codigo=" + this.getCodigo() + "\n"
                + "apellidos=" + this.getApellidos() + "\n"
                + "nombres=" + this.getNobmres() + "\n"
                + "-------------------------------------------------" + "\n"
                + '}';
    }

}
