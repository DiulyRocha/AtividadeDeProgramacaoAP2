public class Moto extends Veiculo {
    private int cilindrada;

    // Implementando do método informacoesVeiculo
    @Override
    public String informacoesVeiculo() {
        return "Moto: Marca = " + marca + ", Modelo = " + modelo + ", Ano = " + getAno() + ", Cilindrada = " + cilindrada;
    }

    // Métodos de acesso para incluir cilindrada
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
