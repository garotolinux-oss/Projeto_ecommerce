public abstract class Usuario {
    //atributos privados
    private String nome;
    private String senha;
    //Construtor -- os parametros são obrigatorios, afinal se faz necessário nome e senha para ser usuario
    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }
    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    //to string
    @Override
    public String toString() {
        return "Usuario [nome=" + nome + ", senha=" + senha + "]";
    }

}
