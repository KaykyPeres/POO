import java.io.Serializable;

public class Carrinho implements Serializable,Comparable<Carrinho>{
    private String nomeJogador;
    private int velocidade;
    private String chassi;


//    public Carrinho(String nomeJogador, int velocidade, String chassi) {
//        this.nomeJogador = nomeJogador;
//        this.velocidade = velocidade;
//        this.chassi = chassi;
//    }

    void mostraInfo(){
        System.out.println("Nome do Jogador: "+ this.nomeJogador);
        System.out.println("Velocidade do Carro: "+ this.velocidade);
        System.out.println("Chassi: "+ this.chassi);
    }

    @Override
    public int compareTo(Carrinho input) {
        return (this.velocidade-input.velocidade);
    }
    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getNomeJogador() {
        return this.nomeJogador;
    }
    public int getVelocidade() {
        return this.velocidade;
    }

    public String getChassi() {
        return this.chassi;
    }

}
