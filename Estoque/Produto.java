package Estoque;

public class Produto {
    public String nome = "bicicleta";
    public double valor = 2000;
    public int quantidade = 100;

    public double valorTotalNoStock(){
        return quantidade * valor;
    }
    public void addProdutos(int quantidade){ //Não retorna nada, apenas informa que a
                                            // variavel quantidade será alterada e da os parametros dessa alteração
        this.quantidade += quantidade; // o this. quantidade serve para dizer que o valor quantidade
                                        // que está sendo usado é o da variavel e não o dentro do parenteses
    }
    public void removerProdutos(int quantidade){
        this.quantidade -= quantidade;
    }
    public String toString(){
        return nome + ", quantidade: " + String.format("%d", quantidade) + ", valor: " + valor + ", valor total: "
                + String.format("%.2f", valorTotalNoStock()); // se no print eu escrever o nome da variável "produto",
                          // aparecerá os parametros definidos no toString
    }
}
