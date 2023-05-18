public class App {
    public static void main(String[] args) {
        Atendimento atendimento = new Atendimento();

        // Adicionar clientes à fila de atendimento
        Cliente cliente1 = new Cliente("Cliente 1", "12345678901", "Rua A", "8756493621");
        atendimento.adicionarCliente(cliente1);

        Cliente cliente2 = new Cliente("Cliente 2", "98765432109", "Rua B", "9183628596");
        atendimento.adicionarCliente(cliente2);

        // Chamar clientes da fila de atendimento
        Cliente clienteAtendido1 = atendimento.chamarCliente();
        System.out.println("Cliente atendido: " + clienteAtendido1.getNome());

        Cliente clienteAtendido2 = atendimento.chamarCliente();
        System.out.println("Cliente atendido: " + clienteAtendido2.getNome());

        // Obter quantidade de clientes na fila de atendimento
        int quantidadeClientesFila = atendimento.getQuantidadeClientesFila();
        System.out.println("Quantidade de clientes na fila: " + quantidadeClientesFila);
    }
}

