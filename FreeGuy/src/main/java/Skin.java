public class Skin {
    private String nome;
    private String raridade;

    public Skin(String nome, String raridade) {
        this.nome = nome;
        this.raridade = raridade;
    }

    void MostraInfo(){
        System.out.println("Nome da skin: "+this.nome);
        System.out.println("Raridade da skin: "+this.raridade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaridade() {
        return raridade;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }
}
