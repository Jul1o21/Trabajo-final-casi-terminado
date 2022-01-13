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
public class Turno {

    private int numeroTurno;
    private String intervaloMinutos;
    private Nivel nivel;

    public Turno(int numeroTurno, String intervaloMinutos) {
        this.numeroTurno = numeroTurno;
        this.intervaloMinutos = intervaloMinutos;
    }

    public Turno(int numeroturno, String intervalominutos, Nivel nivel) {
        this.numeroTurno = numeroturno;
        this.intervaloMinutos = intervalominutos;
        this.nivel = nivel;
    }
    
    
    
    public int getNumeroTurno() {
        return numeroTurno;
    }

    public String getIntervaloMinutos() {
        return intervaloMinutos;
    }

    @Override
    public String toString() {
        return "\n►Turno" + "#" + numeroTurno + "  " + intervaloMinutos + " "+ nivel;
    }
    
  
}
