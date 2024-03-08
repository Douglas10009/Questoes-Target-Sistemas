public class questao1{
    public static void main(String[] args) {
        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k = k + 1;
            soma = soma + k;

            System.out.println("k = "+ k);
            System.out.println("soma = "+ soma);
            System.out.println("-----------");
        }
        System.out.println(soma);
        // O resultado é 91, pois o K é menor que 13 quando entra em sua última interação.
    }
}