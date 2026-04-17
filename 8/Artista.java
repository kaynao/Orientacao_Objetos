import java.util.ArrayList;
import java.util.List;

public class Artista {
    private String nome;
    private List<Album> albuns;

    // Construtor completo
    public Artista(String nome) {
        this.nome = nome;
        this.albuns = new ArrayList<>();
    }

    // Construtor de cópia (delegação)
    public Artista(Artista outro) {
        this(outro.nome);
        for (Album a : outro.albuns) {
            this.albuns.add(a.copiar());          // cópia defensiva
        }
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public List<Album> getAlbuns() {
        // Cópia defensiva (abordagem 03 — delegação)
        List<Album> copia = new ArrayList<>();
        for (Album a : albuns) {
            copia.add(a.copiar());
        }
        return copia;
    }

    public void setAlbuns(List<Album> albuns) {
        this.albuns = new ArrayList<>();
        for (Album a : albuns) {
            this.albuns.add(a.copiar());          // cópia defensiva
        }
    }

    // Adiciona álbum com cópia defensiva
    public void adicionarAlbum(Album album) {
        this.albuns.add(album.copiar());
    }

    // Adiciona música a um álbum pelo nome (busca internamente)
    public void adicionarMusica(String nomeAlbum, Musica musica) {
        for (Album a : albuns) {
            if (a.getNome().equalsIgnoreCase(nomeAlbum)) {
                a.adicionarMusica(musica);        // delega para o Album
                return;
            }
        }
        System.out.printf("Álbum '%s' não encontrado para o artista '%s'.%n", nomeAlbum, nome);
    }

    // Retorna o total de álbuns
    public int totalAlbuns() {
        return albuns.size();
    }

    // Copiar (delegação)
    public Artista copiar() {
        return new Artista(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Artista[nome=%s, albuns=%d]%n", nome, albuns.size()));
        for (Album a : albuns) {
            sb.append(a);
        }
        return sb.toString();
    }
}
