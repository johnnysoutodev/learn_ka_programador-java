/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author Johnny Souto
 */
public class ClientePessoaJuridicaTO  extends ClienteTO{
    private String CNPJ;
    private String razaoSocial;

    public ClientePessoaJuridicaTO() {
    }

    public ClientePessoaJuridicaTO(int codigo, String nome, String CNPJ, String razaoSocial) {
        super(codigo, nome);
        this.CNPJ = CNPJ;
        this.razaoSocial = razaoSocial;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.CNPJ);
        hash = 73 * hash + Objects.hashCode(this.razaoSocial);
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
        final ClientePessoaJuridicaTO other = (ClientePessoaJuridicaTO) obj;
        if (!Objects.equals(this.CNPJ, other.CNPJ)) {
            return false;
        }
        if (!Objects.equals(this.razaoSocial, other.razaoSocial)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "ClientePessoaJuridicaTO{" + "CNPJ=" + CNPJ + ", razaoSocial=" + razaoSocial + '}';
    }
    
    
    
}
