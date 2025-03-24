import java.util.Scanner;
public class Plataforma {
    String nome;
    Serie[] s = new Serie[20];

    void mostraInfo(){
        System.out.println(" **Series** ");
        for (int i = 0; i < this.s.length; i++) {
            if(s[i]!=null) {
                System.out.println("Serie"+(i + 1)+": "+ "Nome:" + s[i].nome);
                System.out.println("Serie"+(i+1)+": "+"Temporadas: " + s[i].temporadas);
                System.out.println("Serie"+(i+1)+": "+"Nota entre 0 e 10: " + s[i].nota);
                System.out.println("Serie"+(i+1)+": "+"Terminou a serie: " + s[i].finalizada);
                System.out.println("--------------------------------------------------------");
            }
        }


    }
    void addSerie(Serie series){
        for (int i=0;i< this.s.length;i++){
            if (s[i]==null) {
                s[i]=series;

                break;
            }
        }

    }
    String serieMaisLongaFinalizada() {
        float numerotempSerie = -100;
        String nomeSerie = "Nenhuma serie finalizada!!!";

        for (int i = 0; i < this.s.length; i++) {
            if (s[i] != null) {
                if(s[i].finalizada) {
                    if (s[i].temporadas > numerotempSerie) {
                        numerotempSerie = s[i].temporadas;
                        nomeSerie = s[i].nome;
                    }
                }
            }
        }
        return nomeSerie;
        }
        void mediaPorcentagem () {
        double n=0;
        double x=0;
        for (int i = 0; i < this.s.length; i++) {
         if(s[i]!=null) {
             x++;
             if (s[i].temporadas>3) {
                 n++;
             }
         }

        }
            System.out.println("Media: "+(n/x));
            System.out.println((n*100)/x+"%");
            System.out.println("------------------------------------------------");


        }



}
