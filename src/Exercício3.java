import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        MenuConta menu = new MenuConta();

        System.out.println("Bem vindo ao Banco Bootcamp \n");
        System.out.println("Vamos iniciar com a abertura de conta:");
        System.out.printf("Por favor, digite seu nome: \n");
        var titular = scanner.next();

        System.out.println("Agora digite o valor que será depositado");
        var saldo = scanner.nextDouble();

        Conta conta1 = new Conta(titular, saldo);

        System.out.println("Conta criada com sucesso!! \n\n");
        System.out.printf("Seguem as informações da sua conta: \n" +
                "Titular: %s \n"+
                "Saldo: %s \n" +
                "Cheque especial: %s \n" +
                "Limite: %s \n\n", conta1.getTitular(), conta1.getSaldo(), conta1.getChequeEspecial(), conta1.getLimite());

        int opcao;

        do{
            menu.exibirMenu();
            opcao = scanner.nextInt();
            if (opcao == 1) conta1.getSaldo();
            else if (opcao == 2) conta1.getChequeEspecial();
            else if (opcao == 3) {
                System.out.printf("Quanto deseja depositar? ");
                var valor = scanner.nextDouble();
                conta1.deposito(valor);
            } else if (opcao == 4) {


            }

            System.out.printf("Deseja continuar? Sim/Não");

            boolean respostaValida;
            do{
                var desejaContinuar = scanner.next();
                respostaValida = desejaContinuar.equalsIgnoreCase("Sim") ||
                                 desejaContinuar.equalsIgnoreCase("Não");


                System.out.printf("\nFavor, digitar somente 'Sim' ou 'Não'");

            }while (!respostaValida);


        }while (opcao != 7);






    }

}
