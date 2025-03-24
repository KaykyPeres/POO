import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    boolean flag = true;
    Plataforma p=new Plataforma();

    Diretor d = new Diretor();
    while(flag){

        System.out.println("**Opcoes disponiveis**");
        System.out.println("1 - Adicionar serie ");
        System.out.println("2 - Mostrar info serie ");
        System.out.println("3 - Serie com maior numero de temporadas finalizada");
        System.out.println("4 - Porcentagem de serie com mais de 3 temp e sua media ");

        int op= entrada.nextInt();
        switch (op){
            case 1:
                Serie s = new Serie();
                    entrada.nextLine();
                    System.out.println("Nome da serie: ");
                    s.nome = entrada.nextLine();
                    do {
                        System.out.println("Nota entre 0 e 10: ");
                        s.nota= entrada.nextInt();
                    }while(s.nota>10);
                    System.out.println("Temporadas: ");
                    s.temporadas = entrada.nextInt();
                    System.out.println("Voce terminous essa serie: ");
                    s.finalizada = entrada.nextBoolean();

                    p.addSerie(s);

                    System.out.println("Serie cadastrada!!!");
                    break;
            case 2:
                p.mostraInfo();
                break;
            case 3:
                System.out.println("Maior serie finalizada: " + p.serieMaisLongaFinalizada());
                System.out.println("---------------------------------------------------------");
                break;
            case 4:
                p.mediaPorcentagem();
                break;

        }

    }


    }
}
