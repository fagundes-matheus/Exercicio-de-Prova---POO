package org.ucsalpoo.br;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//        FEITO POR MATHEUS FAGUNDES LIMA DE OLIVEIRA E VINICIUS BARBOSA VENEGEROLES DOS SANTOS
        Scanner sc = new Scanner(System.in);
        Produto camiseta = new Produto("Camiseta",1,4,49.90);
        Produto calca = new Produto("Calça",2,2,119.90);
        Produto tenis = new Produto("Tênis Esportivo",3,6,229.90);

        int escolha,quantidade;
        double valorFinal;

        System.out.println("MENU:");
        System.out.println();
        System.out.println(camiseta.exibirInformacoes());
        System.out.println();
        System.out.println(calca.exibirInformacoes());
        System.out.println();
        System.out.println(tenis.exibirInformacoes());
        System.out.println();
        System.out.println("DIGITE O CÓDIGO DO PRODUTO QUE DESEJA COMPRAR:");

        escolha=sc.nextInt();

        switch (escolha){
            case 1:
                System.out.println(camiseta.getNome()+":");
                System.out.println("QUANTIDADE DE ESTOQUE: "+camiseta.getQuantidade());
                System.out.println("PREÇO: " +camiseta.getPreco());
                System.out.println("DIGITE A QUANTIDADE QUE DESEJA COMPRAR:");
                if(camiseta.saida(quantidade=sc.nextInt())){
                    valorFinal= quantidade * camiseta.getPreco();
                    System.out.print("CÓDIGO:     ");
                    System.out.print("PRODUTO:        ");
                    System.out.println("VALOR FINAL:");
                    System.out.print(camiseta.getCodigo() +"         ");
                    System.out.print(camiseta.getNome() +"         ");
                    System.out.print(valorFinal);
                }
                break;
            case 2:
                System.out.println(calca.getNome()+":");
                System.out.println("QUANTIDADE DE ESTOQUE: "+calca.getQuantidade());
                System.out.println("PREÇO: " +calca.getPreco());
                System.out.println("DIGITE A QUANTIDADE QUE DESEJA COMPRAR:");
                if(calca.saida(quantidade=sc.nextInt())){
                    valorFinal= quantidade * calca.getPreco();
                    System.out.print("CÓDIGO:     ");
                    System.out.print("PRODUTO:        ");
                    System.out.println("VALOR FINAL:");
                    System.out.print(calca.getCodigo() +"         ");
                    System.out.print(calca.getNome() +"         ");
                    System.out.print(valorFinal);
                }
                break;
            case 3:
                System.out.println(tenis.getNome()+":");
                System.out.println("QUANTIDADE DE ESTOQUE: "+tenis.getQuantidade());
                System.out.println("PREÇO: " +tenis.getPreco());
                System.out.println("DIGITE A QUANTIDADE QUE DESEJA COMPRAR:");
                if(tenis.saida(quantidade=sc.nextInt())){
                    valorFinal= quantidade * tenis.getPreco();
                    System.out.print("CÓDIGO:     ");
                    System.out.print("PRODUTO:        ");
                    System.out.println("VALOR FINAL:");
                    System.out.print(tenis.getCodigo() +"         ");
                    System.out.print(tenis.getNome() +"         ");
                    System.out.print(valorFinal);
                }
                break;
            default:
                System.out.println("DIGITE UM CODIGO VALIDO");
        }
    }
}