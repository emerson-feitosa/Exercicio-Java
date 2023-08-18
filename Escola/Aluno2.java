package Escola;

public class Aluno2 {
    private String nomeAluno;
    private  double primeiraNota;
    private double segundaNota;

    public Aluno2(String nomeAluno, double primeiraNota, double segundaNota){
        this.nomeAluno = nomeAluno;
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
    }
    public double media(){
        return (primeiraNota + segundaNota) / 2;
    }
    public String getNomeAluno(){
        return nomeAluno;
    }
    public double getPrimeiraNota(){
        return primeiraNota;
    }

    public double getSegundaNota() {
        return segundaNota;
    }
}

