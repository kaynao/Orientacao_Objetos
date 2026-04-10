import java.util.Scanner;

public class Main {

    public static Pedido criarPedido(Scanner leitor) {
        System.out.print("Nome do produto: ");
        String nome = leitor.nextLine();

        System.out.print("Categoria do produto: ");
        String categoria = leitor.nextLine();

        System.out.print("Preço unitário: ");
        double preco = Double.parseDouble(leitor.nextLine());

        Produto produto = new Produto(nome, categoria, preco);

        System.out.print("Número do pedido: ");
        int numero = Integer.parseInt(leitor.nextLine());

        System.out.print("Data do pedido (dd/MM/yyyy): ");
        String data = leitor.nextLine();

        System.out.print("Quantidade: ");
        double quantidade = Double.parseDouble(leitor.nextLine());

        return new Pedido(numero, data, quantidade, produto);
    }

    public static void main(String[] args) {

        // Cria um produto
        Produto p1 = new Produto("Teclado Mecânico", "Informática", 350.00);

        // Cria um pedido associado ao produto
        Pedido pedido1 = new Pedido(1001, "16/03/2026", 3, p1);

        // Calcula e exibe o total
        System.out.println(pedido1);
        System.out.println("Total do pedido: R$" + pedido1.calcularTotal());

        System.out.println("\n--- Cadastro de novo pedido ---");

        // Exemplo preenchido pelo usuário
        Scanner leitor = new Scanner(System.in);
        Pedido pedido2 = criarPedido(leitor);
        System.out.println(pedido2);
        System.out.println("Total do pedido: R$" + pedido2.calcularTotal());

        leitor.close();
    }
}
