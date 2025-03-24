public abstract class Personagem {
    static int cont = 1;
    protected int id;
    protected String nome;
    protected int vida;
    protected int moedas;

    public Personagem(String nome, int vida, int moedas) {
        this.nome = nome;
        this.vida = vida;
        this.moedas = moedas;
        this.id = cont;
        cont++;
    }

    void mostraInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Vida: "+this.vida);
        System.out.println("Moedas: "+this.moedas);
        System.out.println("ID: "+this.id);
    }

    void fazMissao(){}

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMoedas() {
        return moedas;
    }

    public void setMoedas(int moedas) {
        this.moedas = moedas;
    }
}
