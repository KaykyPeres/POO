public class Main {
    public static void main(String[] args) {
        Mundo mundo = new Mundo("Free city");
        Jogador jogador1 = new Jogador("Davy jones",77,2340,47);
        Jogador jogador2 = new Jogador("Cross",70,1550,52);
        Bot bot1 = new Bot("Ryan Reynolds",56,677,true);
        Bot bot2 = new Bot("Bot Alfy",23,233,false);

        mundo.personagens[0] = jogador1;
        mundo.personagens[1] = jogador2;
        mundo.personagens[2] = bot1;
        mundo.personagens[3] = bot2;

        System.out.println("******************************");
        mundo.mostraInfo();
        System.out.println("     ");
        System.out.println("Players : ");
        jogador1.mostraInfo();
        jogador1.fazMissao();
        jogador1.recuperarVida();
        jogador1.gastarMoedas();
        jogador1.comprarMoedas(100);
        jogador1.mostraInfo();

        System.out.println(" ");
        jogador2.mostraInfo();
        jogador2.fazMissao();
        jogador2.recuperarVida();
        jogador2.gastarMoedas();
        jogador2.comprarMoedas(250);
        jogador2.mostraInfo();


        System.out.println("  ");
        System.out.println("---------------------");
        System.out.println("Bots : ");
        bot1.mostraInfo();
        bot1.fazMissao();
        bot1.interagir();
        bot1.gastarMoedas();


        System.out.println("  ");
        bot2.mostraInfo();
        bot2.fazMissao();
        bot2.interagir();
        bot2.gastarMoedas();
        System.out.println("*****************************");

    }
}
