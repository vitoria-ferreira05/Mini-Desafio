package Model;

public class Cliente {
    private String email, nome, senha, cpf;

    public Cliente (String email,String nome, String cpf, String senha){
        this.email=email;
        this.nome =nome;
        this.cpf=cpf;
        this.senha = senha;
    }
    public String getEmail() {
        return email;
    }
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
