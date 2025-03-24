public class Bot extends Personagem implements Interacao, Loja {
    private boolean inteligente;

    public Bot(String nome, int vida, int moedas, boolean inteligente) {
        super(nome, vida, moedas);
        this.inteligente = inteligente;
    }
    void mostraInfo(){
        super.mostraInfo();
        if(inteligente==true){
            System.out.println("Este bot possui inteligencia");
        }else{
            System.out.println("Este bot nao possiu inteligencia");
        }
    }

    @Override
    void fazMissao() {
        if(inteligente == true){
            System.out.println("O bot inteligente completou a missao! O aprendizado de maquina realmente funciona");

        }else{
            System.out.println("O bot ainda nao e inteligente para realizar uma missao!");
        }
    }

    @Override
    public void interagir(){
        if(inteligente == true){
            System.out.println("O bot nao interage mais de forma padrao! Ele aprendeu a conversar!");
        }else{
            System.out.println("O bot esta interagindo de forma padrao!");
        }
    }

    @Override
    public void gastarMoedas(){
        if(inteligente == true){
            System.out.println("O bot aprendeu a gastar moedas!");
        }else{
            System.out.println("O bot ainda nao aprendeu a gastar moedas!");
        }
    }
    @Override
    public void comprarMoedas(int qtdMoedas){

    }

    public boolean isInteligente() {return inteligente;}
    public void setInteligente(boolean inteligente) {this.inteligente = inteligente;}
}
