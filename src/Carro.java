public class Carro extends Piloto {
    private String modelo;

    public Carro(String nome, int idade, int nivelHabilidade, String modelo) {
        super(nome, idade, nivelHabilidade);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void acelerar() {
        System.out.println("Carro acelerando!");
    }

    public void frear() {
        System.out.println("Carro freando!");
    }
}