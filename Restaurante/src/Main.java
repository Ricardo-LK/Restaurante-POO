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
            System.out.println("(1) mostrar cardapio - (2) Adicionar prato - (3) Remover prato - (4) Mostrar valor do pedido - (5) Mostrar pedido - (0) Sair");
            opcao = scan.nextInt();
            System.out.println("\n");

            if (opcao == 1)
            {
                restaurante.showPratosDisponiveis();
            }
            else if (opcao == 2)
            {
                System.out.println("Nome do pedido: ")
                String nomePrato = scan.next();

                Prato ordemPrato = new Prato(nomePrato)

                for (int i = 0; i < pratosDisponiveis.size(); i++)
                {
                    String currentPrato=  pratos.get(i)
                    if(nomePrato.equalsIgnoreCase(currentPrato.getNome()))
                    {
                        ordemPrato.setPreco(currentPrato.getPreco)
                        pedido.addPrato(ordemPrato)
                    }
                }
            }
            else if (opcao == 3)
            {
                System.out.println("Nome do pedido: ")
                String nomePrato = scan.next();

                pedido.removePrato(nomePrato);
            }
            else if (opcao == 4)
            {
                System.out.println("\n");
                System.out.println("Preco total: " + pedido.getPrecoTotal() + "R$");        
            }
            else if (opcao == 5)
            {
                pedido.showPedido();
            }
            else
            {
                running = false;
            }
        }
    }
}

