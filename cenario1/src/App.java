import java.util.Scanner;

public class App {
    private static Enciclopedia enciclopedia = new Enciclopedia();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exibirMenu();
    }

    private static void exibirMenu() {
        int opcao;
        do {
            System.out.println("------- Menu Enciclopedia -------");
            System.out.println("1. Adicionar verbete");
            System.out.println("2. Remover verbete");
            System.out.println("3. Alterar definição");
            System.out.println("4. Buscar definição");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarVerbete();
                    break;
                case 2:
                    removerVerbete();
                    break;
                case 3:
                    alterarDefinicao();
                    break;
                case 4:
                    buscarDefinicao();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
            }
        } while (opcao != 0);
    }

    private static void adicionarVerbete() {
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Digite a palavra: ");
        String palavra = scanner.nextLine();
        System.out.print("Digite a definição: ");
        String definicao = scanner.nextLine();
        enciclopedia.adicionarVerbete(palavra, definicao);
        System.out.println("Verbete adicionado com sucesso.");
    }

    private static void removerVerbete() {
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Digite a palavra do verbete a ser removido: ");
        String palavra = scanner.nextLine();
        enciclopedia.removerVerbete(palavra);
        System.out.println("Verbete removido com sucesso.");
    }

    private static void alterarDefinicao() {
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Digite a palavra do verbete a ter a definição alterada: ");
        String palavra = scanner.nextLine();
        System.out.print("Digite a nova definição: ");
        String novaDefinicao = scanner.nextLine();
        enciclopedia.alterarDefinicao(palavra, novaDefinicao);
        System.out.println("Definição alterada com sucesso.");
    }

    private static void buscarDefinicao() {
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Digite a palavra a ser buscada: ");
        String palavra = scanner.nextLine();
        String definicao = enciclopedia.buscarDefinicao(palavra);
        System.out.println(definicao);
    }
}
