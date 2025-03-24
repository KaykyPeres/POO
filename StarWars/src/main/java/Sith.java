public class Sith extends Personagem implements Forca{
    private boolean darth;
    private Sabre sabre;

    public Sith(String nome, int poder, boolean darth, String cor) {
        super(nome, poder);
        this.darth = darth;
        this.sabre = new Sabre(cor);
    }

    void corromperJedi(){
        if(darth == true && this.getPoder() >= 60){
            System.out.println( this.getNome() + " Levou um jedi para o lado negro da força!");
        }
        else {
            System.out.println( this.getNome() + " ainda nao consegue corromper jedis!");
        }
    }

    @Override
    public void usarForca() {
        System.out.println(this.getNome() + " usou o lado negro da força!");
        int variavelAuxiliar = getPoder();
        variavelAuxiliar += 3;
        setPoder(variavelAuxiliar);
    }

    @Override
    public void trocarSabre(String cor) {
        this.sabre.setCor(cor);
    }
    @Override
    void mostraInfo() {
        super.mostraInfo();
        if(darth == true){
            System.out.println("Este sith e um darth");
        }else{
            System.out.println("Este sith nao e um darth");
        }
        System.out.println("Cor do sabre: " + this.sabre.getCor());
    }

    @Override
    public void travarBatalha(){
        System.out.println(this.getNome()+ " Travou uma batalha contra um jedi");
        int variavelAuxiliar = getPoder();
        variavelAuxiliar += 1;
        setPoder(variavelAuxiliar);
    }
}
