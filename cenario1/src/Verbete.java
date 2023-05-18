public class Verbete {
    private String palavra;
    private String definicao;
    private Verbete proximo;

    public Verbete(String palavra, String definicao) {
        this.palavra = palavra;
        this.definicao = definicao;
    }

    public String getPalavra() {
        return palavra;
    }

    public String getDefinicao() {
        return definicao;
    }

    public void setDefinicao(String definicao) {
        this.definicao = definicao;
    }

    public Verbete getProximo() {
        return proximo;
    }

    public void setProximo(Verbete proximo) {
        this.proximo = proximo;
    }
}
