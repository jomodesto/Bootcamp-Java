import java.time.OffsetDateTime;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // exercício 1 : Escreva um código  onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;

        System.out.println("Digite o número que deseja saber a tabuada");
        var number = scanner.nextInt();

        for(var i = 1; i <= 10 ; i++){
            var result = number * i;
            System.out.println(number+" X "+ i + " = " +  result);
        }

        //

    }

}
