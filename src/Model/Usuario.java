
package Model;


public class Usuario extends Pessoa {
    
    protected String senha;
    protected String nivelAcesso;

    public Usuario(String senha, String nivelAcesso, String nome) {
        super(nome);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public Usuario(String senha, String nivelAcesso, String nome, String cpf, String endereco) {
        super(nome, cpf, endereco);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
   
    
  
   
    
    
}
