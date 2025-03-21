public class Cliente {
    private String nome;
    private String telefone;

    public Cliente (String nome, String telefone)
    {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void showCliente()
    {
        System.out.println("Nome cliente: " + nome + " - Telefone: " + telefone);
    }

    public String getNome()
    {
        return nome;
    }
    public String getTelefone()
    {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
