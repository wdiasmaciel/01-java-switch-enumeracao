import java.util.Locale;
import java.util.Scanner;

public class Main {
    // Definindo o enum:
    enum DiaSemana {
        SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SÁBADO, DOMINGO
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um dia da semana: ");
        /*
         * O Locale.ROOT representa a localidade raiz (neutra), não está 
         * vinculado a nenhum país ou idioma específico.
         * Funciona da mesma forma em qualquer computador ou servidor no 
         * mundo, independentemente das configurações do sistema operacional 
         * ou da JVM
         */
        String entrada = scanner.nextLine().trim().toUpperCase(Locale.ROOT);

        DiaSemana dia;
        try {
            dia = DiaSemana.valueOf(entrada);
        } catch (IllegalArgumentException e) {
            System.out.println("Dia inválido. Digite um dia da semana válido.");
            return;
        } finally {
            // Fechando o scanner no bloco finally para garantir que ele seja fechado mesmo em caso de exceção.
            scanner.close();
        }   

        // O switch moderno pode ser atribuído diretamente a uma variável:
        String tipoDia = switch(dia) {
            case SEGUNDA, TERÇA -> "Início de semana";
            case QUARTA, QUINTA -> "Meio de semana";
            case SEXTA, SÁBADO -> "Fim de semana";
            case DOMINGO -> "Dia de descanso";
        };

        System.out.println(dia + " é " + tipoDia);
    }
}
