package business;

public class Excecao extends Exception{

    private static final long serialVersionUID = 1L;
    private String nome;
    private String valor;

    public String getNome() {
        return nome;
    }

    public String getValor() {
        return valor;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    Excecao(String nome, String val) {
        super("O atributo " + nome + " não pode receber " + val);
        this.setNome(nome);
        this.setValor(val);
    }
}
