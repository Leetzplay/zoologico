public class Visitante {
    public Visitante(String nome, int idade, String tipoIngresso, boolean guiaTuristico, boolean possuiMapa) {
        this.nome = nome;
        this.idade = idade;
        this.tipoIngresso = tipoIngresso;
        this.guiaTuristico = guiaTuristico;
        this.possuiMapa = possuiMapa;
    }

    private String nome;
    private int idade;
    private String tipoIngresso;
    private boolean guiaTuristico;
    private boolean possuiMapa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    public boolean isGuiaTuristico() {
        return guiaTuristico;
    }

    public void setGuiaTuristico(boolean guiaTuristico) {
        this.guiaTuristico = guiaTuristico;
    }

    public boolean isPossuiMapa() {
        return possuiMapa;
    }

    public void setPossuiMapa(boolean possuiMapa) {
        this.possuiMapa = possuiMapa;
    }
}