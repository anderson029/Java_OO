/*PSVM - atalho para inserir public static void main
 *
 */
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());

        System.out.println("-----------------------------------");

        Filme favorito = new Filme();
        favorito.nome = "Toy Story";
        favorito.anoDeLancamento = 1970;
        favorito.duracaoEmMinutos = 180;
        favorito.incluidoNoPlano = true;
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        favorito.exibiFichaTecnica();
        System.out.println(favorito.nome);
        System.out.println("Média de avaliações do filme:" +favorito.pegaMedia());
    }
}


