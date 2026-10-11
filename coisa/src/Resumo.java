/**
 * Representa um resumo com tema e conteúdo.
 *
 * @author Lavínia Almeida Nogueira Pereira Soares
 */
public class Resumo {

    private String tema;
    private String conteudo;
    /**
     * Cria um resumo com o tema e o conteúdo especificados.
     *
     * @param tema tema do resumo
     * @param conteudo conteúdo do resumo
     */
    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }
    /**
     * Retorna o tema do resumo.
     *
     * @return tema do resumo
     */
    public String getTema() {
        return this.tema;
    }
    /**
     * Retorna o conteúdo do resumo.
     *
     * @return conteúdo do resumo
     */
    public String getConteudo() {
        return this.conteudo;
    }
}
