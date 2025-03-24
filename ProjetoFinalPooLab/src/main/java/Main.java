import DAO.AvatarDAO;
import DAO.PlayerDAO;
import DAO.ServerDAO;
import DAO.TokenDAO;
import br.inatel.cdg.Avatar;
import br.inatel.cdg.Player;
import br.inatel.cdg.Servers;
import br.inatel.cdg.Token;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Avatar a1 = new Avatar();
        Avatar a2 = new Avatar();
        Avatar a3 = new Avatar();
        Avatar a4 = new Avatar();
        Avatar a5 = new Avatar();
        Avatar a6 = new Avatar();
        AvatarDAO aDao = new AvatarDAO();
        Player p1 = new Player();
        Player p2 =new Player();
        PlayerDAO pDao = new PlayerDAO();
        TokenDAO tDao= new TokenDAO();
        Token t1 = new Token();
        Token t2 = new Token();
        ServerDAO sDao = new ServerDAO();
        Servers s1 = new Servers();
        Servers s2 = new Servers();

        Scanner entrada = new Scanner(System.in);
        boolean flag = true;
        while(flag){

            System.out.println("  Opcoes disponiveis  ");
            System.out.println("1 - Criançao de Personagens, Jogadores, Token e Servers");
            System.out.println("2 - Deletar Personagem ");
            System.out.println("3 - Informações dos Jogadores ");
            System.out.println("4 - Informações dos Personagens ");
            System.out.println("5 - Atualizar dados de um jogador ");
            System.out.println("6 - Atualizar dados de um Personagem ");
            System.out.println("7 - Informações do Server ");
            System.out.println("8 - Atualizar dados de um Server ");

            int op= entrada.nextInt();
            switch (op){
                case 1:
                    //player1
                    p1.nome = "Kayky";
                    p1.senha=1109;
                    p1.idPlayer = 11;
                    //player2
                    p2.nome="Marcelo";
                    p2.senha=2469;
                    p2.idPlayer=24;
                    pDao.inserirPersonagem(p1);
                    pDao.inserirPersonagem(p2);
                    a1.nome= "Legolas";
                    a1.raca= "Elfo";
                    a1.forca = 12;
                    a1.destreza = 34;
                    a1.inteligencia = 18;
                    a1.classe= "Ladino";
                    a1.Player_idPlayer = p1.idPlayer;
                    aDao.inserirAvatar(a1);
                    a2.nome= "Arthur";
                    a2.raca= "Humano";
                    a2.forca = 39;
                    a2.destreza = 9;
                    a2.inteligencia = 15;
                    a2.classe= "Paladino";
                    a2.Player_idPlayer = p1.idPlayer;
                    aDao.inserirAvatar(a2);
                    a3.nome= "Azaghal";
                    a3.raca= "Anao";
                    a3.forca = 31;
                    a3.destreza = 12;
                    a3.inteligencia = 8;
                    a3.classe= "Ferreiro";
                    a3.Player_idPlayer = p1.idPlayer;
                    aDao.inserirAvatar(a3);
                    a4.nome= "Medvih";
                    a4.raca= "Orc";
                    a4.forca = 9;
                    a4.destreza = 12;
                    a4.inteligencia = 29;
                    a4.classe= "Bruxo";
                    a4.Player_idPlayer = p2.idPlayer;
                    aDao.inserirAvatar(a4);
                    a5.nome= "Grimm";
                    a5.raca= "Morto-Vivo";
                    a5.forca = 15;
                    a5.destreza = 25;
                    a5.inteligencia = 18;
                    a5.classe= "Reaper";
                    a5.Player_idPlayer = p2.idPlayer;
                    aDao.inserirAvatar(a5);
                    a6.nome= "Robert Deniro";
                    a6.raca= "DarkElf";
                    a6.forca = 9;
                    a6.destreza = 34;
                    a6.inteligencia = 15;
                    a6.classe= "Arqueiro";
                    a6.Player_idPlayer = p2.idPlayer;
                    aDao.inserirAvatar(a6);
                    t1.token = 201212;
                    tDao.inserirToken(t1);
                    t2.token = 23457;
                    tDao.inserirToken(t2);
                    tDao.inserirToken(t2);
                    s1.regiao = "Brasil";
                    sDao.inserirSevers(s1);
                    s2.regiao = "USA";
                    sDao.inserirSevers(s2);
                    break;
                case 2:
                    int id2;
                    System.out.println("Digite o ID do personagem a deletar: ");
                    id2 = entrada.nextInt();
                    aDao.deletarAvatar(id2);
                    break;
                case 3:
                    pDao.buscarPlayerSemFiltro();
                    break;
                case 4:
                    aDao.buscarAvatarSemFiltro();
                    break;
                case 5:
                    Player p3 = new Player();
                    p3.idPlayer=16;
                    p3.nome = "Gabriel";
                    p3.senha = 2016;
                    pDao.atualizarPersonagem(16,p3);
                    break;
                case 6:
                    Avatar a7 = new Avatar();
                    a7.nome = "Scorpion";
                    a7.raca= "Humano";
                    a7.forca = 10;
                    a7.destreza = 10;
                    a7.inteligencia = 10;
                    a7.classe= "Ninja";
                    a7.Player_idPlayer = p1.idPlayer;
                    aDao.atualizarAvatar(1,a7);
                    break;
                case 7:
                    sDao.buscarServersSemFiltro();
                    break;
                case 8:
                    Servers s3 = new Servers();
                    s3.regiao = "Europa";
                    sDao.atualizarServers(1,s3);
                    break;
            }

        }





    }
    }

