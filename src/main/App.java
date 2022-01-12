package main;

import controlador.ControladorLogueo;
import modelo.Usuario;
import vista.JFrameLogeo;

/**
 *
 * @author Favio
 */
public class App {
    public static void main(String[] args) {
        vista.JFrameLogeo fIngreso = new vista.JFrameLogeo();
        controlador.ControladorLogueo controladorLog = new controlador.ControladorLogueo(datos.Datos.alumno, fIngreso);
        //controlador.ControladorLogueo controladorLog1 = new controlador.ControladorLogueo(datos.Datos.operario,fIngreso);
        controladorLog.iniciar();
    }
}
