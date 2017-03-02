/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphealgo;

import sommet.Année;
import sommet.Arc;
import sommet.Sommet;

/**
 *
 * @author Ablo
 */
public class GrapheAlgo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Année an0 = new Année (2011);
        Année an1 = new Année (2012);
        Année an2 = new Année (2013);
        
        Sommet s1 = new Sommet (1,an0);
        Sommet s2 = new Sommet (2,an1);
        Sommet s3 = new Sommet (3,an2);
        
        Arc arc1 = new Arc (s1,s2);
        Arc arc2 = new Arc (s2,s1);
        Arc arc3 = new Arc (s1,s3);
        
        System.out.println("Lancement de l'application");
        System.out.println("Affichage Année");
            System.out.println(an0);
            System.out.println(an1);
            System.out.println(an2);
        System.out.println("Affichage Sommet");
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
        System.out.println("Affichage Arc");
            System.out.println(arc1);
            System.out.println(arc2);
            System.out.println(arc3);
    }
    
}
