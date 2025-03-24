
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        boolean flag = true;
        Arquivo a = new Arquivo();
        ArrayList<livro> book = new ArrayList<>();

        while(flag){

            System.out.println("**Opcoes disponiveis**");
            System.out.println("1 - Salvar informacoes do jogo no arquivo ");
            System.out.println("2 - Mostrar informacoes dos jogos salvos ");
            System.out.println("3 - Ordenar jogos em ordem crecente de preco ");
            System.out.println("4 - Ordenar jogos em ordem decrecente de preco ");

            int op= entrada.nextInt();
            switch (op) {
                case 1:
                    livro l = new livro();
                    entrada.nextLine();
                    System.out.println("Nome do Livro: ");
                    l.nome = entrada.nextLine();
                    System.out.println("Autor: ");
                    l.autor = entrada.nextLine();
                    System.out.println("Editora: ");
                    l.editora = entrada.nextLine();
                    System.out.println("Qauntida de paginas: ");
                    l.qtdPaginas = entrada.nextDouble();
                    a.escrever(l);
                    System.out.println("Livro cadastrado!!!");
                    break;
                case 2:
                    ArrayList<livro> livros = a.ler();
                    int n=1;
                    for (livro func : livros) {
                        System.out.println("Livro "+n+" ! ");
                        System.out.println("Nome: "+func.nome);
                        System.out.println("Autor: "+func.autor);
                        System.out.println("Editora: "+func.editora);
                        System.out.println("Quantidade de paginas: "+func.qtdPaginas);
                        n++;
                    }

                    break;
                case 3:
                    book = a.ler();

                    Collections.sort(book);
                    System.out.println("Crescente : ");
                    for (int i = 0; i < book.size(); i++) {
                        System.out.println(book.get(i).getQtdPaginas());

                    }


                    break;
                case 4:

                    book=a.ler();
                    Collections.sort(book);
                    Collections.reverse(book);
                    System.out.println("Decrescente : " );
                    for (int i = 0; i < book.size(); i++) {
                        System.out.println( book.get(i).qtdPaginas);

                    }

                    break;

                default:

            }

        }


    }
}
