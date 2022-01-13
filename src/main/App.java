/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
//import controlador.ControladorLogueo;
//import modelo.Usuario;
//import vista.JFrameLogeo;

/**
 *
 * @author cubas
 */
public class App {
    public static void main(String[] args){
        vista.JFrameLogeo fIngreso = new vista.JFrameLogeo();
        controlador.ControladorLogueo controladorLog = new controlador.ControladorLogueo(datos.Datos.alumno, fIngreso);
        //controlador.ControladorLogueo controladorLog1 = new controlador.ControladorLogueo(datos.Datos.operario,fIngreso);
        controladorLog.iniciar();
        
    }
}
