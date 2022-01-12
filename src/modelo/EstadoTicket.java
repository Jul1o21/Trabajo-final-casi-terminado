package modelo;

/**
 *
 * @author Favio
 */
public class EstadoTicket {

    private String estadoactual;

    public EstadoTicket(String estadoactual) {
        this.estadoactual = estadoactual;
    }

    public String getEstadoactual() {
        return estadoactual;
    }

    public void setEstadoactual(String estadoactual) {
        this.estadoactual = estadoactual;
    }

    @Override
    public String toString() {
        return "EstadoTicket{" + "estadoactual=" + estadoactual + '}';
    }

}
