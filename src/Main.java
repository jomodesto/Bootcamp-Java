import java.time.OffsetDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Olá, seja bem-vindo(a)!\n");
        System.out.println("Atualmente temos as seguintes opções:");
        var continuar = true;
        do{

            System.out.println("Opção 1: Calcular idade");
            System.out.println("Opção 2: Calcular área de um quadrado");
            System.out.println("Opção 3: Calcular área de um triângulo");
            System.out.println("Opção 4: Calcular a diferença de idade de duas pessoas");
            System.out.println("Opção 5: Fechar o sistema\n");

            System.out.printf("Com qual opção deseja continuar? ");
            var option = scanner.nextInt();
            System.out.println();

            if (option == 1) {
                // 1- Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
                System.out.println("Você escolheu a opção de canclular a idade!");

                var baseYear = OffsetDateTime.now().getYear();
                System.out.printf("Então, por gentileza, me informe o seu nome: ");
                var name = scanner.next();

                System.out.printf("Agora, informe seu ano de nascimento: ");
                var year = scanner.nextInt();

                var age = baseYear - year;

                System.out.printf("Olá %s você tem %s anos \n", name, age);
            } else if (option == 2) {
                /* 2- Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela:
                 * fórmula: área=lado X lado */
                System.out.println("Você escolheu a opção de calcular a área de um quadrado!");
                System.out.println("Informe o tamanho (em cm) do lado do quadrado");
                var lado = scanner.nextDouble();
                var areaDoQuadrado= lado * lado;
                System.out.printf("=============================================================\n");
                System.out.printf("A área do quadrado de lado %.2fcm é: %.2fcm \n", lado, areaDoQuadrado);
                System.out.printf("=============================================================\n");


            } else if (option == 3) {
            /* 3- Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela
            fórmula: área=base X altura */
                System.out.println("Você escolheu a opção de calcular a área de um triângulo!");
                System.out.println("Informe o tamanho (em cm) da base do triângulo");
                var base = scanner.nextDouble();

                System.out.println("Informe o tamanho (em cm) da altura do triângulo");
                var altura = scanner.nextDouble();

                var areaDoTriangulo = (base * altura) / 2;

                System.out.printf("=============================================================\n");
                System.out.printf("\nA área do triângulo com base %scm e altura %scm é de: %scm²\n", base, altura, areaDoTriangulo);
                System.out.printf("=============================================================\n");



            } else if (option == 4) {
                //4- Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas

                System.out.println("Você escolheu a opção de calcular a diferença de idade de duas pessoas!");
                System.out.println("informe a idade da primeira pessoa");
                var age1 = scanner.nextInt();

                System.out.println("informe a idade da segunda pessoa");
                var age2 = scanner.nextInt();

                var diferencaIdade = age1 - age2;
                if (diferencaIdade < 0){
                    diferencaIdade = age2 - age1;
                }
                System.out.printf("\n=============================================================\n");
                System.out.printf("A diferença de idade entre as duas pessoas é de %d anos", diferencaIdade);
                System.out.printf("=============================================================\n");

            } else if (option == 5) {
                System.out.printf("=============================================================\n");
                System.out.println(" Você optou por finalizar o sistema, obrigado!");
                System.out.printf("=============================================================\n");                break;

            } else {
                System.out.printf("\n=============================================================\n");
                System.out.println(" Opção incorreta, por favor informe uma das opções abaixo");
                System.out.printf("=============================================================\n");
            }

            String desejaContinuar;
            boolean respostaValida;

            do {
                System.out.println("\nDeseja continuar? (Sim/Não)");
                desejaContinuar = scanner.next();

                respostaValida = desejaContinuar.equalsIgnoreCase("Sim") ||
                        desejaContinuar.equalsIgnoreCase("Não");

                if (!respostaValida) {
                    System.out.println("Por favor, digite apenas 'Sim' ou 'Não'.");
                }
            } while (!respostaValida); // Repete até receber "Sim" ou "Não"

            continuar = desejaContinuar.equalsIgnoreCase("Sim");

        } while (continuar);









    }

}
