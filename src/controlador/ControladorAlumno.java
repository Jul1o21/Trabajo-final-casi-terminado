
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Alumno;
import vista.JFrameAlumno;
import vista.JFrameSolicitarContraseña;

/**
 *
 * @author Favio
 */
public class ControladorAlumno {
    
        private Alumno modelo;
        private JFrameAlumno vista;

    public ControladorAlumno(Alumno modelo, JFrameAlumno vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        
        this.vista.jButtonSolicitarContraseña.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               vista.dispose();
               JFrameSolicitarContraseña contraseña = new JFrameSolicitarContraseña();
               contraseña.setVisible(true);
            }
        });
        
        
    }
        
    public void iniciarAlumno(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }    
}
