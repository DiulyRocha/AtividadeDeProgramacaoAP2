public abstract class Veiculo {
    public String marca;
    public String modelo;
    private int ano;

    // Métodos de acesso para o atributo ano
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método abstrato que deve ser implementado nas classes filhas
    public abstract String informacoesVeiculo();
}
