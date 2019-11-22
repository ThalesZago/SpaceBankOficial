/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POO.Conta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ellen.salicani
 */
public class ContaDAO implements IDAOConta<Conta> {

    @Override
    public void inserir(Conta conta) throws Exception {
         Conexao c = new Conexao();
        String sql="INSERT INTO conta (id_cliente, id_gerente, tipoConta, id_agencia) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, conta.getIdCliente());
        ps.setInt(2, conta.getIdGerente());
        ps.setInt(3, conta.getIdTipoConta());
        ps.setInt(4, conta.getAgencia());
        ps.execute();
        c.confirmar();
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
    public void deposito(Conta conta, Conta favorecido) throws Exception {
        Conexao c = new Conexao();        
        String sql="INSERT INTO transacoes (localCompra, valorTotalCompra, id_tipoTransacao) VALUES (?, ?, ?)";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, "Depósito");
        ps.setDouble(2, conta.getValorTotalCompra());
        ps.setInt(3, conta.getIdTipoTransacao());
        ps.execute();
        c.confirmar();
        
        Conexao c1 = new Conexao();
        String sql1 = "UPDATE conta set saldo = ? where numeroConta = ?";
        PreparedStatement ps1 = c1.getConexao().prepareStatement(sql1);
        ps1.setFloat(1, conta.getSaldo());
        ps1.setInt(2, conta.getIdConta());
        ps1.execute();
        c1.confirmar();
        
        Conexao c2 = new Conexao();
        String sql2 = "update conta set saldo = ? where numeroConta = ?";
        PreparedStatement ps2 = c2.getConexao().prepareStatement(sql2);
        ps2.setFloat(1, favorecido.getSaldo());
        ps2.setInt(2, favorecido.getIdConta());
        ps2.execute();
        c2.confirmar();
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

    @Override
    public Conta getViaIdCliente(int idCliente) throws Exception {
        Conexao c = new Conexao();
        String sql="select * from conta where id_cliente = ?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, idCliente);
        ResultSet rs = ps.executeQuery();
       
        Conta conta = new Conta();
        if(rs.next()){
            conta.setIdCliente(rs.getInt("id_cliente"));
            conta.setAgencia(rs.getInt("id_agencia"));
            conta.setContaCorrente(rs.getInt("numeroConta"));
            conta.setIdGerente(rs.getInt("id_gerente"));
            conta.setIdTipoConta(rs.getInt("tipoConta"));
            conta.setSaldo((float) rs.getDouble("saldo"));
        }
        return conta;
    }

    @Override
    public Conta getViaNumeroConta(int numeroConta) throws Exception {
        Conexao c = new Conexao();
        String sql="select * from conta where numeroConta = ?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, numeroConta);
        ResultSet rs = ps.executeQuery();
       
        Conta conta = new Conta();
        if(rs.next()){
            conta.setIdCliente(rs.getInt("id_cliente"));
            conta.setAgencia(rs.getInt("id_agencia"));
            conta.setContaCorrente(rs.getInt("numeroConta"));
            conta.setIdGerente(rs.getInt("id_gerente"));
            conta.setIdTipoConta(rs.getInt("tipoConta"));
            conta.setSaldo((float) rs.getDouble("saldo"));
        }
        return conta;
    }
    
}
