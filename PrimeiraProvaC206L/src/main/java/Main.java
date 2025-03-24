import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        Supermercado s = new Supermercado();
        Produto p = new Produto();


        while(flag){

            System.out.println("**Opcoes disponiveis**");
            System.out.println("1 - Adicionar Produto ");
            System.out.println("2 - Mostrar informaçoes do supermercado e produtos ");
            System.out.println("3 - Mostrar quantidade de produtos por categoria cadastrados");
            System.out.println("4 - Mostrar informaçoes do produto mais care e mais barato cadastrado ");

            int op= sc.nextInt();
            switch (op){
                case 1:
                    sc.nextLine();
                    System.out.println("Nome do Produto: ");
                    p.nome = sc.nextLine();

                    s.addProduto(p);

                    System.out.println("Produto cadastrado!");
                    break;
                case 2:
                    s.mostraInfo();
                    p.mostrarInfos();
                    break;
                case 3:
                    s.contarCategorias();
                    break;
                case 4:
                    s.mostrarMaisCaroBarato();
                    break;

            }

        }

    }
}
