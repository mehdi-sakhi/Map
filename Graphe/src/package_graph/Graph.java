/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_graph;

import package_graph.arc.Arc;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 *
 * @author Marc Knoblauch
 */
public class Graph {
    
    //attributs
    private double informations_courantes[][];
    private Arc arcs_courant[];
    
    //Graph from file
    Graph(String adaptedFile) throws IOException{
        //init
        this.informations_courantes = new double[1][1];
        this.arcs_courant = new Arc[1];
        
        lireFichier(adaptedFile);
    }
    
    //Graph from keyboard
    Graph(){
        //init
        this.informations_courantes = new double[1][1];
        this.arcs_courant = new Arc[1];
    }

    //Getters
    public double[][] getInformations_courantes() {
        return informations_courantes;
    }

    public Arc[] getArcs_courant() {
        return arcs_courant;
    }
    
    //Setters
    public void setInformations_courantes(double[][] informations) {
        this.informations_courantes = informations;
    }

    public void setArcs_courant(Arc[] arcs) {
        this.arcs_courant = arcs;
    }
    
    //Méthodes object à redéfinir correctement
    @Override
    public String toString() {
        return "Graph{" + "informations_courantes=" + informations_courantes + ", arcs_courant=" + arcs_courant + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Arrays.deepHashCode(this.informations_courantes);
        hash = 79 * hash + Arrays.deepHashCode(this.arcs_courant);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Graph other = (Graph) obj;
        if (!Arrays.deepEquals(this.informations_courantes, other.informations_courantes)) {
            return false;
        }
        if (!Arrays.deepEquals(this.arcs_courant, other.arcs_courant)) {
            return false;
        }
        return true;
    }
    
    //lecture : fichier 
    private void lireFichier(String adaptedFile) throws FileNotFoundException, IOException{
        //Déclaration du buffer
        BufferedReader file_buffer = null;
        file_buffer = new BufferedReader(new FileReader(adaptedFile));
        String line;
        while((line = file_buffer.readLine()) != null){
            System.out.println(line);
        }
        file_buffer.close();    
    }
    
    //lecture : console
    private void lireConsole(){
        //
    }
    
    
    //écriture : fichier
    private void ecrireFichier(String outFile) throws IOException{
        PrintWriter out = new PrintWriter(new FileWriter(outFile));
        String outString = null;
        //do something with outString
        //do something with outString
        //do something with outString
        out.println(outString);
        out.close();
    }
    
    //algorithmes sur graphes
    private void calcul_des_distance(){}
    private void rang(){}
    private void ordonnacement(){}
    private void parcours_arborescence(){}
    private void prufer(){}
    
    //chemins les plus courts selon :
    private void djikstra(){} //avec controle condition d'application de l'algo
    private void belleman(){} //avec controle condition d'application de l'algo
    private void dantzig(){} //avec controle condition d'application de l'algo
    
    //arbre minimal d'un graph non orienté
    private void kruskal(){}
    private void prim(){}
    
    
    public static void main(String[] args) throws IOException {
        String adaptedFile = "E://graph_project/seb.txt";
        Graph g = new Graph(adaptedFile);
    }
}
