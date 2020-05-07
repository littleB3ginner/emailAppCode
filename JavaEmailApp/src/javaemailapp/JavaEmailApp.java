/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaemailapp;


public class JavaEmailApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Email em = new Email("Nikola", "Nikolic");
        System.out.println(em.showInfo());
    }
    
}
