public class Disciplina {

    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;

    public Disciplina(String nomeDisciplina) {
    this.nomeDisciplina = nomeDisciplina;
    }
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }
    public void cadastraNotas(int nota, double valorNota) {
        this.notas[nota-1] = valorNota;
    }
}
