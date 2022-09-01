package entities;

public class Aluno {
    
    private String nome;
    private Double nota;
    private Boolean status;

    public Aluno(){

    }

    public Aluno(String nome, Double nota, Boolean status) {
        this.nome = nome;
        this.nota = nota;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }


    
}
