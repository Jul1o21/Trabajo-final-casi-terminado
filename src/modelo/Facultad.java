/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Favio
 */
public class Facultad {
    private String nombrefacultad;

    public Facultad(String nombrefacultad) {
        this.nombrefacultad = nombrefacultad;
    }

    public String getNombrefacultad() {
        return nombrefacultad;
    }

    public void setNombrefacultad(String nombrefacultad) {
        this.nombrefacultad = nombrefacultad;
    }

    @Override
    public String toString() {
        return "Facultad{" + "nombrefacultad=" + nombrefacultad + '}';
    }
}
