import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Collections;

public class Soldado {
    String nome;
    private int numero;
    private int TempoServico;
    private Cabo imediato;
    private ArrayList<Conscrito> subordinados;

    public Soldado(String nome, int numero, int TempoServico) {
        this.nome = nome;
        this.numero = numero;
        this.TempoServico = 1;
        this.subordinados = new ArrayList<>();
    }

    public int getINumero() {
        return numero;
    }

    public Cabo getImediato() {
        return imediato;
    }

    public String getNome() {
        return nome;
    }

    public int getTempoServico() {
        return TempoServico;
    }

    public List<Conscrito> getSubordinados() {
        return Collections.unmodifiableList(subordinados);
    }


    public void setImediato(Cabo imediato) {
        if (!this.subordinados.contains(imediato)) {
            subordinados.add(imediato);
        }
    }
}
