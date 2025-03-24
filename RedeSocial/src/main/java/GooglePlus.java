public class GooglePlus extends RedeSocial implements VideoConferencia,Compartilhamento{
    public GooglePlus(String senha, int numAmigos) {
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
    public void fazStreaming(){

    }

    @Override
    public void compartilhar(){

    }
}
