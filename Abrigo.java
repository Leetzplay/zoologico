public class Abrigo {

    private String nomeAbrigo;
    private int capacidademaxima;
    private int quantidadeAnimais;
    private String tipoAbrigo;
    private boolean clima;

    public String getNomeAbrigo() {
        return nomeAbrigo;
    }
    public void setNomeAbrigo(String nomeAbrigo) {
        this.nomeAbrigo = nomeAbrigo;
    }

    public int getCapacidade() {
        return capacidademaxima;
    }
    public void setCapacidademaxima(int capacidademaxima) {
        this.capacidademaxima = capacidademaxima;
    }

    public int getQuantidadeAnimais() {
        return quantidadeAnimais;
    }
    public void setQuantidadeAnimais(int quantidadeAnimais) {
        this.quantidadeAnimais = quantidadeAnimais;
    }

    public String getTipoAbrigo() {
        return tipoAbrigo;
    }
    public void setTipoAbrigo(String tipoAbrigo) {
        this.tipoAbrigo = tipoAbrigo;
    }

    public boolean isClima() {
        return clima;
    }

    public void setClima(boolean clima) {
        this.clima = clima;
    }
}
}
    public Abrigo(String nomeAbrigo, int capacidademaxima, int quantidadeAnimais, String tipoAbrigo, boolean aquecido) {
        this.nomeAbrigo = nomeAbrigo;
        this.capacidademaxima = capacidade;
        this.quantidadeAnimais = quantidadeAnimais;
        this.tipoAbrigo = tipoAbrigo;
        this.clima = clima;
    }
