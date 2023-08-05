public class Piloto extends Pessoa { // extends: indica que uma classe foi herdada de outra classe.
    private int nivelHabilidade;

    public Piloto(String nome, int idade, int nivelHabilidade) {
        super(nome, idade); // super: variável usada para referenciar o objeto da classe pai.
        this.nivelHabilidade = nivelHabilidade;
    }

    public int getNivelHabilidade() {
        return nivelHabilidade;
    }
}