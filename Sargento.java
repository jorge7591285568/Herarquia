import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Collections;

public class Sargento {

    String nome;
    private int numero;
    private int TempoServico;
    private Tenente imediato;
    private ArrayList<Cabo> subordinados;

    public Sargento(String nome, int numero, int TempoServico) {
        this.nome = nome;
        this.numero = numero;
        this.TempoServico = 3;
        this.subordinados = new ArrayList<>();
    }

    public int getINumero() {
        return numero;
    }

    public Tenente getImediato() {
        return imediato;
    }

    public String getNome() {
        return nome;
    }

    public List<Cabo> getSubordinados() {
        return Collections.unmodifiableList(subordinados);
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void addSubordinados(Cabo cabo) {
        cabo1.imediato(this);
        if (!this.subordinados.contains(cabo)) {
            subordinados.add(cabo);
        }

    }
}