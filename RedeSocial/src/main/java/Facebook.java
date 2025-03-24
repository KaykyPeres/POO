public class Facebook extends RedeSocial implements VideoConferencia,Compartilhamento{
    public Facebook(String senha, int numAmigos) {
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
        System.out.println("Uma chamada de video foi realizada!");
    }
    @Override
    public void compartilhar(){
        System.out.println("A publicaçao foi compartilhada");
    }
}
