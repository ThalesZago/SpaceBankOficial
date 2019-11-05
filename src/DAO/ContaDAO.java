/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POO.Conta;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author ellen.salicani
 */
public class ContaDAO implements IDAOConta<Conta> {

    @Override
    public void inserir(Conta objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Conta objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Conta conta) throws Exception {        
        Conexao c = new Conexao();
        String sql = "DELETE FROM conta WHERE id_conta=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, conta.getIdCliente());
        ps.execute();
        c.confirmar();
    }

    @Override
    public void transfere(Conta objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deposito(Conta conta) throws Exception {
           //instancia da classe conexao
        Conexao c = new Conexao();
        //Define a query que será enviada para o banco de dados
        String sql="INSERT INTO transacoes (localCompra, valorTotalCompra, id_tipoTransacao, id_conta,) VALUES (?, ?, ?, ?)";
        //Preparando o comando a ser enviado ao banco parssando como
        //parametro a query e a instancia da classe conexao
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        //Definindo parametro 1 da query sql (?)
        ps.setString(1, conta.getLocalCompra());
        //Definindo parametro 2 da query sql (?)
        ps.setDouble(2, conta.getValorTotalCompra());
        //Definindo parametro 3 da query sql (?)
        ps.setInt(3, conta.getIdTipoTransacao());
        //Definindo parametro 4 da query sql (?)
        ps.setInt(4, conta.getIdConta());
        //Definindo parametro 5 da query sql (?)
        ps.execute();
        //Confirmação da classe conexao (Verificando se tudo funcionou 
        //execução da query)
        c.confirmar();
    }

    @Override
    public void saque(Conta objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saldo(Conta objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void extrato(Conta objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
