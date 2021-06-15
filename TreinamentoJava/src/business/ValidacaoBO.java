/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author Johnny Souto
 */
public class ValidacaoBO {
    // Classe de metodos não precisa criar objeto, portanto, não é necessario ter atributos, variaveis
    public static boolean validaCodigo(int codigo){
        return codigo > 0;
    }
}
