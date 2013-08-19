/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author Irlei
 */
import java.io.Serializable;


//A classe deve implementar Serializable
public class Cliente implements Serializable {

    private String nome;
    private int idade;
    private String cpf;

    public Cliente(){}
    
    public Cliente(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public boolean equals(Cliente obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other =  obj;
        if (!this.nome.equals(other.nome)) {
            return false;
        }
        if (this.idade != other.idade) {
            return false;
        }
        if (!this.cpf.equals(other.cpf)) {
            return false;
        }
        return true;
    }    
    
    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + '}';
    }   
  
}
