public class Main {
    public static void main(String[] args) {
        // Instancia um objeto do tipo Pessoa
        Pessoa pessoaComum = new Pessoa("Ana", 70.0, 1.75);

        // Instancia um objeto do tipo Atleta (usando a subclasse)
        Atleta atleta = new Atleta("Pedro", 85.0, 1.80, "Futebol");

        // Polimorfismo: o mesmo método é chamado, mas o comportamento é diferente
        // para cada tipo de objeto.
        // IMC de uma pessoa comum
        double imcPessoa = pessoaComum.calcularIMC();

        // IMC do atleta (o método sobrescrito será executado)
        double imcAtleta = atleta.calcularIMC();

        // Exibe os resultados no console
        System.out.println("--- Cálculo do IMC ---");
        System.out.printf("Nome: %s\n", pessoaComum.getNome());
        System.out.printf("IMC de uma pessoa comum: %.2f\n\n", imcPessoa);

        System.out.printf("Nome: %s\n", atleta.getNome());
        System.out.printf("Esporte praticado: %s\n", atleta.getEsportePraticado());
        System.out.printf("IMC de um atleta (ajustado em 5%%): %.2f\n", imcAtleta);
    }
}