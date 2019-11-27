
package DAO;

import java.util.ArrayList;

/**
 *
 * @author ellen.salicani
 */
public interface IDAOConta<Tipo> {
    //ver como vai fazer pra passar o tipo da conta criada
    public void inserir(Tipo objeto) throws Exception;
    
    public void alterar(Tipo objeto) throws Exception;
    
    public void excluir(Tipo objeto) throws Exception;
    
    public void transfere(Tipo objeto, Tipo objeto2) throws Exception;
    
    public void deposito(Tipo objeto) throws Exception;
    
    public void saque(Tipo objeto) throws Exception;
    
    public void saldo(Tipo objeto) throws Exception;
    
    public void extrato(Tipo objeto) throws Exception;
    
    public Tipo getViaIdCliente(int objeto) throws Exception;
    
    public Tipo getViaNumeroConta(int numeroConta) throws Exception;
    
    public ArrayList<Tipo> listarTodos() throws Exception;

}
