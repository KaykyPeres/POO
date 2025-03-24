import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        boolean flag = true;
        Arquivo arquivo = new Arquivo();
        ArrayList<Carrinho> carros = new ArrayList<>();

        //variaveis para leitura do user
        String nomeJogador;
        String chassiCarro;
        int velocidade;



        while(flag){

            System.out.println("**Opcoes disponiveis**");
            System.out.println("1 - Salvar as informações do carrinho no arquivo ");
            System.out.println("2 - Mostrar as informações dos carrinhos salvos no arquivo ");
            System.out.println("3 - Ordenar os carrinhos em ordem crescente de velocidade ");
            System.out.println("4 - Ordenar os carrinhos em ordem decrescente de velocidade");

            int op= entrada.nextInt();

            switch (op) {
                case 1:
                    Carrinho carrinho = new Carrinho();
                    entrada.nextLine();
                    System.out.println("Nome do Jogador: ");
                    carrinho.setNomeJogador(entrada.nextLine());
                    System.out.println("Velocidade: ");
                    carrinho.setVelocidade(Integer.parseInt(entrada.nextLine()));
                    System.out.println("Chassi: ");
                    carrinho.setChassi(entrada.nextLine());

                    arquivo.escrever(carrinho);

                    carros.add(carrinho);

                    System.out.println("Carro cadastrado!!!");
                    break;

                case 2:
                    ArrayList<Carrinho> carrinhos = arquivo.ler();
                    int n=1;

                    for (Carrinho func : carrinhos) {
                        System.out.println("Carro "+ n +" ! ");
                        System.out.println("Nome Jogador: "+func.getNomeJogador());
                        System.out.println("Velocidade: "+func.getVelocidade());
                        System.out.println("Chassi: "+func.getChassi());
                        n++;
                    }

                    break;
                case 3:
                    carros = arquivo.ler();


                    Collections.sort(carros);
                    System.out.println("Crescente : ");
                    for (int i = 0; i < carros.size(); i++) {
                        System.out.println(carros.get(i).getVelocidade());

                    }


                    break;
                case 4:

                    carros=arquivo.ler();
                    Collections.sort(carros);
                    Collections.reverse(carros);
                    System.out.println("Decrescente : " );
                    for (int i = 0; i < carros.size(); i++) {
                        System.out.println( carros.get(i).getVelocidade());

                    }

                    break;

                default:
            }
        }
    }
}
