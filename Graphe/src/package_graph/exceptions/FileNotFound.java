/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_graph.exceptions;

/**
 *
 * @author Marc Knoblauch
 */
public class FileNotFound extends Exception{
    public FileNotFound(){
        super("Le fichier n'a pas été trouvé.");
    }
}
