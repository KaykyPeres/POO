public class Supermercado {

    String nome;
    String cnpj;
    String endereco;
    String numTelefone;
    Produto[] produtos = new Produto[30];

    public Supermercado() {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.numTelefone = numTelefone;
        this.produtos = produtos;
    }

    void addProduto(Produto produtos){
        for (int i=0;i< this.produtos.length;i++){
            if (produtos[i]==null) {
                produtos[i]=produtos;
                break;
            }
        }
    }

    void mostrarMaisCaroBarato(){
        int produtoMaisCaro = 1;
        int produtoMaisBarato = -1;
        for (int i=0;i< this.produtos.length;i++){
            if (produtos[i] > produtoMaisCaro) {
                produtos[i] = produtoMaisCaro;
                System.out.println("Produto mais caro: " +produtoMaisCaro);
            }
            if (produtos[i] < produtoMaisBarato) {
                produtos[i] = produtoMaisBarato;
                System.out.println("Produto mais Barato: " +produtoMaisBarato );
            }
            break;
        }
    }

    void contarCategorias(){
        int contador = 0;
        for (int i=0;i< this.produtos.length;i++){
            if (produtos[i]>0) {
                contador++;
                System.out.println("Quantidade de produtos cadastrados: "+contador);
                break;
            }
        }
    }

    void mostraInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("CNPJ: "+this.cnpj);
        System.out.println("Endereço: "+this.endereco);
        System.out.println("Numero de Telefone: "+this.numTelefone);
        System.out.println("Produtos: "+this.produtos);
    }

}
