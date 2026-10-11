/**
 * Representa uma disciplina cursada pelo aluno.
 *
 * @author Lavínia Almeida Nogueira Pereira Soares
 */
public class Disciplina {

    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;
    private int[] pesos;

    /**
     * Cria uma disciplina com quatro notas e pesos iguais a 1.
     *
     * @param nomeDisciplina nome da disciplina
     */
    public Disciplina(String nomeDisciplina) {
    this.nomeDisciplina = nomeDisciplina;
    this.notas = new double[4];
    this.horasEstudo = 0;
    this.pesos = new int[] {1,1,1,1};
    }

    /**
     * Cria uma disciplina com a quantidade de notas especificada,
     * atribuindo peso 1 a cada nota.
     *
     * @param nomeDisciplina nome da disciplina
     * @param qntNotas quantidade de notas da disciplina
     */
    public Disciplina(String nomeDisciplina, int qntNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[qntNotas];
        this.pesos = new int[qntNotas];

        for (int i = 0; i < qntNotas; i++) {
            this.pesos[i] = 1;
        }
    }
    /**
     * Cria uma disciplina com a quantidade de notas e os pesos
     * especificados para o cálculo da média ponderada.
     *
     * @param nomeDisciplina nome da disciplina
     * @param qntNotas quantidade de notas da disciplina
     * @param pesos array com os pesos correspondentes a cada nota
     */
    public Disciplina(String nomeDisciplina, int qntNotas, int[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[qntNotas];
        this.pesos = pesos;
    }

    /** Cadastra horas de estudo.
     *
     * @param horas quantidade de horas a cadastrar.
     */
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    /**
     * Cadastra uma nota.
     * @param nota número da nota de 1 a 4.
     * @param valorNota valor da nota.
     */
    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota-1] = valorNota;
    }

    /**
     * Verifica se o aluno foi aprovado.
     * @return true se a média for maior ou igual a 7
     */
    public boolean aprovado() {
        double soma = 0;
        int pesosTotal = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i] * pesos[i];
            pesosTotal += pesos[i];
        }
        double media = soma / pesosTotal;

        return media >= 7.0;
    }
    /**
     * Retorna a representação da disciplina.
     *
     * @return nome, horas de estudo, média e notas.
     */
    @Override
    public String toString() {
        double somaPonderada = 0;
        int somaPesos = 0;
        String resultadoNotas = "[";

        for (int i = 0; i < notas.length; i++) {
            somaPonderada += notas[i] * pesos[i];
            somaPesos += pesos[i];

            resultadoNotas += notas[i];

            if (i < notas.length - 1) {
                resultadoNotas += ", ";
            }
        }

        resultadoNotas += "]";

        double media = somaPonderada / somaPesos;

        return this.nomeDisciplina + " "
                + this.horasEstudo + " "
                + media + " "
                + resultadoNotas;
    }
}
