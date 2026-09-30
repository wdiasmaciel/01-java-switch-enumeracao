public class Main {
    // Definindo o enum:
    enum DiaSemana {
        SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SÁBADO, DOMINGO
    }

    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.SÁBADO;

        // O switch moderno pode ser atribuído diretamente a uma variável:
        String tipoDia = switch(dia) {
            case SEGUNDA, TERÇA -> "Início de semana";
            case QUARTA, QUINTA -> "Meio de semana";
            case SEXTA, SÁBADO -> "Fim de semana";
            case DOMINGO -> "Dia de descanso";
            default -> "Dia inválido"; // Caso não seja nenhum dos dias definidos.
        };

        System.out.println(dia + " é " + tipoDia); 
        // Saída: SÁBADO é Fim de semana
    }
}

