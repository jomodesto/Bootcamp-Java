import java.util.Scanner;

public record MenuConta() {

    public String exibirMenu(){
        var scanner = new Scanner(System.in);
        var menu = System.out.printf("=================================================\n" +
                "Seguem as opções disponíveis: \n\n" +
                "1 - Consultar saldo\n" +
                "2 - consultar cheque especial\n" +
                "3 - Depositar dinheiro\n" +
                "4 - Sacar dinheiro\n" +
                "5 - Pagar um boleto\n"+
                "6 - Verificar se a conta está usando cheque especial\n" +
                "7 - Sair\n"+
                "=================================================\n\n"+
                "Qual a opção desejada? ").toString();
        return  menu;
    }
}
