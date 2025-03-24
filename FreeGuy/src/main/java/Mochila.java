public class Mochila {
    private int qtdItens;
    private int capacidade;

    public Mochila(int qtdItens, int capacidade) {
        this.qtdItens = qtdItens;
        this.capacidade = capacidade;
    }

    void mostraInfo(){
        System.out.println("Quantidade de Itens: "+ this.qtdItens);
        System.out.println("Capacidade da mochila: "+ this.capacidade);
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(int qtdItens) {
        this.qtdItens = qtdItens;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }


}
