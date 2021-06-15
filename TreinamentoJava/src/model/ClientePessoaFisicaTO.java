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
public class ClientePessoaFisicaTO {
    private String CPF;
    private String RG;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.CPF);
        hash = 59 * hash + Objects.hashCode(this.RG);
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
        final ClientePessoaFisicaTO other = (ClientePessoaFisicaTO) obj;
        if (!Objects.equals(this.CPF, other.CPF)) {
            return false;
        }
        if (!Objects.equals(this.RG, other.RG)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClientePessoaFisicaTO{" + "CPF=" + CPF + ", RG=" + RG + '}';
    }
    
    
}
