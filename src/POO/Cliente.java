
package POO;

/**
 *
 * @author ellen.salicani
 */
public class Cliente {
    private int idCliente;
    private String nomeCompleto;
    private int idade;
    private String cpfCnpj;
    private boolean pessoaFisica;
    private String senha;

     //Construtor (iniciar os valor dos atriutos)
    public Cliente(){
        this.idCliente = 0;
        this.nomeCompleto = "";
        this.cpfCnpj = "";
        this.idade = 0;
        this.pessoaFisica = false;
    }
    
    //Contrutor (obrigação de passar o codigo para trabalhar com o objeto)
    public Cliente(int idCliente){
        this.idCliente = idCliente;
        this.nomeCompleto = "";
        this.cpfCnpj = "";
        this.idade = 0;
        this.pessoaFisica = false;
    }
    
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public boolean isPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(boolean pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
