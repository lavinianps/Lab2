/**
 * Representa um registro de resumos de estudo.
 *
 * @author Lavínia Almeida Nogueira Pereira Soares
 */
public class RegistroResumos {
    private int numeroDeResumos;
    private String[] temas;
    private String[] conteudos;
    private int proximo;

    /**
     * Cria um registro de resumos.
     * @param numeroDeResumos quantidade máxima de resumos.
     */
    public RegistroResumos(int numeroDeResumos) {
        this.numeroDeResumos = numeroDeResumos;
        this.temas = new String[numeroDeResumos];
        this.conteudos = new String[numeroDeResumos];
        this.proximo = 0;
    }

    /**
     * Adiciona um resumo ao registro.
     * @param tema tema do resumo.
     * @param conteudo conteúdo do resumo.
     */
    public void adiciona(String tema, String conteudo) {
        if (!temResumo(tema)) {
            temas[proximo] = tema;
            conteudos[proximo] = conteudo;

            proximo ++;
        }
    }

    /**
     * Retorna os rasumos cadastrados no formato "tema: conteúdo"
     * @return vetor de resumos.
     */
    public String[] pegaResumos() {
        String[] resumos = new String[contaResumos()];

        int indice = 0;

        for (int i = 0; i < numeroDeResumos; i++) {
            if (temas[i] != null) {
                resumos[indice] = temas[i] + ": " + conteudos[i];
                indice++;
            }
        }

        return resumos;
    }

    /**
     * Retorna uma representação dos resumos cadastrados.
     *
     * @return quantidade de resumos e seus temas.
     */
    public String imprimeResumos() {
        String resultado = "";

        for (int i = 0; i < numeroDeResumos; i++) {
            if (temas[i] != null) {
                resultado += temas[i] + ": " + conteudos[i] + "\n";
            }
        }

        return resultado;
    }

    /**
     * Retorna a quantidade de resumos cadastrados.
     * @return quantidade de resumos.
     */
    public int contaResumos() {
        int quantidade = 0;

        for (int i = 0; i < numeroDeResumos; i++) {
            if (temas[i] != null) {
                quantidade++;
            }
        }

        return quantidade;
    }

    /** Verifica se existe um resumo com um tema escolhido.
     *
     * @param tema tema a ser procurado.
     * @return true caso exista um resumo com o tema.
     */
    public boolean temResumo(String tema) {
        for (int i = 0; i < numeroDeResumos; i++) {
            if (tema.equals(temas[i])) {
                return true;
            }
        }
        return false;
    }
}
