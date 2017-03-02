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
public class Sommet {
    private int id;
   // private Object monObject;
    private Année monAnnée;
    private static int compteurInstance=0;
    
    /**
     * Constructeur par défaut
     */
    public Sommet(){
        //on décidera ce qu'on mettra
    }
    /**
     * Constructeur avec parametres
     * @param id
     * @param an 
     */
    public Sommet(int id, Année an){
        compteurInstance++; //on augmente le compteur d'instance de la classe 
        this.monAnnée = an;
        this.id = id;
        
    }
    /**
     * Méthode toString
     * @return 
     */
    @Override
    public String toString() {
        return "Sommet" + monAnnée ;
    }
    
    
}
