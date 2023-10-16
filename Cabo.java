import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Collections;

public class Cabo {

  String nome;
  private int numero;
  private int TempoServico;
  private Sargento imediato;
  private ArrayList<Soldado> subordinados;

  public Cabo(String nome, int numero, int TempoServico) {
    this.nome = nome;
    this.numero = numero;
    this.TempoServico = 2;
    this.subordinados = new ArrayList<>();
  }

  public int getINumero() {
    return numero;
  }

  public Sargento getImediato() {
    return imediato;
  }

  public String getNome() {
    return nome;
  }

  public List<Soldado> getSubordinados() {
    return Collections.unmodifiableList(subordinados);
  }

  public int getTempoServico() {
    return TempoServico;
  }

  public void addSubordinados(Soldado imediato) {
    Soldado.imediato(this);
    if (!this.subordinados.contains(imediato)) {
      subordinados.add(imediato);
    }

  }
}