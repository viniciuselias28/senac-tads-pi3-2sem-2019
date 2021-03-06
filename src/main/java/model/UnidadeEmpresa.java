/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author vinicius
 */
public class UnidadeEmpresa {
    
    protected int idUnidadeEmpresa;
    protected String descricao;
    protected int tipo_unidade;

    public UnidadeEmpresa() {
    }

    public UnidadeEmpresa(int idUnidadeEmpresa, String descricao, int tipo_unidade) {
        this.idUnidadeEmpresa = idUnidadeEmpresa;
        this.descricao = descricao;
        this.tipo_unidade = tipo_unidade;
    }

    public int getIdUnidadeEmpresa() {
        return idUnidadeEmpresa;
    }

    public void setIdUnidadeEmpresa(int idUnidadeEmpresa) {
        this.idUnidadeEmpresa = idUnidadeEmpresa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTipo_unidade() {
        return tipo_unidade;
    }

    public void setTipo_unidade(int tipo_unidade) {
        this.tipo_unidade = tipo_unidade;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.idUnidadeEmpresa;
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
        final UnidadeEmpresa other = (UnidadeEmpresa) obj;
        if (this.idUnidadeEmpresa != other.idUnidadeEmpresa) {
            return false;
        }
        return true;
    }
    
    
    
}
