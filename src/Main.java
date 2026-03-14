import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(50);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.println("Digite um numero de 0 a 50:");
            numeroDigitado = leitor.nextInt();
            tentativas++;
            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabens você acertou!!");
                break;

            } else if (numeroDigitado > numeroGerado) {
                System.out.println("O numero digitado é maior que o numero Gerado!");

            } else {
                System.out.println("Numerado digitado é menor que o numero Gerado!");
            }
            if ( tentativas == 5 && numeroDigitado != numeroGerado) {
                System.out.println("Você não Conseguiu acerta o numero secreto nas 5 tentativas," +
                        " o numero secreto era " + numeroGerado);
            }
        }
    }
}


