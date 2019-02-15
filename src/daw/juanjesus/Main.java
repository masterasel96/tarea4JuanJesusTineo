package daw.juanjesus;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public class Main {
    public static void main(String[] args) {
        
        
        Coche a = new Coche("Peugeot", "MA-8512-CX", 60);
        Coche b = new Coche("Renault", "4072 CYY", 120);
        
        System.out.println(a.toString());
        System.out.println(b.toString());
        
    }
}
