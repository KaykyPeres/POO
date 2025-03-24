public class Jogador extends Personagem implements Suplemento,Loja{
    private int nivel;

    public Jogador(String nome, int vida, int moedas, int nivel) {
        super(nome, vida, moedas);
        this.nivel = nivel;
    }

    void adicionaSkin(Skin skin){
        System.out.println("Este jogador esta usando " + " Skin");

    }

    void adicionaMochila(Mochila mochila){
        System.out.println("Essa mochila possui capacidade de " + " dentro de sua mochila");
    }

    void mostraInfo(){
        super.mostraInfo();
        System.out.println("Nivel do jogador: "+this.nivel);
    }

    @Override
    void fazMissao() {
        System.out.println(this.nome+" completou uma missao! Siga seu progresso");
        int variavelAuxiliar = getNivel();
        variavelAuxiliar += 1;
        setNivel(variavelAuxiliar);
    }

    @Override
    public void recuperarVida(){
        System.out.println("O jogador tomou sua poçao de cura!");
        if(this.vida < 100){
            int variavelAuxiliar = getVida();
            variavelAuxiliar += 5;
            setVida(variavelAuxiliar);
        }else{
            int variavelAuxiliar = getVida();
            variavelAuxiliar += 0;
            setVida(variavelAuxiliar);
        }
    }

    @Override
    public void gastarMoedas(){
        System.out.println("O jogador se recusa a gastar suas moedas!");
    }
    @Override
    public void comprarMoedas(int qtdMoedas){
        System.out.println(this.nome+" Comprou moedas na loja! ele comprou mais " +qtdMoedas+ " moedas na loja!");
        int variavelAuxiliar = getMoedas();
        variavelAuxiliar += qtdMoedas;
        setMoedas(variavelAuxiliar);
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
