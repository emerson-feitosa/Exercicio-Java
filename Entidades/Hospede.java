package Entidades;

public class Hospede {

    private String nome;
    private String email;




    public Hospede(String nome, String email){
        this.nome = nome;
        this.email = email;



    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }



    public String toString(){
       return    getNome() + ", " + getEmail();
    }


}
