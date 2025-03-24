abstract public class RedeSocial {
    protected String senha;
    protected int numAmigos;

    public RedeSocial(String senha, int numAmigos) {
        this.senha = senha;
        this.numAmigos = numAmigos;
    }

    void postarFoto(){
        System.out.println("Foto postada!");
    }

    void postarVideo(){
        System.out.println("Video Postado!");
    }

    void postarComentario(){
        System.out.println("Comentario Publicado!");
    }

    void curtirPublicacao(){
        System.out.println("Publicaçao Curtida!");
    }
}
