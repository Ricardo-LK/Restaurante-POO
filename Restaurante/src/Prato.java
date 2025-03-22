public class Prato {
    private String nome;
    private float preco;

    public Prato(String nome, float preco)
    {
        this.nome = nome;
        this.preco = preco;
    }

    public Prato(String nome)
    {
        this.nome = nome;
    }

    public void showPrato()
    {

        System.out.println("Nome prato: " + nome + " - preco: " + String.format("%.2f", preco) + "R$");
    }

    public String getNome() {
        return nome;
    }
    public float getPreco() {
        return preco;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
