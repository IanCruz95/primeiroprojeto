public class Condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 2021;
        boolean incluidoNoPLano = false;
        double notaDoFilme = 8.5;
        String tipoDoPlano = "plus";

        if (anoDeLancamento >= 2021){
            System.out.println("Lançamento que os clientes estão curtindo!");
        }
        else {
            System.out.println("Filme retrô que vale a pena assistir");
        }

        if (incluidoNoPLano == true|| tipoDoPlano.equals("plus")){
            System.out.println("Filme Liberado");
        }
        else{
            System.out.println("Deve Pagar a Locação!");
        }


    }
}
