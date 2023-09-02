
public class Animal {
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean carteiravacinacao() {
        return carteiravacinacao;
    }

    public void setCarteiravacinacao(boolean carnivoro) {
        this.carteiravacinacao = carteiravacinacao;
    }
}

}
    public Animal(String nome, String especie, int idade, String habitat, boolean carnivoro) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.habitat = habitat;
        this.carteiravacinacao = carteiravacinacao;
    }