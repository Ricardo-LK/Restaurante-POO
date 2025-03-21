import java.util.ArrayList;

public class Pedido {
    private Cliente cliente;
    private ArrayList<Prato> pratos;
    float precoTotal;

    public Pedido(Cliente cliente, ArrayList<Prato> pratos)
    {
        this.cliente = cliente;
        this.pratos = pratos;
    }

    public Pedido(Cliente cliente)
    {
        this.cliente = cliente;
        this.pratos = new ArrayList<>();
    }

    public void showPedido()
    {
        cliente.showCliente();
        System.out.println("\n");

        for (int i = 0; i < pratos.size(); i++)
        {
            pratos.get(i).showPrato();
        }
    }

    public void addPrato(Prato prato)
    {
        this.pratos.add(prato);
        calcPrice(prato);
    }
    public void removePrato(String nomePrato)
    {
        for (int i = 0; i < pratos.size(); i++)
        {
            if (nomePrato.equalsIgnoreCase(pratos.get(i).getNome()))
            {
                pratos.remove(pratos.get(i));
            }
        }
    }
    public void calcPrice(Prato prato)
    {
        this.precoTotal += prato.getPreco();
    }

    public Cliente getCliente() {
        return cliente;
    }
    public ArrayList<Prato> getPratos() {
        return pratos;
    }
    public String getPrecoTotal() {
        return String.format("%.2f", precoTotal);
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setPratos(ArrayList<Prato> pratos) {
        this.pratos = pratos;
    }
}
