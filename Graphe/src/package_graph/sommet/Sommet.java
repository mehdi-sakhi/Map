package package_graph.sommet;

/**
 *
 * @author Ablo
 */
public class Sommet {
    private int id;
    private static int compteurInstance=0;
    
    /**
     * Constructeur par défaut
     */
    public Sommet(){
        compteurInstance++;
        this.id = compteurInstance;
        //on décidera ce qu'on mettra
    }
    
    /**
     * Méthode toString
     * @return 
     */
    @Override
    public String toString() {
        return "s:[" + id + "]";
    }
    
    
}
