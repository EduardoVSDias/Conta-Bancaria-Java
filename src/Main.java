import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //Criando leitor
        Scanner scan = new Scanner(System.in);
        //Declaração de variáveis
        String nome = "Eduardo Vinícius Silva Dias";
        String tipoConta = "Corrente";
        double saldo = 2500;
        int escolha = 0;


        //Informações principais
        System.out.println("***************************************");
        System.out.println(" Dados iniciais do cliente: ");
        System.out.println(" ");
        System.out.println(" Nome:             " + nome);
        System.out.println(" Tipo de conta:    " + tipoConta);
        System.out.println(" Saldo:            " + saldo);
        System.out.println("***************************************");

        //Criando menu
        String menu = """
                 
                 Operações:
                 
                 1- Consultar saldo
                 2- Depositar
                 3- Sacar
                 4- Sair
                 
                 Escolha sua ação: """;

        //Loop do menu
        while (escolha != 4) {
            System.out.println(menu);
            escolha = scan.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println(" Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println(" Insira a quantia de depósito: ");
                    double deposito = scan.nextDouble();
                    System.out.println(" Depositando " + deposito + "...");
                    saldo = saldo + deposito;
                    System.out.println(" Seu saldo agora é: " + saldo);
                    break;
                case 3:
                    System.out.println(" Insira a quantia que deseja sacar: ");
                    double sacar = scan.nextDouble();
                    if (sacar > saldo) {
                        System.out.println(" Você não tem saldo suficiente para este saque.");
                        System.out.println(" Seu saldo é: " + saldo);
                    } else {
                    System.out.println(" Sacando " + sacar + "...");
                    saldo = saldo - sacar;
                    System.out.println(" Seu saldo agora é: " + saldo);
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println(" A opção escolhida é inválida, escolha entre 1 a 4.");

            }
        }
        System.out.println(" ");
        System.out.println("Você escolheu sair...");
    }
}