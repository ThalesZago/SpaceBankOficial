
package POO;

public class Admin {
    private int idAdmin;
    private String nomeCompleto;
    private String username;
    private String email;
    private String senha;
    private String cpf;

    
    public Admin(int idAdmin, String nomeCompleto, String username, String email, String senha, String cpf){
        this.idAdmin = idAdmin;
        this.nomeCompleto = nomeCompleto;
        this.username = username;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
    }
    
    public Admin(){
        this.idAdmin = 0;
        this.nomeCompleto = "";
        this.username = "";
        this.email = "";
        this.senha = "";
        this.cpf = "";
    }
    
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
