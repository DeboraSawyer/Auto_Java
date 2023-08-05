public class Main {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro("Dominic", 30, 70, "lamborghini");
        Moto moto = new Moto("Let", 25, 60, "Harley Davidson");

        System.out.println("Piloto de Carro: " + carro.getNome() + ", Habilidade: " + carro.getNivelHabilidade()
                + ", Modelo: " + carro.getModelo());
        carro.acelerar();
        carro.frear();

        System.out.println("Piloto de Moto: " + moto.getNome() + ", Habilidade: " + moto.getNivelHabilidade()
                + ", Modelo: " + moto.getModelo());
        moto.acelerar();
        moto.frear();
    }
}