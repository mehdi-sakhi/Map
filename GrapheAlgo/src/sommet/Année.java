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
public class Année {
    private int id;
    String information;
    /**
     * Constructeur par défaut
     */
    public Année() {
        id=0;
        information="";
    }
    /**
     * Constructeur avec id et voir meme d'autres parametres
     * @param id
     * @param information 
     */
    public Année(int id, String information) {
        this.id = id;
        this.information = information;
    }
    /**
     * Constructeur avec id seulement
     * @param id 
     */
    public Année(int id) {
        this.id = id;
        this.information="";
    }
    /**
     * Méthode qui afffiche
     * @return 
     */
    @Override
    public String toString() {
        return "{" + id +" "+ information + '}';
    }
    
    
}
