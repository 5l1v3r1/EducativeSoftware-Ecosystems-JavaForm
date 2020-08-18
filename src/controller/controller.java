/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.vIndex;
import view.vMenu;
/**
 *
 * @author sebas
 */
public class controller {
    

    public static void main(String[] args) {

        int  delay = 3 ;
        vIndex vlogo = new vIndex();
        vlogo.setLocationRelativeTo(null);
        vlogo.setVisible(true);
        
        System.out.println("[thread main] - Form Logo");     
        Thread f = new Thread(){
            public void start(){
                try {
                    vMenu  menu = new vMenu();
                    System.out.println("[Thread] - Form Menu");
                    Thread.sleep(delay*1000);   // Espera 5 Segundos
                    menu.setLocationRelativeTo(null);
                    vlogo.setVisible(false);
                    menu.setVisible(true);
                } catch (Exception e) {
                    System.out.println("No se ejcuto hilo: "+e);
                }
            }        
        };
        f.start();
        
    }
}
