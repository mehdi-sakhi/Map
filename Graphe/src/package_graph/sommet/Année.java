/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ablo
 */

package package_graph.sommet;

public class Année extends Sommet{
    int année;
    /**
     * Constructeur par défaut
     * @param année
     */
    public Année(int année) {
        super();
        this.année = année;
    }

    /**
     * Méthode qui afffiche
     * @return 
     */
    @Override
    public String toString() {
       return "s:[" + this.année + "]"; 
    }
    
    
}
