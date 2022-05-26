import java.util.Scanner;

public class SistemaTechModas
{
    public static void main(String[] args)
    {
        //Declarações de variáveis

        int usuario = 0, senha = 0, dec1 = 0, dec2 = 0;
        int j = 0;
        int escolha = 0, escolha2 = 0;
        int cont = 0;
        String name;
        int quanti = 0;

        //Declarações de variáveis do/while

        int  dw1 = 0, dw2 = 0, dw3 = 0;
        int dw4 = 0;
        float CAR = 0;

        //Declaração dos vetores

        int q = 10; //Tamanho do vetor
        int i; //Índice de posição

        String[] pecas = new String[q];
        String[] tam = new String[q];
        float[] valor = new float[q];
        String[] carrinhof = new String[q];

        //Declarações de parâmetros de leituras

        java.util.Scanner lusuario = new Scanner(System.in);
        java.util.Scanner lsenha = new Scanner(System.in);
        java.util.Scanner ldec1 = new Scanner(System.in);
        java.util.Scanner ldec2 = new Scanner(System.in);
        java.util.Scanner lq = new Scanner(System.in);

        java.util.Scanner lpecas = new Scanner(System.in);
        java.util.Scanner ltam = new Scanner(System.in);
        java.util.Scanner lvalor = new Scanner(System.in);
        java.util.Scanner lescolha = new Scanner(System.in);
        java.util.Scanner lescolha2 = new Scanner(System.in);
        java.util.Scanner lname = new Scanner(System.in);
        java.util.Scanner lquanti = new Scanner(System.in);

        //Criando a primeira interação

        do
        {
            System.out.println("");
            System.out.println(">>> Seja bem-vindo à TechModas <<<");
            System.out.println("Vestindo bem, para vestir sempre!");
            System.out.println("");
            if (cont == 0)
            {
                System.out.println("*Adicione os produtos na aba de funcionário*");
                System.out.println("");
            }
            cont++;
            System.out.println("1-Funcionário\n2-Cliente");
            System.out.println("");
            System.out.print(">>> ");

            usuario = lusuario.nextInt();

            if(usuario == 1)
            {
                do
                {
                    System.out.println("");
                    System.out.print("Digite sua senha: ");
                    senha = lsenha.nextInt();

                    if(senha == 123)
                    {
                        System.out.println("");
                        System.out.println("- Deseja alterar o catálogo de produtos?\n\n1-Sim\n2-Não");
                        System.out.println("");
                        System.out.print(">>> ");
                        dec1 = ldec1.nextInt();

                        do
                        {
                            switch (dec1)
                            {
                                case 1:
                                    System.out.println("");
                                    System.out.println("- Quantos produtos deseja adicionar? ");
                                    System.out.println("");
                                    System.out.print(">>> ");
                                    q = lq.nextInt();

                                    for(i = 0; i<q; i++)
                                    {
                                        System.out.println("");
                                        System.out.print("Adicione o produto: ");
                                        pecas[i] = lpecas.nextLine();
                                        System.out.print("Adicione o tamanho: ");
                                        tam[i] = ltam.nextLine();
                                        System.out.print("Adicione o valor: ");
                                        valor[i] = lvalor.nextFloat();

                                    }//Fechamento primeiro "for"
                                    break;

                                case 2:
                                    System.out.println("Tudo bem!");
                                    break;

                            }//Fechamento primeiro "switch"

                            System.out.println("");
                            System.out.println("- Deseja continuar alterando?\n\n1-Sim\n2-Não");
                            System.out.println("");
                            System.out.print(">>> ");
                            dec2 = ldec2.nextInt();

                            if(dec2 == 1)
                            {

                            }//Fechamento terceiro "if"
                            else
                            {
                                dw3 = 2;
                                dw2 = 2;
                                System.out.println("");
                                System.out.println("Tudo bem!");
                            }

                        }//Fechamento terceiro "dw"
                        while (dw3 != 2);

                    }//Fechamento segundo "if"
                    else
                    {
                        System.out.println("");
                        System.out.println("* Senha incorreta! Digite novamente. *");
                    }//Fechamento segundo "else"

                }//Fechamento segundo "dw"
                while (dw2 != 2);


            }//Fechamento primeiro "if" (FUNCIONÁRIO)

            else
            {
                System.out.println("");
                System.out.println(">>> Seja Bem-Vindo <<<");
                System.out.println("");
                System.out.println("- Qual o seu primeiro nome?");
                System.out.println("");
                System.out.print(">>> ");
                name = lname.nextLine();
                System.out.println("");
                System.out.println("Aqui está a nossa lista de produtos:");


                do
                {
                    System.out.println("");
                    System.out.println("- Qual produto deseja adicionar ao carrinho?");
                    System.out.println("");
                    for(i = 0; i<q; i++)
                    {

                        System.out.println((i+1) + "-" + pecas[i] + " TAM " + tam[i] + " R$ " + valor[i]);

                    }//Fechamento do 3º "for"

                    System.out.println("");
                    System.out.print("Escolha: ");
                    escolha = lescolha.nextInt();
                    System.out.println("");
                    System.out.println("- Quantas unidades?");
                    System.out.println("");
                    System.out.print(">>> ");
                    quanti = lquanti.nextInt();
                    System.out.println("");


                    switch (escolha)
                    {
                        case 1:
                            CAR = CAR + (valor[escolha-1]* quanti);
                            System.out.println("O produto " + pecas[0] +" foi adicionado ao carrinho.");
                            carrinhof[escolha - 1] = pecas[escolha - 1];
                            System.out.println("");
                            break;
                        case 2:
                            CAR = CAR + (valor[escolha-1]* quanti);
                            System.out.println("O produto " + pecas[1] +" foi adicionado ao carrinho.");
                            carrinhof[escolha - 1] = pecas[escolha - 1];
                            System.out.println("");
                            break;
                        case 3:
                            CAR = CAR + (valor[escolha-1]* quanti);
                            System.out.println("O produto " + pecas[2] +" foi adicionado ao carrinho.");
                            carrinhof[escolha - 1] = pecas[escolha - 1];
                            System.out.println("");
                            break;
                        case 4:
                            CAR = CAR + (valor[escolha-1]* quanti);
                            System.out.println("O produto " + pecas[3] +" foi adicionado ao carrinho.");
                            carrinhof[escolha - 1] = pecas[escolha - 1];
                            System.out.println("");
                            break;
                        case 5:
                            CAR = CAR + (valor[escolha-1]* quanti);
                            System.out.println("O produto " + pecas[4] +" foi adicionado ao carrinho.");
                            carrinhof[escolha - 1] = pecas[escolha - 1];
                            System.out.println("");
                            break;
                        case 6:
                            CAR = CAR + (valor[escolha-1]* quanti);
                            System.out.println("O produto " + pecas[5] +" foi adicionado ao carrinho.");
                            carrinhof[escolha - 1] = pecas[escolha - 1];
                            System.out.println("");
                            break;
                        case 7:
                            CAR = CAR + (valor[escolha-1]* quanti);
                            System.out.println("O produto " + pecas[6] +" foi adicionado ao carrinho.");
                            carrinhof[escolha - 1] = pecas[escolha - 1];
                            System.out.println("");
                            break;
                        case 8:
                            CAR = CAR + (valor[escolha-1]* quanti);
                            System.out.println("O produto " + pecas[7] +" foi adicionado ao carrinho.");
                            carrinhof[escolha - 1] = pecas[escolha - 1];
                            System.out.println("");
                            break;
                        case 9:
                            CAR = CAR + (valor[escolha-1]* quanti);
                            System.out.println("O produto " + pecas[8] +" foi adicionado ao carrinho.");
                            carrinhof[escolha - 1] = pecas[escolha - 1];
                            System.out.println("");
                            break;
                        case 10:
                            CAR = CAR + (valor[escolha-1]* quanti);
                            System.out.println("O produto " + pecas[9] +" foi adicionado ao carrinho.");
                            carrinhof[escolha - 1] = pecas[escolha - 1];
                            System.out.println("");
                            break;


                    }//Fechamento do 2º "switch"

                    j++;

                    System.out.println("Deseja adicionar mais algum produto?\n\n1-Sim\n2-Não");
                    System.out.println("");
                    System.out.print(">>> ");
                    escolha2 = lescolha2.nextInt();

                    if (escolha2 == 1)
                    {

                    }//Fechamento do 3º "if"

                    else
                    {
                        dw4 = 2;
                        dw1 = 2;
                        System.out.println("");

                        for(i = 0; i<q; i++)
                        {
                            System.out.println("Os itens selecionados foram:\n " + carrinhof[i]);
                        }

                        System.out.println("O valor total da sua compra é: R$" +CAR);
                        System.out.println("");
                        System.out.println("Muito obrigado, " + name + ". Volte sempre!");
                    }

                }while(dw4 != 2); //Fechamento do 4º "dw"

            }//Fechamento primeiro "else" CLIENTE

        }while (dw1 != 2); //Fechamento primeiro "dw"

    } //Fechamento Main
} //Fechamento Classe Publica
