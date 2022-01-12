package controlador;

import datos.Datos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Usuario;
import vista.JFrameAlumno;
import vista.JFrameLogeo;
import vista.JFrameOperario;

/**
 *
 * @author Favio
 */
public class ControladorLogueo {
    Usuario    usuario;
    JFrameLogeo fIngreso;
    
    public ControladorLogueo(Usuario usuario ,JFrameLogeo fIngreso) {
        this.usuario = usuario;
        this.fIngreso = fIngreso;
        
       this.fIngreso.btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 System.exit(0);
            }
       });
        
      this.fIngreso.btnIniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo,pwd;
                codigo = fIngreso.TxtFieldCodigo.getText();
                pwd = fIngreso.jPasswordFieldContraseña.getText();
                if(codigo.equals(Datos.alumno.getCodigo()) && pwd.equals(Datos.alumno.getContraseña())){
                  fIngreso.dispose();
                  JFrameAlumno vista1 = new JFrameAlumno();
                  vista1.setVisible(true);
                  
                }else if(codigo.equals(Datos.operario.getCodigo()) && pwd.equals(Datos.operario.getContraseña()) ) {
                     fIngreso.dispose();
                     JFrameOperario vista1 = new JFrameOperario();
                     vista1.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(fIngreso, "No se encuentra registrado en el sistema");
                }
          
            }
      }); 
    }
     public void iniciar(){
        this.fIngreso.setLocationRelativeTo(null);
        this.fIngreso.setVisible(true);  
    }
}
