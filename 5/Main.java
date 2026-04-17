public class Main {
    public static void main(String[] args) {

        // ---------- Rodas ----------
        Roda roda1 = new Roda(17.0, "Liga Leve", "Prata");
        Roda roda2 = new Roda(16.0, "Aço", "Preto");
        Roda roda3 = new Roda(18.0, "Liga Leve", "Grafite");
        Roda roda4 = new Roda(15.0, "Aço", "Branco");

        // ---------- Carros ----------
        Carro carro1 = new Carro("Toyota", "Corolla", "Branco");
        carro1.adicionarRoda(roda1);
        carro1.adicionarRoda(roda1.copiar());
        carro1.adicionarRoda(roda1.copiar());
        carro1.adicionarRoda(roda1.copiar());

        Carro carro2 = new Carro("Honda", "Civic", "Prata");
        carro2.adicionarRoda(roda2);
        carro2.adicionarRoda(roda2.copiar());
        carro2.adicionarRoda(roda2.copiar());
        carro2.adicionarRoda(roda2.copiar());

        Carro carro3 = new Carro("Toyota", "Hilux", "Preto");
        carro3.adicionarRoda(roda3);
        carro3.adicionarRoda(roda3.copiar());
        carro3.adicionarRoda(roda3.copiar());
        carro3.adicionarRoda(roda3.copiar());

        Carro carro4 = new Carro("Ford", "Ka", "Vermelho");
        carro4.adicionarRoda(roda4);
        carro4.adicionarRoda(roda4.copiar());
        carro4.adicionarRoda(roda4.copiar());
        carro4.adicionarRoda(roda4.copiar());

        // ---------- Proprietários ----------
        Proprietario p1 = new Proprietario("Carlos Silva", "123.456.789-00", "carlos@email.com");
        p1.adicionarCarro(carro1);   // Toyota Corolla
        p1.adicionarCarro(carro2);   // Honda Civic

        Proprietario p2 = new Proprietario("Ana Souza", "987.654.321-00", "ana@email.com");
        p2.adicionarCarro(carro3);   // Toyota Hilux
        p2.adicionarCarro(carro4);   // Ford Ka

        // ---------- Impressão ----------
        System.out.println("===== PROPRIETÁRIO 1 =====");
        System.out.println(p1);

        System.out.println("===== PROPRIETÁRIO 2 =====");
        System.out.println(p2);

        // ---------- Comparação de fabricantes ----------
        System.out.println("===== COMPARAÇÃO DE FABRICANTES =====");

        boolean fabricanteIgual = false;
        for (Carro c1 : p1.getCarros()) {
            if (p2.possuiCarroDe(c1.getFabricante())) {
                fabricanteIgual = true;
                System.out.printf("Fabricante em comum: %s%n", c1.getFabricante());
            }
        }

        if (fabricanteIgual) {
            System.out.printf("%s e %s possuem carros do MESMO fabricante.%n",
                    p1.getNome(), p2.getNome());
        } else {
            System.out.printf("%s e %s NÃO possuem carros do mesmo fabricante.%n",
                    p1.getNome(), p2.getNome());
        }
    }
}
