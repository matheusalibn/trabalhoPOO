public class Atleta extends Pessoa {
    // Atributo específico da subclasse
    private String esportePraticado;

    // Construtor
    public Atleta(String nome, double peso, double altura, String esportePraticado) {
        super(nome, peso, altura);
        this.esportePraticado = esportePraticado;
    }

    // Getter específico da subclasse
    public String getEsportePraticado() {
        return esportePraticado;
    }

    // Setter específico da subclasse
    public void setEsportePraticado(String esportePraticado) {
        this.esportePraticado = esportePraticado;
    }

    // Sobrescrita do método para calcular o IMC (polimorfismo)
    @Override
    public double calcularIMC() {
        // Reduz o IMC em 5% para atletas
        return super.calcularIMC() * 0.95;
    }
}