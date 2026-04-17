import java.util.ArrayList;
import java.util.List;

public class Album {
    private String nome;
    private int anoLancamento;
    private List<Musica> musicas;

    // Construtor completo
    public Album(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.musicas = new ArrayList<>();
    }

    // Construtor de cópia (delegação)
    public Album(Album outro) {
        this(outro.nome, outro.anoLancamento);
        for (Musica m : outro.musicas) {
            this.musicas.add(m.copiar());         // cópia defensiva
        }
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getAnoLancamento() { return anoLancamento; }
    public void setAnoLancamento(int anoLancamento) { this.anoLancamento = anoLancamento; }

    public List<Musica> getMusicas() {
        // Cópia defensiva (abordagem 03 — delegação)
        List<Musica> copia = new ArrayList<>();
        for (Musica m : musicas) {
            copia.add(m.copiar());
        }
        return copia;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = new ArrayList<>();
        for (Musica m : musicas) {
            this.musicas.add(m.copiar());         // cópia defensiva
        }
    }

    // Adiciona música com cópia defensiva
    public void adicionarMusica(Musica musica) {
        this.musicas.add(musica.copiar());
    }

    // Retorna a quantidade de músicas
    public int totalMusicas() {
        return musicas.size();
    }

    // Copiar (delegação)
    public Album copiar() {
        return new Album(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("  Album[nome=%s, ano=%d, musicas=%d]%n",
                nome, anoLancamento, musicas.size()));
        for (Musica m : musicas) {
            sb.append("    ").append(m).append("\n");
        }
        return sb.toString();
    }
}
