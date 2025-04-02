import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int comprar;
        //Declaração dos objetos
        Computador[] pc = new Computador[3];
        Computador[] novaCompra = new Computador[100];
        MemoriaUSB m1 = new MemoriaUSB();
        MemoriaUSB m2 = new MemoriaUSB();
        MemoriaUSB m3 = new MemoriaUSB();
        Cliente c1 = new Cliente();
        int cont=0;

        //For para declarar cada um dos Campos do Array pc[]
        for (int i = 0; i < pc.length; i++) {
            pc[i] = new Computador();
        }
        m1.nome = "Pen-drive";
        m1.capacidade = 16;
        m2.nome = "Pen-drive";
        m2.capacidade = 32;
        m3.nome = "HD Externo";
        m3.capacidade = 1000;

        //Dados do PRIMEIRO Computador
        pc[0].marca = "Positivo";
        pc[0].preco = 1300;
        pc[0].hb[0].nome = "Pentium Core i3";
        pc[0].hb[0].capacidade = 1200;
        pc[0].hb[1].nome = "Memoria RAM";
        pc[0].hb[1].capacidade = 4;
        pc[0].hb[2].nome = "HD";
        pc[0].hb[2].capacidade = 500;
        pc[0].so.nome = "Linux Ubuntu";
        pc[0].so.tipo = 32;
        pc[0].usb = m1;

        //Dados do SEGUNDO Computador
        pc[1].marca = "Acer";
        pc[1].preco = 1800f;
        pc[1].hb[0].nome = "Pentium Core i5";
        pc[1].hb[0].capacidade = 2260;
        pc[1].hb[1].nome = "Memoria RAM";
        pc[1].hb[1].capacidade = 8f;
        pc[1].hb[2].nome = "HD";
        pc[1].hb[2].capacidade = 1000;
        pc[1].so.nome = "Windows 8";
        pc[1].so.tipo = 64;
        pc[1].usb = m2;

        //Dados do TERCEIRO Computador
        pc[2].marca = "Vaio";
        pc[2].preco = 2800;
        pc[2].hb[0].nome = "Pentium Core i7";
        pc[2].hb[0].capacidade = 3500;
        pc[2].hb[1].nome = "Memoria RAM";
        pc[2].hb[1].capacidade = 16;
        pc[2].hb[2].nome = "HD";
        pc[2].hb[2].capacidade = 2000;
        pc[2].so.nome = "Windows 10";
        pc[2].so.tipo = 64;
        pc[2].usb = m3;

        boolean flag = true;

        while (flag){
            System.out.println("Bem-vindo a Tabela de valores: ");
            System.out.println("1 - Para comprar o PC numero 1");
            System.out.println("2 - Para comprar o PC numero 2");
            System.out.println("3 - Para comprar o PC numero 3");
            System.out.println("0 - Para sair do menu.");


            int op = input.nextInt();
            switch(op){
                case 1:
                    System.out.println("Promocao 1: ");
                    pc[0].mostraPCConfigs();

                    System.out.println("Deseja realizar a compra? (1 - comprar, 0 -  sair)");
                    comprar = input.nextInt();
                    if(comprar==0){
                        break;
                    }
                    novaCompra[cont] = pc[0];
                    cont++;
                    break;
                case 2:
                    System.out.println("Promocao 2: ");
                    pc[1].mostraPCConfigs();

                    System.out.println("Deseja realizar a compra? (1 - comprar, 0 -  sair)");
                    comprar = input.nextInt();
                    if(comprar==0){
                        break;
                    }
                    novaCompra[cont] = pc[1];
                    cont++;

                    break;

                case 3:
                    System.out.println("Promocao 3: ");
                    pc[2].mostraPCConfigs();

                    System.out.println("Deseja realizar a compra? (1 - comprar, 0 -  sair)");
                    comprar = input.nextInt();
                    if(comprar==0){
                        break;
                    }
                    novaCompra[cont] = pc[2];
                    cont++;
                    break;

                case 0:
                    System.out.println("Computadores COMPRADOS:");
                    for (int i = 0; i < novaCompra.length; i++) {
                        if (novaCompra[i] != null) {
                            novaCompra[i].mostraPCConfigs();
                        }
                    }

                    // Atribuição de compras
                    c1.pc = novaCompra;

                    //Saida de Dados
                    System.out.println("");
                    System.out.println("**********************************");
                    System.out.println("Valor TOTAL da Compra: R$" + c1.calculaTotalCompra());
                    System.out.println("**********************************");
                    System.out.println("OBRIGADO POR COMPRAR COM A GENTE");
                    System.out.println("");
                    flag =false;
                    break;

                default:
                    System.out.println("Desculpe mas essa opicao nao existe");
                    System.out.println("Tente denovo");
            }
        }

    }


}
