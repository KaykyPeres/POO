public class Jedi extends Personagem implements Treinamento , Forca{
    private boolean mestre;
    private Sabre sabre;

    public Jedi(String nome, int poder, boolean mestre, String cor) {
        super(nome, poder);
        this.mestre = mestre;
        this.sabre = new Sabre(cor);
    }

    @Override
    public void treinarPadawan() {
        if(mestre == true && this.getPoder() >= 70){
            System.out.println( this.getNome() + " treinou um Padawan!");
        }
        else {
            System.out.println( this.getNome() + " ainda nao consegue treinar padawans!");
        }

    }

    @Override
    public void usarForca() {
        System.out.println(this.getNome() + " usou a força para o bem!");
        int variavelAuxiliar = getPoder();
        variavelAuxiliar += 5;
        setPoder(variavelAuxiliar);

    }

    @Override
    public void trocarSabre(String cor) {
        this.sabre.setCor(cor);
    }

    @Override
    void mostraInfo() {
        super.mostraInfo();
        if(mestre == true){
            System.out.println("Este jedi e um mestre");
        }else{
            System.out.println("Este jedi nao e um mestre");
        }
        System.out.println("Cor do sabre: " + this.sabre.getCor());
    }

    @Override
    public void travarBatalha(){
        System.out.println(this.getNome() + " Travou uma batalha contra um sith!");
        int variavelAuxiliar = getPoder();
        variavelAuxiliar += 1;
        setPoder(variavelAuxiliar);
    }
}
