public class Main {
    public static void main(String[] args) {
        // Inserindo um Carro
        Carro carro = new Carro();
        carro.marca = "Toyota";
        carro.modelo = "Corolla";
        carro.setAno(2022);
        carro.numeroPortas = 4;

        // Inserindo uma Moto
        Moto moto = new Moto();
        moto.marca = "Honda";
        moto.modelo = "CB500";
        moto.setAno(2021);
        moto.setCilindrada(500);

        // Imprimindo as informações dos veículos
        System.out.println(carro.informacoesVeiculo());
        System.out.println(moto.informacoesVeiculo());
    }
}
