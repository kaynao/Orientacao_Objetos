import java.util.ArrayList;
import java.util.List;

public class Gerenciador {
    private List<Artista> artistas;

    public Gerenciador() {
        this.artistas = new ArrayList<>();
    }

    // Adiciona artista com cópia defensiva
    public void adicionarArtista(Artista artista) {
        this.artistas.add(artista.copiar());
    }

    public List<Artista> getArtistas() {
        List<Artista> copia = new ArrayList<>();
        for (Artista a : artistas) {
            copia.add(a.copiar());
        }
        return copia;
    }

    // Retorna o artista com maior número de álbuns
    public Artista artistaComMaisAlbuns() {
        if (artistas.isEmpty()) return null;

        Artista maior = artistas.get(0);
        for (Artista a : artistas) {
            if (a.totalAlbuns() > maior.totalAlbuns()) {
                maior = a;
            }
        }
        return maior.copiar();
    }

    // Retorna o álbum com maior quantidade de músicas (varre todos os artistas)
    public Album albumComMaisMusicas() {
        Album maior = null;

        for (Artista artista : artistas) {
            for (Album album : artista.getAlbuns()) {
                if (maior == null || album.totalMusicas() > maior.totalMusicas()) {
                    maior = album.copiar();
                }
            }
        }
        return maior;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Gerenciador[artistas=%d]%n", artistas.size()));
        for (Artista a : artistas) {
            sb.append(a);
        }
        return sb.toString();
    }
}
