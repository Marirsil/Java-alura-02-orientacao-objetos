public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacao;

    void adicionarAvaliacao(double nota){
        avaliacao += nota;
        numAvaliacao ++;
    }

    void exibirFicha(){
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lancamento: " + anoLancamento);
        System.out.println("Média de avaliações: " + String.format("%.2f",exibirMedia()));
    }

    double exibirMedia(){
        if (numAvaliacao == 0){
            return 0;
        } else {
        return avaliacao/numAvaliacao;}
    }
}
