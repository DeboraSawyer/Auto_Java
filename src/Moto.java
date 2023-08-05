public class Moto extends Piloto {
    private String modelo;

    public Moto(String nome, int idade, int nivelHabilidade, String modelo) {
        super(nome, idade, nivelHabilidade);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void acelerar() {
        System.out.println("Moto acelerando!");
    }

    public void frear() {
        System.out.println("Moto freando!");
    }
}