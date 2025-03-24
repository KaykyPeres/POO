public class Main {
    public static void main(String[] args) {
        Nave nave = new Nave("Millenium Falcon", true);
        Jedi jedi = new Jedi("Anaking skywalker",70,true,"Azul");
        Sith sith = new Sith("Darth maul",60,true,"Vermelho");
        Droid droid = new Droid("C3PO",10,false);

        nave.personagens[0] = jedi;
        nave.personagens[1] = sith;
        nave.personagens[2] = droid;

        nave.mostraInfo();
        System.out.println(" ");
        jedi.mostraInfo();
        jedi.usarForca();
        jedi.travarBatalha();
        jedi.treinarPadawan();
        System.out.println(" ");
        sith.mostraInfo();
        sith.usarForca();
        sith.travarBatalha();
        sith.corromperJedi();
        System.out.println(" ");
        droid.mostraInfo();
        droid.travarBatalha();
        droid.hackearSistema();
        System.out.println(" ");

        jedi.mostraInfo();
        System.out.println(" ");
        sith.mostraInfo();
        System.out.println(" ");
        droid.mostraInfo();


    }
}
