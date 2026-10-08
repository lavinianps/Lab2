/**
 *Representa a rotina de descanso de uma aluno.
 *
 * @author Lavínia Almeida Nogueira Pereira Soares
 */
public class Descanso {

    private int horasDescanso;
    private int numeroSemanas;

    public void Descanso() {
        this.horasDescanso = 0;
        this.numeroSemanas = 0;
    }

    /**
     * Define a quantidade de horas de descanso.
     *
     * @param horas é a quantidade de horas de descanso.
     */
    public void defineHorasDescanso(int horas) {
        this.horasDescanso = horas;
    }

    /**
     * Define a quantidade de semanas.
     *
     * @param semanas quantidade de semanas.
     */
    public void defineNumeroSemanas(int semanas) {
        this.numeroSemanas = semanas;
    }

    /**
     * Verifica se o aluno está cansado.
     *
     * @return "descansado" se a média de horas de descanso por semana for no mínimo 26 horas, e "cansado" caso não seja.
     */
    public String getStatusGeral() {
        if (numeroSemanas == 0) {
            return "cansado";
        } if (horasDescanso / numeroSemanas >= 26) {
            return "descansado";
        } else {
            return "cansado";
        }
    }
}
