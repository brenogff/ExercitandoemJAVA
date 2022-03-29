import java.util.Scanner;

/*Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um mês.
Considere fixo o juro da poupança em 0,07% a. m;*/

public class Exercicio09 {
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);

        double valorDeposito, valorRendimento = 0.07, valorFinal,resultado;

        System.out.println("Digite o valor depositado: ");
        valorDeposito = leitor.nextDouble();

        valorFinal = valorDeposito * valorRendimento;

        resultado = valorFinal + valorDeposito;

        System.out.println("O valor com rendimento apos um mes sera: " + resultado);

        leitor.close();
    }
}
