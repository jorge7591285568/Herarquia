import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Collections;

public class Capitao {

    String nome;
    private int numero;
    private int TempoServico;
    private ArrayList<Tenente> subordinados;

    public Capitao(String nome, int numero, int TempoServico) {
        this.nome = nome;
        this.numero = numero;
        this.TempoServico = 3;
        this.subordinados = new ArrayList<>();
    }

    public int getINumero() {
        return numero;
    }


    public String getNome() {
        return nome;
    }

    public List<Tenente> getSubordinados() {
        return Collections.unmodifiableList(subordinados);
    }

    public int getTempoServico() {
        return TempoServico;
    }
    public void addSubordinados(Tenente tenente) {
        tenente.imediato(this);
        if (!this.subordinados.contains(tenente)) {
            subordinados.add(tenente);
        }

    }
}