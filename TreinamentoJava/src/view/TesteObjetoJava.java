/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author johnny
 */
public class TesteObjetoJava {
    
    public static void main (String args[]){
        String x = new String("valor");
        String y = new String("valor");
        System.out.println(x == y);
        x = y;
        System.out.println(x == y);
        System.out.println(x.equals(y));
        x = "valor 2";
        System.out.println(x == y);
    }
    
}
