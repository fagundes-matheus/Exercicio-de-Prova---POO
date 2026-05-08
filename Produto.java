package org.ucsalpoo.br;


public class Produto {
    private String nome;
    private int codigo;
    private int quantidade;
    private double preco;

    public Produto(String nome, int codigo, int quantidade, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String exibirInformacoes(){
        String mensagem = "NOME DO PRODUTO: " +this.nome+ "\nCÓDIGO: " +this.codigo+ "\nQUANTIDADE EM ESTOQUE: " +this.quantidade+ "\nPREÇO: " +this.preco;
        return mensagem;
    }

    public boolean saida(int quantidade){
        if(this.quantidade<quantidade){
            System.out.println("ESTOQUE INSUFICIENTE,COLOQUE UM VALOR IGUAL OU ABAIXO DE " +this.quantidade);
            return false;
        }else{
            this.quantidade -=quantidade;
            System.out.println("COMPRA CONCLUÍDA");
            return true;
        }
    }


    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


}
