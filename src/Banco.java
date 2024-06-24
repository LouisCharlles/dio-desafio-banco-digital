import java.util.List;

public class Banco {
    public String nome;
    List<Conta> listaDeContas;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
