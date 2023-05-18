public class Enciclopedia {
    private Verbete primeiro;

    public void adicionarVerbete(String palavra, String definicao) {
        Verbete novoVerbete = new Verbete(palavra, definicao);
        if (primeiro == null) {
            primeiro = novoVerbete;
        } else {
            Verbete atual = primeiro;
            Verbete anterior = null;
            while (atual != null && palavra.compareToIgnoreCase(atual.getPalavra()) > 0) {
                anterior = atual;
                atual = atual.getProximo();
            }
            if (anterior == null) {
                novoVerbete.setProximo(primeiro);
                primeiro = novoVerbete;
            } else {
                anterior.setProximo(novoVerbete);
                novoVerbete.setProximo(atual);
            }
        }
    }

    public void removerVerbete(String palavra) {
        if (primeiro == null) {
            return;
        }
        if (primeiro.getPalavra().equalsIgnoreCase(palavra)) {
            primeiro = primeiro.getProximo();
        } else {
            Verbete atual = primeiro;
            Verbete anterior = null;
            while (atual != null && !atual.getPalavra().equalsIgnoreCase(palavra)) {
                anterior = atual;
                atual = atual.getProximo();
            }
            if (atual != null) {
                anterior.setProximo(atual.getProximo());
            }
        }
    }

    public void alterarDefinicao(String palavra, String novaDefinicao) {
        Verbete atual = primeiro;
        while (atual != null && !atual.getPalavra().equalsIgnoreCase(palavra)) {
            atual = atual.getProximo();
        }
        if (atual != null) {
            atual.setDefinicao(novaDefinicao);
        }
    }

    public String buscarDefinicao(String palavra) {
        Verbete atual = primeiro;
        while (atual != null && !atual.getPalavra().equalsIgnoreCase(palavra)) {
            atual = atual.getProximo();
        }
        if (atual != null) {
            return atual.getDefinicao();
        } else {
            return "Verbete não encontrado na enciclopédia.";
        }
    }
}