/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;
import business.ValidacaoBO;
import interfaces.Impressao;

/**
 *
 * @author Johnny Souto
 */
public class ClienteTO implements Impressao{
    private int codigo;
    private String nome;

    public ClienteTO() {
    }

    public ClienteTO(int codigo, String nome) {
        this.setCodigo(codigo);
        this.setNome(nome);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(ValidacaoBO.validaCodigo(codigo)){
            this.codigo = codigo;
        }
        else {
            System.out.println("O código informado é inválido, foi inserido o valor 1.");
            this.codigo = 1;
        }
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.codigo;
        hash = 41 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClienteTO other = (ClienteTO) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClienteTO{" + "codigo=" + codigo + ", nome=" + nome + '}';
    }

    @Override
    public void imprimiObjeto() {
        System.out.println(this.toString());
    }
    
    
}
