import br.alura.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Maze runner");
        meuFilme.setAnoLancamento(2018);
        meuFilme.setDuracaoMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
//        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println("Total de avaliacoes: " + meuFilme.getTotalAvaliacao());
        System.out.println(meuFilme.pegaMedia());
    }
}