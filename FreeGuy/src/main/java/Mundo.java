public class Mundo {
    private String nome;
    public  Personagem[] personagens = new Personagem[30];

    public Mundo(String nome) {
        this.nome = nome;
    }

    void mostraInfo(){
        System.out.println("Bem-Vindo ao mundo " +this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
