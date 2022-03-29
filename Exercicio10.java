import java.util.Scanner;

/*A Loja Mamão com Açúcar está vendendo seus produtos em5(cinco)prestações sem juros. 
Faça um algoritmo que receba um valor de uma compra e mostre o valor das prestações;*/

public class Exercicio10 {
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);

        double valorCompra, valorPrestacoes, resultado;

        System.out.println("Digite o valor da compra: ");
        valorCompra = leitor.nextDouble();
        System.out.println("Gostaria de dividir em quantas parcelas: ");
        valorPrestacoes = leitor.nextDouble();

        resultado = valorCompra / valorPrestacoes;

        System.out.println("O valor de cada prestacao sera: " + resultado);

        leitor.close();
    }
}
