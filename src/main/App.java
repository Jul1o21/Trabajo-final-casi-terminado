/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
//import controlador.ControladorLogueo;
//import modelo.Usuario;

import modelo.Alumno;
import vista.JFrameAlumno;

//import vista.JFrameLogeo;

/**
 *
 * @author cubas
 */
public class App {
    public static void main(String[] args){
        
        /*Alumno modelo = new Alumno(datos.Datos.alumno.getContraseña(),datos.Datos.alumno.getCodigo());
        JFrameAlumno vista = new JFrameAlumno();*/
        vista.JFrameLogeo fIngreso = new vista.JFrameLogeo();
        controlador.ControladorLogueo controladorLog = new controlador.ControladorLogueo(datos.Datos.alumno, fIngreso);
        //controlador.ControladorLogueo controladorLog1 = new controlador.ControladorLogueo(datos.Datos.operario,fIngreso);
        //controlador.ControladorAlumno controladorAl = new controlador.ControladorAlumno(modelo, vista);
        controladorLog.iniciar();
        //controladorAl.iniciarAlumno();
        
    }
}
