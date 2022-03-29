import java.util.Scanner;

//Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos dois números lidos

public class Exercicio02 {
    public static void main (String[] args){
        Scanner leitor =  new Scanner(System.in);

        float a, b, soma, subtracao, multiplicacao, divisao;

        System.out.println("Digite um numero");
        a = leitor.nextFloat();
        System.out.println("Digite outro numero");
        b = leitor.nextFloat();

        soma = a + b; 
        subtracao = a - b; 
        multiplicacao = a * b;
        divisao = a / b;

        System.out.println("A soma dos numeros foi: " + soma);
        System.out.println("A subtracao dos numeros foi: " + subtracao);
        System.out.println("A multiplicacao dos numeros foi: " + multiplicacao);
        System.out.println("A divisao dos numeros foi: " + divisao);

        leitor.close();

    }
    
}
