/**
 * Representa um registro de resumos de estudo.
 *
 * @author Lavínia Almeida Nogueira Pereira Soares
 */
public class RegistroResumos {
    private int numeroDeResumos;
    private Resumo[] resumos;
    private int proximo;

    /**
     * Cria um registro de resumos.
     * @param numeroDeResumos quantidade máxima de resumos.
     */
    public RegistroResumos(int numeroDeResumos) {
        this.numeroDeResumos = numeroDeResumos;
        this.resumos = new Resumo[numeroDeResumos];
        this.proximo = 0;
    }

    /**
     * Adiciona um resumo ao registro.
     * @param tema tema do resumo.
     * @param conteudo conteúdo do resumo.
     */
    public void adiciona(String tema, String conteudo) {
        if (proximo < numeroDeResumos) {
            resumos[proximo] = new Resumo(tema, conteudo);
            proximo ++;
        }
    }

    /**
     * Retorna os rasumos cadastrados no formato "tema: conteúdo"
     * @return vetor de resumos.
     */
    public String[] pegaResumos() {
        String[] resultado = new String[contaResumos()];

        int indice = 0;

        for (int i = 0; i < numeroDeResumos; i++) {
            if (this.resumos[i] != null) {
                resultado[indice] = this.resumos[i].getTema() + ": " + this.resumos[i].getConteudo();
                indice++;
            }
        }

        return resultado;
    }

    /**
     * Retorna uma representação dos resumos cadastrados.
     *
     * @return quantidade de resumos e seus temas.
     */
    public String imprimeResumos() {
        String resultado = "- " + contaResumos()
                + " resumo(s) cadastrado(s)\n- ";

        for (int i = 0; i < proximo; i++) {
            resultado += resumos[i].getTema();

            if (i < proximo - 1) {
                resultado += " | ";
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
            if (resumos[i] != null) {
                quantidade++;
            }
        }

        return quantidade;
    }

    /** Verifica se existe um resumo com um tema escolhido.
     *
     * @param resumo resumo a ser procurado.
     * @return true caso exista esse resumo.
     */
    public boolean temResumo(String tema) {
        for (int i = 0; i < numeroDeResumos; i++) {
            if (resumos[i] != null && resumos[i].getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }
    public String[] busca(String chaveDeBusca) {
        String chave = chaveDeBusca.toLowerCase();
        String[] encontrados = new String[proximo];
        int quantidade = 0;

        for (int i = 0; i < proximo; i++) {
            if (resumos[i].getConteudo().toLowerCase().contains(chave)) {
                encontrados[quantidade] = resumos[i].getTema();
                quantidade++;
            }
        }

        encontrados = java.util.Arrays.copyOf(encontrados, quantidade);
        java.util.Arrays.sort(encontrados);

        return encontrados;
    }
}
