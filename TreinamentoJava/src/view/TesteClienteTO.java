/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.ClienteTO;

/**
 *
 * @author Johnny Souto
 */
public class TesteClienteTO {
    
    public static void main(String args[]){
        ClienteTO objClienteTO = new ClienteTO(1, "Ka Solution");
        System.out.println(objClienteTO.toString());
        System.out.println("Código: " + objClienteTO.getCodigo() + " " + "Cliente: " + objClienteTO.getNome());
    }
    
}
