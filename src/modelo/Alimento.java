package modelo;

/**
 *
 * @author Favio
 */
public class Alimento {

    private String tipoAlimento;

    public Alimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    @Override
    public String toString() {
        return "Alimento{" + "tipoalimento=" + tipoAlimento + '}';
    }
}
