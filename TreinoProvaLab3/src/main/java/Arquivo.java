import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    public void escrever(Carrinho input){

        OutputStream outputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedWriter bufferedWriter = null;
        String linhaEscrever;

        try{

            outputStream = new FileOutputStream("Arquivo.txt", true);
            outputStreamWriter = new OutputStreamWriter(outputStream);
            bufferedWriter = new BufferedWriter(outputStreamWriter);

            bufferedWriter.write("Carrinho");
            bufferedWriter.newLine();
            bufferedWriter.write(input.getNomeJogador() + "\n");
            bufferedWriter.write(input.getVelocidade() + "\n");
            bufferedWriter.write(input.getChassi() + "\n");

        }catch(Exception e){
            System.out.println(e);
        }finally {
            try {
                bufferedWriter.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public ArrayList<Carrinho> ler(){

        ArrayList<Carrinho> carro = new ArrayList<>();

        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        String linhaLer;

        try{
            inputStream = new FileInputStream("Arquivo.txt");
            inputStreamReader = new InputStreamReader(inputStream);
            bufferedReader = new BufferedReader(inputStreamReader);

            linhaLer = bufferedReader.readLine();

            while(linhaLer != null){
                if(linhaLer.contains("Carrinho")){
                    String nome = bufferedReader.readLine();
                    int velocidade = Integer.parseInt(bufferedReader.readLine());
                    String chassi  = bufferedReader.readLine();

                    Carrinho car = new Carrinho();
                    car.setChassi(chassi);
                    car.setVelocidade(velocidade);
                    car.setNomeJogador(nome);

                    carro.add(car);
                }
                linhaLer = bufferedReader.readLine();
            }

        }catch (Exception e){
            System.out.println(e);
        }finally {
            try{
                bufferedReader.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }

        return carro;
    }
}
