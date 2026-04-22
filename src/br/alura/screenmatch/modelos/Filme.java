package br.alura.screenmatch.modelos;

public class Filme {
     private String nome;
     private int anoLancamento;
     private boolean incluidoPlano;
     private double somaDasAvaliacoes;
     private int totalAvaliacao;
     private int duracaoMinutos;

//     public int getAnoLancamento(){
//          return anoLancamento;
//     }

     public int getTotalAvaliacao(){
          return totalAvaliacao;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public void setAnoLancamento(int anoLancamento) {
          this.anoLancamento = anoLancamento;
     }

     public void setIncluidoPlano(boolean incluidoPlano) {
          this.incluidoPlano = incluidoPlano;
     }

     public void setDuracaoMinutos(int duracaoMinutos) {
          this.duracaoMinutos = duracaoMinutos;
     }

     public void exibeFichaTecnica(){
          System.out.println("Nome do filme: "+ nome);
          System.out.println("Ano de lancamento: "+ anoLancamento);
     }

     public void avalia(double nota){
          somaDasAvaliacoes += nota;
          totalAvaliacao ++;
     }

     public double pegaMedia(){
          return somaDasAvaliacoes/totalAvaliacao;
     }
}



