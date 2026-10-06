public class Disciplina {

    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;

    public Disciplina(String nomeDisciplina) {
    this.nomeDisciplina = nomeDisciplina;
    this.notas = new double[] {0,0,0,0};
    this.horasEstudo = 0;
    }
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }
    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota-1] = valorNota;
    }
    public boolean aprovado() {
        double media = (this.notas[0] + this.notas[1] +
                this.notas[2] + this.notas[3]) / 4;

        return media >= 7.0;
    }
}
