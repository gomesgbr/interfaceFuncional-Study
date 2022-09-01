package entities;

public class Aluno {
    
    private String nome;
    private Double media;
    private Boolean status;

    public Aluno(){

    }

    public Aluno(String nome, double media, Boolean status) {
        this.nome = nome;
        this.media = media;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "\nAluno [media=" + media + ", nome=" + nome + ", status=" + status + "] ";
    }

    
    
}
