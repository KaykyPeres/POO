public class Usuario {
    private String nome;
    private String email;
    public RedeSocial[] redeSocial = new RedeSocial[2];

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Usuario(RedeSocial[] RedeSociais){
        this.redeSocial = redeSocial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
