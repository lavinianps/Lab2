/**
 * Representa uma disciplina cursada pelo aluno
 *
 * @author Lavínia Almeida Nogueira Pereira Soares
 */
public class Disciplina {

    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;

    /**
     * Cria uma disciplina
     *
     * @param nomeDisciplina nome da disciplina.
     */
    public Disciplina(String nomeDisciplina) {
    this.nomeDisciplina = nomeDisciplina;
    this.notas = new double[] {0,0,0,0};
    this.horasEstudo = 0;
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
        double media = (this.notas[0] + this.notas[1] +
                this.notas[2] + this.notas[3]) / 4;

        return media >= 7.0;
    }
    /**
     * Retorna a representação da disciplina.
     *
     * @return nome, horas de estudo, média e notas.
     */
    public String toString() {
        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
        return this.nomeDisciplina + " " + this.horasEstudo + " " + media + " " + "[" + notas[0] + "," + " " + notas[1] + "," + " " + notas[2] + "," + " " + notas[3] + "]";
    }
}
