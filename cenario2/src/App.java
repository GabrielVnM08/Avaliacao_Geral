import java.util.Random;
import java.util.Scanner;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da pista: ");
        int tamanhoPista = scanner.nextInt();

        int[] pista = new int[tamanhoPista];
        Random random = new Random();

        int energiaCapturada = 0;
        int bombasBatidas = 0;

        for (int i = 0; i < tamanhoPista; i++) {
            // Gera um número aleatório entre 0 e 2
            int tipoTijolinho = random.nextInt(3);

            // 0 - Tijolinho normal
            // 1 - Tijolinho com energia de campo de força
            // 2 - Tijolinho com bomba
            pista[i] = tipoTijolinho;
        }

        int posicaoAtual = 0;
        boolean jogoAcabou = false;

        while (!jogoAcabou) {
            System.out.println("Posição atual: " + posicaoAtual);

            System.out.print("Digite 1 para pular ou 2 para avançar: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Pulou para o próximo tijolinho.");
                posicaoAtual++;
            } else if (opcao == 2) {
                int tipoTijolinho = pista[posicaoAtual];

                if (tipoTijolinho == 0) {
                    System.out.println("Tijolinho normal.");
                    posicaoAtual++;
                } else if (tipoTijolinho == 1) {
                    System.out.println("Tijolinho com energia de campo de força.");
                    posicaoAtual++;
                    energiaCapturada++;
                } else if (tipoTijolinho == 2) {
                    System.out.println("Tijolinho com bomba! O carrinho explodiu.");
                    jogoAcabou = true;
                    bombasBatidas++;
                }
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }

            if (posicaoAtual >= tamanhoPista) {
                System.out.println("Você percorreu toda a pista! Parabéns!");
                jogoAcabou = true;
            }
        }

        System.out.println("----- Estatísticas -----");
        System.out.println("Tijolos percorridos: " + posicaoAtual);
        System.out.println("Energia capturada: " + energiaCapturada);
        System.out.println("Bombas batidas: " + bombasBatidas);

        scanner.close();
    }
}