package aula09.exercicios.chamada;

public abstract class Chamada{
    private String nome;
    private String idade;
    public Chamada(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public String getIdade() {
        return idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(String idade){
        this.idade = idade;
    }

    public abstract String verificar();





}
