
package DAO;

import java.util.ArrayList;

public interface IDAOAdmin<Tipo> {
    
    public void inserir(Tipo objeto) throws Exception;
        
    public void alterar(Tipo objeto) throws Exception;
    
    public void excluir(Tipo objeto) throws Exception;
    
    public Tipo getViaUsernameSenha(String username, String senha) throws Exception;
}
