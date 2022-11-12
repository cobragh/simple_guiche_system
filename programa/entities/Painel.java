package programa.entities;

public class Painel {
    private Integer guiche;
    private String senha;

    public Painel(Integer guiche, String senha) {
        this.guiche = guiche;
        this.senha = senha;
    }

    public Integer getGuiche() {
        return guiche;
    }

    public void setGuiche(Integer guiche) {
        this.guiche = guiche;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String toString(){
        return senha + "\n" + "Guichê " + guiche;
    }
}
