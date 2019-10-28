/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POO.Conta;
import java.sql.PreparedStatement;

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
    public void deposito(Conta objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
