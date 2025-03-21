import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Nome cliente: ");
        String nomeCliente = scan.next();
        System.out.println("Numero telefone: ");
        String telefoneCliente = scan.next();

        System.out.println("\n");

        Cliente cliente = new Cliente(nomeCliente, telefoneCliente);

        Pedido pedido = new Pedido(cliente);

        pedido.addPrato(new Prato("Lasanha", 2.00f));
        pedido.addPrato(new Prato("Pizza", 2.00f));
        pedido.addPrato(new Prato("Hamburger", 2.00f));
        pedido.addPrato(new Prato("Coquinha", 2.00f));
        pedido.addPrato(new Prato("Stogonoff", 2.00f));
        
        pedido.showPedido();

        System.out.println("\n");
        System.out.println("Preco total: " + pedido.getPrecoTotal() + "R$");
    }
}