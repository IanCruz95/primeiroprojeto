import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite Seu Filme Favorito");
        String filme = leitura.nextLine();
        System.out.println("Qual o Ano de Lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Diga Sua Avaliação para o filme");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);

    }
}
