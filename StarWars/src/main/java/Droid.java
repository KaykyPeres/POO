public class Droid extends Personagem{
    private boolean hostil;

    public Droid(String nome, int poder, boolean hostil) {
        super(nome, poder);
        this.hostil = hostil;
    }

    void hackearSistema(){
        if(hostil == true){
            System.out.println(this.getNome()+" Hackeou o Sistema!");
        }else{
            System.out.println(this.getNome() + " Vai ajudar os jedis em sua batalha!");
        }
    }

    @Override
    public void travarBatalha(){
        int variavelAuxiliar = getPoder();
        if(hostil == true){
            System.out.println(this.getNome()+ " Travou uma batalha contra um jedi");
            variavelAuxiliar += 1;
            setPoder(variavelAuxiliar);
        }else{
            System.out.println(this.getNome()+ " Travou uma batalha contra um sith");
            variavelAuxiliar += 1;
            setPoder(variavelAuxiliar);
        }

    }
}
