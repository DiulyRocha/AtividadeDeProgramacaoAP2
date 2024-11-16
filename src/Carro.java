public class Carro extends Veiculo {
    public int numeroPortas;

    // Implementando o método informacoesVeiculo
    @Override
    public String informacoesVeiculo() {
        return "Carro: Marca = " + marca + ", Modelo = " + modelo + ", Ano = " + getAno() + ", Número de Portas = " + numeroPortas;
    }
}
