import java.util.ArrayList;

public class Restaurante {
    private String nome = "Pè na fava";
    private ArrayList<Prato> pratosDisponiveis;

    public void addPratoDisponivel(Prato prato)
    {
        this.pratosDisponiveis.add(prato);
    }

    public void showPratosDisponiveis()
    {
        for (int i = 0; i < pratosDisponiveis.size(); i++)
        {
            pratosDisponiveis.get(i).showPrato();
        }
    }
}
