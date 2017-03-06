
/**
 *
 * @author Ablo
 */

package package_graph.arc;
import package_graph.sommet.Sommet;

public class Arc {
    
    private final Sommet départ;
    private final Sommet arrivée;
    
    /**
     * Constructeur avec sommet de départ et sommet arrivée
     * @param départ
     * @param arrivée 
     */
    public Arc(Sommet départ, Sommet arrivée) {
        this.départ = départ;
        this.arrivée = arrivée;
    }

    @Override
    public String toString() {
        return "a{" + "d\u00e9part=" + départ + ", arriv\u00e9e=" + arrivée + '}';
    }
}

