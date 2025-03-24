public abstract class Personagem {
    static int cont = 1;
    private String nome;
    private int id;
    private int poder;

    public Personagem( String nome, int poder) {
        this.nome = nome;
        this.poder = poder;
        this.id = cont;
        cont++;
    }
    void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("ID: " + this.id);
        System.out.println("Poder: " + this.poder);
    }
    void travarBatalha(){}

    public String getNome() {
        return nome;
    }
    public int getPoder() {
        return poder;
    }
    public void setPoder(int poder) {this.poder = poder;}
}
