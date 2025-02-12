package classes;
public class Veiculo {
    private final String marca;
    private final int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public void exibirInfo() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.ano);
    }
}
