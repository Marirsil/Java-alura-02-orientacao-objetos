public class Carro {
    String modelo;
    String cor;
    int ano;

    void retornaFichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }

    int retornaIdade(int anoAtual){
        return anoAtual - ano;
    }
}
