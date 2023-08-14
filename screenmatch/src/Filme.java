/*
- Conversão de código que ja aprendemos?
-Nomenclatura de classe Filme(), o objetivo da classe é especificar o conteúdo de um objeto
(o que são comuns na classe filme)
Dúvidas:

Primeiro adiciono os atributos na minha classe depois manipulo eles com meus métodos?

*/
public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibiFichaTecnica() {
        System.out.println("Nome do filme:" + nome);
        System.out.println("Ano de lançamento:" + anoDeLancamento);
        System.out.println("Duração em minutos:"+ duracaoEmMinutos);
        System.out.println("incluído no plano:" +incluidoNoPlano);
    }
    void avalia(double nota){
        somaDasAvaliacoes+= nota;
        totalDeAvaliacoes++;
    }
    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}