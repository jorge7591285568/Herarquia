import java.util.List;
import java.util.Colletions;
import java.util.ArrayList;
import java.util.Objects;

public class Conscrito {
    private String nome;
    private int numero;
    private int TempoServico;
    private Soldado imediato;
   

    private Conscrito(String nome, int numero, int TempoServico) {
        this.nome = nome;
        this.numero = numero;
        this.TempoServico = 0;
    }

    public int getINumero() {
        return numero;
    }

    public Soldado getImediato() {
        return imediato;
    }

    public String getNome() {
        return nome;
    }

    public int getTempoServico() {
        return TempoServico;
    }

    public void incremetarTempoServico() {
        TempoServico ++;
    }

    public void setSImediato(Soldado imediato) {
        if (!(Objects.equals(this.imediato, imediato))) {
            this.imediato = imediato;
           this.imediato.addSubordinados(conscrito);
        }
    }

    public void nome(String string, int i, int j) {
    }
}