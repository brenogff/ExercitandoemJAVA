import java.util.Scanner;

/*Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. 
Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;*/

public class Exercicio11 {
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);

        double precoCusto, precoVenda, precoFinal;
        int porcentagem;

        System.out.println("Digite o preco de custo do produto: ");
        precoCusto = leitor.nextDouble();
        System.out.println("Qual a porcentagem de acrescimo no valor do produto %: ");
        porcentagem = leitor.nextInt();
        
        precoVenda = (precoCusto * porcentagem) /100;

        precoFinal = precoCusto + precoVenda;

        System.out.println("O valor de venda desse produto sera: " + precoFinal);

        leitor.close();
    }
    
}
