/**
 * Representa o registro de tempo online dedicado a uma disciplina.
 *
 * @author Lavínia Almeida Nogueira Pereira Soares
 */
public class RegistroTempoOnline {

    private String nomeDisciplina;
    private int tempoOnline;
    private int tempoOnlineEsperado;

    /** Cria um registro com tempo esperado de 120 horas, por padrão.
     *
     * @param nomeDisciplina nome da disciplina.
     */
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnline = 0;
        this.tempoOnlineEsperado = 120;
    }

    /** Cria um registro com tempo esperado específico.
     *
     * @param nomeDisciplina nome da disciplina
     * @param tempoOnlineEsperado tempo online esperado
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnline = 0;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    /** Adiciona temmpo online ao registro.
     *
     * @param tempo tempo que deve ser adicionado.
     */
    public void adicionaTempoOnline(int tempo) {
        this.tempoOnline += tempo;
    }

    /** Verifica se o tempo online esperado foi atingido.
     *
     * @return true caso o tempo online seja maior ou igual ao tempo esperado.
     */
    public boolean atingiuMetaTempoOnline() {
        return tempoOnline >= tempoOnlineEsperado;
    }

    /** Retorna a representação do registro.
     *
     * @return nome da disciplina, tempo utilizado e tempo esperado.
     */
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.tempoOnline + "/" + this.tempoOnlineEsperado;
    }

}
