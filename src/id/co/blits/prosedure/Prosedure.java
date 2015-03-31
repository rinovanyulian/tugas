/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.blits.prosedure;

/**
 *
 * @author uzumakiriyu
 */
public class Prosedure {
    void persegipanjang (){
        
    int panjang = 27;
    int lebar = 17;
    int luas = panjang + lebar;
        System.out.println("Luas Persegi Panjang = "+luas);
    }   
    public static void main(String[] args) {
        
    Prosedure p = new Prosedure();   
        p.persegipanjang();
    }
}
