public class Main {
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Homem aranha");

        int anoDeLancamento = 2021;
        System.out.println("Ano de Lancamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.0;
        double media = (8.0 + 9.0 + 7.5)/3;
        System.out.println(media);
        String sinopse;

        sinopse = """
                    Filme: Homem Aranha
                    Filme de um jovem adolescente que se tornou um heroi
                    Excelente filme
                    Ano de Lancamento
                """ + anoDeLancamento;

        int classificacao = (int) (media/2);
        System.out.println(classificacao);

    }
}