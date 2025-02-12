
package classes;

public class Carro extends Veiculo {
    private final String modelo;

    public Carro(String marca, int ano, String modelo) {
        super(marca, ano);
        this.modelo = modelo;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Modelo: " + this.modelo);
    }
}
