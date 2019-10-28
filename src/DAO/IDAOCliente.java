
package DAO;

import java.util.ArrayList;

/**
 *
 * @author ellen.salicani
 */
public interface IDAOCliente<Tipo> {
    public void inserir(Tipo objeto) throws Exception;
        
    public void alterar(Tipo objeto) throws Exception;
    
    public void excluir(Tipo objeto) throws Exception;
    
    public ArrayList<Tipo> listarTodos() throws Exception;
    
    public Tipo recuperar(int idCliente) throws Exception;
    
    public Tipo getViaCpfCnpj(String cpfCnpj) throws Exception;
}
