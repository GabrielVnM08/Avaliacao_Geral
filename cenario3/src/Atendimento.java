import java.util.Queue;
import java.util.LinkedList;
class Atendimento {
    private Queue<Cliente> filaAtendimento;

    public Atendimento() {
        filaAtendimento = new LinkedList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        filaAtendimento.add(cliente);
    }

    public Cliente chamarCliente() {
        return filaAtendimento.poll();
    }

    public int getQuantidadeClientesFila() {
        return filaAtendimento.size();
    }
}