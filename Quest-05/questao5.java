public class questao5 {
    public static void main(String[] args) {
        String texto = "cafe com leite";

        // Isso daqui serve para separar o texto em caracteres e ficar mais fácil para manusear
        String[] originalStrings = texto.split("");
        String[] reversoStrings = new String[originalStrings.length];

        int tamanho = 0;
        for (int i = (originalStrings.length - 1); i >= 0; i--) {
            // O primeiro item do array de reversoString vai ser o último caracter do originalString e assim por adiante
            reversoStrings[tamanho] = originalStrings[i];
            tamanho ++;
        }

        for (String string : reversoStrings) {
            System.out.println(string);
            
        }


    }
}