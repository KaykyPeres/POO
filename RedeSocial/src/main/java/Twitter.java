public class Twitter extends RedeSocial implements Compartilhamento{
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }
    void postarFoto(){
        super.postarFoto();
    }
    void postarVideo(){
        super.postarVideo();
    }

    void postarComentario(){
        super.postarComentario();
    }

    void curtirPublicacao(){
        super.curtirPublicacao();
    }
    @Override
    public void compartilhar(){
        System.out.println("Postagem ReTweetada! e uma discussao começou!");
    }
}
