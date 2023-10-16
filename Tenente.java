import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Collections;

public class Tenente {
    String nome;
    private int numero;
    private int TempoServico;
    private Capitao imediato;
    private ArrayList<Tenente> subordinados;

    public Tenente(String nome, int numero, int TempoServico) {
        this.nome = nome;
        this.numero = numero;
        this.TempoServico = 3;
        this.subordinados = new ArrayList<>();
    }

    public int getINumero() {
        return numero;
    }

    public Capitao getImediato() {
        return imediato;
    }

    public String getNome() {
        return nome;
    }

    public List<Sargento> getSubordinados() {
        return Collections.unmodifiableList(subordinados);
    }

    public int getTempoServico() {
        return tempoServico ++;
    }

    public void addSubordinados(Sargento imediato) {
        sargento1.imediato(this);
        if (!this.subordinados.contains(imediato)) {
            subordinados.add(imediato);
        }

    }
}