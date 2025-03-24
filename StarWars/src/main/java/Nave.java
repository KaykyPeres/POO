public class Nave {
    private String nome;
    public  Personagem[] personagens = new Personagem[3];
    private boolean velocidadeDaLuz;

    public Nave(String nome, boolean velocidadeDaLuz) {
        this.nome = nome;
        this.velocidadeDaLuz = velocidadeDaLuz;
    }

    void mostraInfo(){
        System.out.println("Nome da nave: " + this.nome);
        if(this.velocidadeDaLuz == true){
            System.out.println("A nave atinge a Velocidade da luz" );
        }else{
            System.out.println("A nave nao atinge Velocidade da luz");
        }

    }
}
