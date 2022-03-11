
package Model;


public class Cliente extends Pessoa { 
    private String cpf;
    private String endereco;

    public Cliente(String cpf, String endereco, String nome) {
        super(nome);
        this.cpf = cpf;
        this.endereco = endereco;
    }

    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

   
    
    
    
   

    

   
    
    
    
    
    
    
}
