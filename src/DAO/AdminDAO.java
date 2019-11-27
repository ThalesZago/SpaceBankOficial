
package DAO;

import POO.Admin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDAO implements IDAOAdmin<Admin>{

    @Override
    public void inserir(Admin admin) throws Exception {
        Conexao c = new Conexao();
        String sql="INSERT INTO gerente (nomeCompleto, username, email, senha, cpf) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, admin.getNomeCompleto());
        ps.setString(2, admin.getUsername());
        ps.setString(3, admin.getEmail());
        ps.setString(4, admin.getSenha());
        ps.setString(5, admin.getCpf());
        ps.execute();
        c.confirmar();
    }

    @Override
    public void alterar(Admin admin) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Admin admin) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Admin getViaUsernameSenha(String username, String senha) throws Exception {
        Conexao c = new Conexao();
        String sql = "SELECT * FROM gerente WHERE username=? and senha=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, username);
        ps.setString(2, new String(senha));
        ResultSet rs = ps.executeQuery();
       
        Admin admin = new Admin();
        if(rs.next()){
            admin.setIdAdmin(rs.getInt("id_gerente"));
            admin.setNomeCompleto(rs.getString("nomeCompleto"));
            admin.setCpf(rs.getString("cpf"));
            admin.setUsername(rs.getString("username"));
            admin.setEmail(rs.getString("email"));
            admin.setSenha(rs.getString("senha"));
        }
        return admin;
    }
}
