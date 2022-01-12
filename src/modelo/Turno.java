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

    public Turno(int numeroturno, String intervalominutos) {
        this.numeroTurno = numeroturno;
        this.intervaloMinutos = intervalominutos;
    }

    public int getNumeroTurno() {
        return numeroTurno;
    }

    public String getIntervaloMinutos() {
        return intervaloMinutos;
    }

    @Override
    public String toString() {
        return "Turno{" + "numeroturno=" + numeroTurno + ", intervalominutos=" + intervaloMinutos + '}';
    }

}
