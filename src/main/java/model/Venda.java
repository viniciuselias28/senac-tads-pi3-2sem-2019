/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author samue
 */
public class Venda {
    
    private int IdVenda;
    private Date HoraVenda;
    private ArrayList<ListaVenda> listaItemVenda = new ArrayList<>();
    private Cliente Cliente;

    public Venda(Date HoraVenda, Cliente Cliente) {
        this.HoraVenda = HoraVenda;
        this.Cliente = Cliente;
    }
    
    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }
    
    public Date getHoraVenda() {
        return HoraVenda;
    }

    public void setHoraVenda(Date HoraVenda) {
        this.HoraVenda = HoraVenda;
    }
    
    
    
}