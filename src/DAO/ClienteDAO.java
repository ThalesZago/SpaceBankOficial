
package DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import POO.Cliente;


public class ClienteDAO implements IDAOCliente<Cliente>{
    
    @Override
    public void inserir(Cliente cliente) throws Exception{
        Conexao c = new Conexao();
        String sql="INSERT INTO cliente (nomeCompleto, cpfCnpj, idade, pessoaFisica, email, senha) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, cliente.getNomeCompleto());
        ps.setString(2, cliente.getCpfCnpj());
        ps.setInt(3, cliente.getIdade());
        ps.setBoolean(4, cliente.isPessoaFisica());
        ps.setString(5, cliente.getEmail());
        ps.setString(6, cliente.getSenha());
        ps.execute();
        c.confirmar();
    }
    
    @Override
    public void alterar(Cliente cliente) throws Exception{
        Conexao c = new Conexao();
        String sql="UPDATE cliente SET nomeCompleto=?, cpfCnpj=?, idade=?, pessoaFisica=?, email=?, senha=? WHERE id_cliente=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, cliente.getNomeCompleto());
        ps.setString(2, cliente.getCpfCnpj());
        ps.setInt(3, cliente.getIdade());
        ps.setBoolean(4, cliente.isPessoaFisica());
        ps.setString(5, cliente.getEmail());
        ps.setString(6, cliente.getSenha());
        ps.setInt(7, cliente.getIdCliente());
        ps.execute();
        c.confirmar();
    }
    
    @Override
    public void excluir(Cliente cliente) throws Exception{
        Conexao c = new Conexao();
        String sql = "DELETE FROM cliente WHERE id_cliente=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, cliente.getIdCliente());
        ps.execute();
        c.confirmar();
    }
    
    @Override
    public ArrayList<Cliente> listarTodos() throws Exception{
        Conexao c = new Conexao();
        String sql = "SELECT * FROM cliente ORDER BY nomeCompleto";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        ArrayList listarClientes = new ArrayList();
        while(rs.next()){
            Cliente cliente = new Cliente();
            cliente.setIdCliente(rs.getInt("id_cliente"));
            cliente.setNomeCompleto(rs.getString("nomeCompleto"));
            cliente.setCpfCnpj(rs.getString("cpfCnpj"));
            cliente.setIdade(rs.getInt("idade"));
            cliente.setPessoaFisica(rs.getBoolean("pessoaFisica"));
            cliente.setEmail(rs.getString("email"));
            cliente.setSenha(rs.getString("senha"));
            listarClientes.add(cliente);
        }
        return listarClientes;
    }
    
    @Override
    public Cliente recuperar(int idCliente) throws Exception{
        Conexao c = new Conexao();
        String sql = "SELECT * FROM cliente WHERE id_cliente=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, idCliente);
        ResultSet rs = ps.executeQuery();
       
        Cliente cliente = new Cliente();
        if(rs.next()){
            cliente.setIdCliente(rs.getInt("id_cliente"));
            cliente.setNomeCompleto(rs.getString("nomeCompleto"));
            cliente.setCpfCnpj(rs.getString("cpfCnpj"));
            cliente.setIdade(rs.getInt("idade"));
            cliente.setPessoaFisica(rs.getBoolean("pessoaFisica"));
            cliente.setEmail(rs.getString("email"));
            cliente.setSenha(rs.getString("senha"));
        }
        return cliente;
    }
    
    @Override
    public Cliente getViaCpfCnpjSenha(String cpfCnpj, String senha) throws Exception{
        Conexao c = new Conexao();
        String sql = "SELECT * FROM cliente WHERE cpfCnpj=? and senha=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, cpfCnpj);
        ps.setString(2, new String(senha));
        ResultSet rs = ps.executeQuery();
       
        Cliente cliente = new Cliente();
        if(rs.next()){
            cliente.setIdCliente(rs.getInt("id_cliente"));
            cliente.setNomeCompleto(rs.getString("nomeCompleto"));
            cliente.setCpfCnpj(rs.getString("cpfCnpj"));
            cliente.setIdade(rs.getInt("idade"));
            cliente.setPessoaFisica(rs.getBoolean("pessoaFisica"));
            cliente.setEmail(rs.getString("email"));
            cliente.setSenha(rs.getString("senha"));
        }
        return cliente;
    }

    @Override
    public Cliente getAllViaCpfCnpj(String cpfCnpj) throws Exception {
        Conexao c = new Conexao();
        String sql = "SELECT * FROM cliente WHERE cpfCnpj=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, cpfCnpj);
        ResultSet rs = ps.executeQuery();
        
        Cliente cliente = new Cliente();
        if(rs.next()){
            cliente.setIdCliente(rs.getInt("id_cliente"));
            cliente.setNomeCompleto(rs.getString("nomeCompleto"));
            cliente.setCpfCnpj(rs.getString("cpfCnpj"));
            cliente.setIdade(rs.getInt("idade"));
            cliente.setPessoaFisica(rs.getBoolean("pessoaFisica"));
            cliente.setEmail(rs.getString("email"));
            cliente.setSenha(rs.getString("senha"));
        }
        return cliente;
    }
}
