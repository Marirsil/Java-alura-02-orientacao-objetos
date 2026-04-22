public class Exercicios1 {
    public static void main(String[] args) {
        testarPessoa();
        System.out.println("--------------");
        testarCalculo();
        System.out.println("--------------");
        testarMusica();
        System.out.println("--------------");
        testarCarro();
        System.out.println("--------------");
        testarAluno();
    }

    public static void testarPessoa() {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Mariana";
        pessoa1.saldacao();
    }

    public static void testarCalculo() {
        Calculadora calcula = new Calculadora();
        calcula.num1 = 10;

        System.out.println(calcula.retornaDobro());
    }

    public static void testarMusica() {
        Musica musica1 = new Musica();
        musica1.titulo = "Angelina";
        musica1.artista = "WIU";
        musica1.anoLancamento = 2020;

        musica1.adicionarAvaliacao(5);
        musica1.adicionarAvaliacao(10);
        musica1.adicionarAvaliacao(8);

        musica1.exibirFicha();
    }

    public static void testarCarro() {
        Carro carro1 = new Carro();
        carro1.modelo = "T-Cross (Volkswagen)";
        carro1.cor = "Prata";
        carro1.ano = 2022;

        carro1.retornaFichaTecnica();
        System.out.println("Fazem "+ carro1.retornaIdade(2026) + " anos de lançamento deste modelo");
    }

    public static void testarAluno(){
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Mariana";
        aluno1.idade = 19;

        aluno1.exibirInformacoes();
    }
}
