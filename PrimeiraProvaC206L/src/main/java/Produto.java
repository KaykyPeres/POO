public class Produto {
    int codigoSerie;
    String nome;
    String categoria;
    int quantidade;
    double valor;

    public Produto() {
        this.codigoSerie = codigoSerie;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    void mostrarInfos(){
        System.out.println("Codigo de Serie:  "+ this.codigoSerie);
        System.out.println("Nome do produto: "+this.nome);
        System.out.println("Categoria: "+this.categoria);
        System.out.println("Quantidade: "+this.quantidade);
        System.out.println("Valor: "+ this.valor);
    }

}