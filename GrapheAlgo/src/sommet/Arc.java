/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sommet;

/**
 *
 * @author Ablo
 */
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
        return "Arc{" + "d\u00e9part=" + départ + ", arriv\u00e9e=" + arrivée + '}';
    }
    
    
    
    
    
}
