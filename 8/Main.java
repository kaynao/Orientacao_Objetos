public class Main {
    public static void main(String[] args) {

        // -------- Artista 1: The Beatles (3 albuns) --------
        Artista artista1 = new Artista("The Beatles");

        Album abbey = new Album("Abbey Road", 1969);
        artista1.adicionarAlbum(abbey);
        artista1.adicionarMusica("Abbey Road", new Musica("Come Together", 4.19));
        artista1.adicionarMusica("Abbey Road", new Musica("Something", 3.02));
        artista1.adicionarMusica("Abbey Road", new Musica("Here Comes the Sun", 3.05));

        Album letItBe = new Album("Let It Be", 1970);
        artista1.adicionarAlbum(letItBe);
        artista1.adicionarMusica("Let It Be", new Musica("Let It Be", 3.52));
        artista1.adicionarMusica("Let It Be", new Musica("Get Back", 3.11));

        Album helpAlbum = new Album("Help!", 1965);
        artista1.adicionarAlbum(helpAlbum);
        artista1.adicionarMusica("Help!", new Musica("Help!", 2.17));

        // -------- Artista 2: Pink Floyd (2 albuns) --------
        Artista artista2 = new Artista("Pink Floyd");

        Album theWall = new Album("The Wall", 1979);
        artista2.adicionarAlbum(theWall);
        artista2.adicionarMusica("The Wall", new Musica("Another Brick in the Wall", 3.59));
        artista2.adicionarMusica("The Wall", new Musica("Comfortably Numb", 6.22));
        artista2.adicionarMusica("The Wall", new Musica("Hey You", 4.40));
        artista2.adicionarMusica("The Wall", new Musica("Wish You Were Here", 5.34));
        artista2.adicionarMusica("The Wall", new Musica("Shine On", 8.30));

        Album darkSide = new Album("The Dark Side of the Moon", 1973);
        artista2.adicionarAlbum(darkSide);
        artista2.adicionarMusica("The Dark Side of the Moon", new Musica("Money", 6.22));
        artista2.adicionarMusica("The Dark Side of the Moon", new Musica("Time", 7.04));

        // -------- Gerenciador --------
        Gerenciador gerenciador = new Gerenciador();
        gerenciador.adicionarArtista(artista1);
        gerenciador.adicionarArtista(artista2);

        // -------- Impressao completa --------
        System.out.println("========================================");
        System.out.println("         CATALOGO MUSICAL               ");
        System.out.println("========================================");
        System.out.println(gerenciador);

        // -------- Consultas --------
        System.out.println("========================================");
        System.out.println("            CONSULTAS                   ");
        System.out.println("========================================");

        Artista maisAlbuns = gerenciador.artistaComMaisAlbuns();
        System.out.printf("Artista com mais albuns: %s (%d albuns)%n",
                maisAlbuns.getNome(), maisAlbuns.totalAlbuns());

        Album maisMusicas = gerenciador.albumComMaisMusicas();
        System.out.printf("Album com mais musicas : %s (%d musicas)%n",
                maisMusicas.getNome(), maisMusicas.totalMusicas());
    }
}
