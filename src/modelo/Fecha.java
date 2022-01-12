/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Favio
 */
public class Fecha {
     private Date fecha;
    private boolean estadoopen;       //Sirve para poder crear los tickets

    public Fecha(Date fecha, boolean estadoopen) {
        this.fecha = fecha;
        this.estadoopen = estadoopen;
    }

    public CabeceraTicket creartickets(Nivel nivel, Turno turno, Alimento alimento, Fecha fecha) {

        //cantidad de raciones por turno 
        CabeceraTicket ticketsgenerados;

        ticketsgenerados = new CabeceraTicket(Sistema.racionestotalesporturno, nivel, turno, alimento, fecha);

        return ticketsgenerados;

    }

    public void setEstadoopen(boolean estadoopen) {
        this.estadoopen = estadoopen;
    }
    //   public CabeceraTicket generarTickets(){
    //   CabeceraTicket arreglotickets;
    //   arreglotickets = new CabeceraTicket
    //   return arreglotickets;
    //  }

    @Override
    public String toString() {
        return "Fecha{" + "fecha=" + fecha + ", estadoopen=" + estadoopen + '}';
    }
}
