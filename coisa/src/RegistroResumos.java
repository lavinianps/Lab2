public class RegistroResumos {
    private int numeroDeResumos;
    private String[] temas;
    private String[] conteudos;
    private int proximo;

    public RegistroResumos(int numeroDeResumos) {
        this.numeroDeResumos = numeroDeResumos;
        this.temas = new String[numeroDeResumos];
        this.conteudos = new String[numeroDeResumos];
        this.proximo = 0;
    }

    public void adicionaResumo(String tema, String conteudo) {
        if (!temResumo(tema)) {
            this.temas[proximo] = tema;
            this.conteudos[proximo] = conteudo;

            proximo = (proximo + 1) % numeroDeResumos;
        }
    }

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

    public String imprimeResumos() {
        String resultado = "";

        for (int i = 0; i < numeroDeResumos; i++) {
            if (temas[i] != null) {
                resultado += temas[i] + ": " + conteudos[i] + "\n";
            }
        }

        return resultado;
    }

    public int contaResumos() {
        int quantidade = 0;

        for (int i = 0; i < numeroDeResumos; i++) {
            if (temas[i] != null) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public boolean temResumo(String tema) {
        for (int i = 0; i < numeroDeResumos; i++) {
            if (tema.equals(temas[i])) {
                return true;
            }
        }
        return false;
    }
}
