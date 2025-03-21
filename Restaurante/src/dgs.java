import java.util.Scanner;

public class dgs {
    import java.util.ArrayList;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            Restaurante restaurante = new Restaurante();
            restaurante.addPratoDisponivel(new Prato("Lasanha", 2.00f));
            restaurante.addPratoDisponivel(new Prato("Pizza", 2.00f));
            restaurante.addPratoDisponivel(new Prato("Hamburger", 2.00f));
            restaurante.addPratoDisponivel(new Prato("Coquinha", 2.00f));
            restaurante.addPratoDisponivel(new Prato("Stogonoff", 2.00f));

            System.out.println("Nome cliente: ");
            String nomeCliente = scan.next();
            System.out.println("Numero telefone: ");
            String telefoneCliente = scan.next();
            System.out.println("\n");

            Cliente cliente = new Cliente(nomeCliente, telefoneCliente);
            Pedido pedido = new Pedido(cliente);

            boolean running = true;
            int opcao = 0;
            while (running)
            {
                System.out.println("(1): ");
                opcao = scan.nextInt();
                System.out.println("\n");

                if (opcao == 1)
                {

                }

                System.out.println("\n");
                System.out.println("Preco total: " + pedido.getPrecoTotal() + "R$");
            }
        }
    }

}
