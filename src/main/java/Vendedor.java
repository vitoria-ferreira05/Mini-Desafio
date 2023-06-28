public class Vendedor {
    private String email, nome, senha, cpf;

    public Vendedor(String email, String nome, String cpf) {
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getCpf() {
        return cpf;
    }
}
