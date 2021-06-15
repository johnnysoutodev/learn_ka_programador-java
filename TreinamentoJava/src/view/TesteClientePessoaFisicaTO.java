/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.ClientePessoaFisicaTO;

/**
 *
 * @author johnny
 */
public class TesteClientePessoaFisicaTO {
    public static void main (String args[]){
        ClientePessoaFisicaTO obj = new ClientePessoaFisicaTO(1, "Johnny Souto" ,"29921742892", "425717008");
        obj.setCodigo(2);
        obj.imprimiObjeto();
    }
    
}
