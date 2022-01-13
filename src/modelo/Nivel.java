
package modelo;

/**
 *
 * @author Favio
 */
public class Nivel {
      private int numeronivel;

    public Nivel(int tiponivel) {
        this.numeronivel = tiponivel;
    }

    @Override
    public String toString() {
        return "Nivel:" + " " + numeronivel + '}';
    }
}
