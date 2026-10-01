public class Descanso {

    private int horasDescanso;
    private int numeroSemanas;

    public void Descanso() {
        horasDescanso = 0;
        numeroSemanas = 0;
    }
    public void defineHorasDescanso(int horas) {
        numeroSemanas = horas;
    }
    public void defineNumeroSemanas(int semanas) {
        numeroSemanas = semanas;
    }
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
