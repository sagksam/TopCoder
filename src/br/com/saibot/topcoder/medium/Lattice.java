/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saibot.topcoder.medium;

/**
 *
 * @author PauloHenrique
 */
public class Lattice {
    
    public long paths(int gridSize){
    
    long paths = 1;
 
    for (int i = 0; i < gridSize; i++) {
      paths *= (2 * gridSize) - i;
      paths /= i + 1;
    }
    System.out.println(paths);
    return paths;
    }
}

class TestaLattice{

    public static void main(String[] args){
    
        new Lattice().paths(20);
    }
}